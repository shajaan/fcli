package com.fortify.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class FortifyCLITest {

    @Test
    public void testWithCommandLineOption() throws Exception {
    	/*
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        String[] args = new String[] { "-v" };
        FortifyCLI.main(args);

        // fcli
        assertTrue(baos.toString().contains("Hi!"));
        */
    }
}
