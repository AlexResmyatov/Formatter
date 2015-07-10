package it.sevenbits.format.formatter;

import it.sevenbits.format.streams.OutStream;

import java.io.IOException;

/**
 * Created by Gradus on 30.06.2015.
 */
public interface Handler {

    //public boolean canDo(char symbol);
    public void processedSymbol(char symbol, OutStream out) throws IOException;
    public boolean canDo(char symbol);
}
