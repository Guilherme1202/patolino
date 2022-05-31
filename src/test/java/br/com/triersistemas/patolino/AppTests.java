package br.com.triersistemas.patolino;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTests {

    @Test
    void mainTest() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        final String[] args = { "Olá" };
        App.main(args);
        assertEquals("[Olá]" + System.lineSeparator(), outContent.toString());
    }
}
