package it.sevenbits.format.streams.file;

import it.sevenbits.format.streams.OutStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Gradus on 27.06.2015.
 */
public class FileOutStream implements OutStream {

    BufferedWriter bw;

    public FileOutStream(String string) throws IOException {
        bw = new BufferedWriter(new FileWriter(string));
    }

    //@Override
    public void writeSymbol(char c) throws IOException {
        bw.write(c);
    }

    //@Override
    public void writeString(String string) throws IOException {
        bw.write(string);
    }

    //@Override
    public String getString(){
        return null;
    }

    //@Override
    public void close() throws IOException {
        bw.close();
    }
}
