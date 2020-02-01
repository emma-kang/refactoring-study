package com.ekang.refactoring.chapter1;

// jUnit4 practice
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void getPriceCode() {
        Movie testMovie = new Movie("Frozen", 3);
        assertEquals(3, testMovie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Movie testMovie = new Movie("Frozen", 3);
        assertEquals("Frozen", testMovie.getTitle());
    }
}