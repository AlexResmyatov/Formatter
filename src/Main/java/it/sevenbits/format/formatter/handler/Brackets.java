package it.sevenbits.format.formatter.handler;

import it.sevenbits.format.formatter.Format;
import it.sevenbits.format.formatter.Handler;
import it.sevenbits.format.streams.OutStream;

import java.io.IOException;

/**
 * Created by Gradus on 30.06.2015.
 */
public class Brackets implements Handler {
    public boolean canDo(char symbol) {
        if(symbol=='{' || symbol =='}')return true;
        return false;
    }
    public void processedSymbol(char symbol, OutStream out) throws IOException {
        //System.out.print("sfsd");
        if(symbol=='{'){
            //Format2.countTab++;
            out.writeString("{\n");
            Format.tabber(out, 1);
            Format.setIndent(true);

        }
        else if(symbol=='}'){
            out.writeSymbol('\n');
            Format.tabber(out, -1);
            out.writeString("}\n");
            Format.tabber(out, 0);
            Format.setIndent(true);
        }

        Format.setLastSymbol(symbol);
    }


}
