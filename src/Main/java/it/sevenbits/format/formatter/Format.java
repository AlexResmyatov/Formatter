package it.sevenbits.format.formatter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import it.sevenbits.format.formatter.handler.*;
import it.sevenbits.format.streams.InStream;
import it.sevenbits.format.streams.OutStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Gradus on 30.06.2015.
 */
public class Format {



    private static String TAB = "    ";
    private static char charTab;
    private static int countTab=0;
    private static char lastSymbol;
    private static boolean indent=true;
    private static Properties pr = new Properties();
    public static void tabber(OutStream out,int deltaTab) throws IOException {
        countTab+=deltaTab;
        for(int i=0;i<countTab;i++){
            for(int j=0;j<Integer.parseInt(pr.getProperty("TabLength"));j++){
                out.writeSymbol(pr.getProperty("TabChar").charAt(1));
            }
           // out.writeString(TAB);
        }
    }

    public static void format(InStream in, OutStream out) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

       // Properties pr = new Properties();
        pr.load(new FileInputStream(new File("pr.properties")));
        //charTab=pr.getProperty("TabChar").charAt(1);
        String jsonFileName=pr.getProperty("JsonFileName");

        char symbol;
        ArrayList<Handler> handler= new ArrayList<Handler>();
        Gson gson = new Gson();
        JsonReader jreader = new JsonReader(new FileReader(new File(jsonFileName)));
        ArrayList<String> handlerNames = gson.fromJson(jreader,new TypeToken<List<String>>(){}.getType());
        for (int i = 0; i < handlerNames.size(); i++) {
            Class c = Class.forName(handlerNames.get(i));

            Object o = c.newInstance();
            handler.add((Handler) o);
        }

        while(in.isReady()){

            symbol = in.readSymbol();

            for(int i=0;i<handler.size();i++){
                if(handler.get(i).canDo(symbol)){
                    handler.get(i).processedSymbol(symbol,out);
                    break;
                }

            }
        }
    }

    static public int getCountTab(){
        return countTab;
    }
    public static void setLastSymbol(char newSymbol){
        lastSymbol=newSymbol;
    }

    public static char getLastSymbol(){
        return lastSymbol;
    }

    public static boolean getIndent(){
        return  indent;
    }

    public static void setIndent(boolean indent){
        Format.indent=indent;
    }
}
