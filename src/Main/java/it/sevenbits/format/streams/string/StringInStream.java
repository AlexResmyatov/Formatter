package it.sevenbits.format.streams.string;

import it.sevenbits.format.streams.InStream;

import java.io.IOException;

/**
 * Created by Gradus on 28.06.2015.
 */
public class StringInStream implements InStream {

    String string;
    int numberSymbol=0;
    char symbol;

    public StringInStream(String string){
        this.string=string;
    }

    //@Override
    public char readSymbol() throws IOException {
        if(numberSymbol!=string.length()) {
            symbol = string.charAt(numberSymbol);
            numberSymbol++;
            return symbol;
        }
        else return symbol;
    }

    //@Override
    public boolean isReady() throws IOException {
        if(numberSymbol==string.length()){
            return false;
        }
        else{
            return true;
        }

    }
}
