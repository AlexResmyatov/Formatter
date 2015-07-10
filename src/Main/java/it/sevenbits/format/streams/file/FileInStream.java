package it.sevenbits.format.streams.file;

import it.sevenbits.format.streams.InStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Gradus on 27.06.2015.
 */
public class FileInStream implements InStream {

    BufferedReader br;

    public FileInStream(String string) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(string));
    }
    //@Override
    public char readSymbol() throws IOException {
        return (char)br.read();
    }

    //@Override
    public boolean isReady() throws IOException {
        return br.ready();
    }


}
