package it.sevenbits.format.streams;

import java.io.IOException;

/**
 * Created by Gradus on 27.06.2015.
 */
public interface InStream {

    char readSymbol() throws IOException;

    boolean isReady() throws IOException;
}
