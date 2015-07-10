package it.sevenbits.format.formatter.handler;

import it.sevenbits.format.formatter.Format;
import it.sevenbits.format.formatter.Handler;
import it.sevenbits.format.streams.OutStream;

import java.io.IOException;

/**
 * Created by Gradus on 30.06.2015.
 */
public class Semicolons implements Handler {
    public boolean canDo(char symbol) {
        if(symbol==';')return true;
        return false;
    }
    public void processedSymbol(char symbol, OutStream out) throws IOException {
            out.writeString(";\n");
            Format.tabber(out, 0);
            Format.setLastSymbol(symbol);
            Format.setIndent(true);
    }
}
