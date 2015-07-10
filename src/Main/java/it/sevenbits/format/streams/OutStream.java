package it.sevenbits.format.streams;

import java.io.IOException;

/**
 * Created by Gradus on 27.06.2015.
 */
public interface OutStream {

    void writeSymbol(char c) throws IOException;
    void writeString(String string) throws IOException;
    String getString();
    void close() throws IOException;
}
