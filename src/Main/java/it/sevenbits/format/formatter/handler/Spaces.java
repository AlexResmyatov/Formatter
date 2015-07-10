package it.sevenbits.format.formatter.handler;

import it.sevenbits.format.formatter.Format;
import it.sevenbits.format.formatter.Handler;
import it.sevenbits.format.streams.OutStream;

import java.io.IOException;

/**
 * Created by Gradus on 30.06.2015.
 */
public class Spaces implements Handler {

    public boolean canDo(char symbol) {
        if(symbol ==' ')return true;
        return false;
    }
    public void processedSymbol(char symbol, OutStream out) throws IOException {
        if(Format.getIndent()==false){
            out.writeSymbol(symbol);
            Format.setIndent(true);
        }
    }
}
