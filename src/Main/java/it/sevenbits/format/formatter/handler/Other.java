package it.sevenbits.format.formatter.handler;

import it.sevenbits.format.formatter.Handler;
import it.sevenbits.format.streams.OutStream;

import java.io.IOException;

/**
 * Created by Gradus on 08.07.2015.
 */
public class Other implements Handler {
    public boolean canDo(char symbol) {
        return true;
    }
    public void processedSymbol(char symbol, OutStream out) throws IOException {
        if(symbol!='\r'&&symbol!='\n')
        out.writeSymbol(symbol);
    }
}
