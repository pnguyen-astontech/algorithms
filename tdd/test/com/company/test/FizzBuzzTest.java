package com.company.test;

import com.company.FizzBuzz;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by petenguy1 on 11/22/2016.
 */
public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static String[] strings;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        FizzBuzz.main(null);
        strings = outContent.toString().split("\r\n");
    }

    @After
    public void cleanUpStream() {
        System.setOut(null);
    }

    @Test
    public void testStringArrayLength() {
        assertEquals(100, strings.length);
    }

    // region 1 - 10

    @Test
    public void testFizzBuzzOne() {
        assertEquals("1", strings[0]);
    }

    @Test
    public void testFizzBuzzTwo() {
        assertEquals("2", strings[1]);
    }

    @Test
    public void testFizzBuzzThree() {
        assertEquals("Fizz", strings[2]);
    }

    @Test
    public void testFizzBuzzFour() {
        assertEquals("4", strings[3]);
    }

    @Test
    public void testFizzBuzzFive() {
        assertEquals("Buzz", strings[4]);
    }

    @Test
    public void testFizzBuzzSiz() {
        assertEquals("Fizz", strings[5]);
    }

    @Test
    public void testFizzBuzzSeven() {
        assertEquals("7", strings[6]);
    }

    @Test
    public void testFizzBuzzNine() {
        assertEquals("Fizz", strings[8]);
    }

    @Test
    public void testFizzBuzzTen() {
        assertEquals("Buzz", strings[9]);
    }

    // endregion

    // region 14, 15, 16,

    @Test
    public void testFizzBuzz14() {
        assertEquals("14", strings[13]);
    }

    @Test
    public void testFizzBuzz15() {
        assertEquals("FizzBuzz", strings[14]);
    }

    @Test
    public void testFizzBuzz16() {
        assertEquals("16", strings[15]);
    }

    // endregion

    // region SPECIAL CASES

    @Test
    public void testFizzBuzz30() {
        assertEquals("FizzBuzz", strings[29]);
    }

    @Test
    public void testFizzBuzz100() {
        assertEquals("Buzz", strings[99]);
    }

    @Test
    public void testFizzBuzz101() {
        Exception e = null;

        try {
            assertEquals("", strings[100]);
        } catch (Exception ex) {
            e = ex;
        }

        assertNotNull(e);
    }

    // endregion

    @Test
    public void testFizzBuzzMethod() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(900));
    }
}
