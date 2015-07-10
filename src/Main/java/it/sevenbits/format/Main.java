package it.sevenbits.format;

import it.sevenbits.format.formatter.Format;
import it.sevenbits.format.streams.InStream;
import it.sevenbits.format.streams.OutStream;
import it.sevenbits.format.streams.file.FileInStream;
import it.sevenbits.format.streams.file.FileOutStream;
import it.sevenbits.format.streams.string.StringInStream;
import it.sevenbits.format.streams.string.StringOutStream;

import java.io.IOException;

/**
 * Created by Gradus on 27.06.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        InStream in = new FileInStream("in.txt");
        OutStream out = new FileOutStream("out.txt");

        InStream ins = new StringInStream("{}");
        OutStream outs = new StringOutStream();

        Format.format(in, outs);
        System.out.print(outs.getString());
        out.close();

    }
}
