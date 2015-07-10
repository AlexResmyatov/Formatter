package it.sevenbits.format.tests;

import it.sevenbits.format.formatter.Format;
import it.sevenbits.format.streams.InStream;
import it.sevenbits.format.streams.OutStream;
import it.sevenbits.format.streams.string.StringInStream;
import it.sevenbits.format.streams.string.StringOutStream;
import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gradus on 28.06.2015.
 */
public class FormatTest {
    @Test
    public void emptyStringTest() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        InStream sr = new StringInStream("{}");
        OutStream sw = new StringOutStream();
        //FormatSettings formatSettings = new FormatSettings();

        Format.format(sr, sw);

        assertEquals("{\n    \n}", sw.getString());
    }
    @Test
    public void emptyStringTest1() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        InStream sr = new StringInStream("sf sgf sgfh");
        OutStream sw = new StringOutStream();
        //FormatSettings formatSettings = new FormatSettings();

        Format.format(sr, sw);

        assertEquals("sf sgf sgfh", sw.getString());
    }

}
