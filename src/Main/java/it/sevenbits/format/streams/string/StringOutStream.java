package it.sevenbits.format.streams.string;

import it.sevenbits.format.streams.OutStream;

import java.io.IOException;

/**
 * Created by Gradus on 28.06.2015.
 */
public class StringOutStream implements OutStream {

    String string;

    public StringOutStream(){
        string="";
    }

    //@Override
    public void writeSymbol(char c) throws IOException {
        string+=c;
    }

    //@Override
    public void writeString(String string) throws IOException {
        this.string+=string;
    }

    //@Override
    public String getString() {
        return string;
    }

    //@Override
    public void close() throws IOException {

    }
}