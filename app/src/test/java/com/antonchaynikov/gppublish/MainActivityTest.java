package com.antonchaynikov.gppublish;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class MainActivityTest {
    private Calculator testSubject;

    @Before
    public void setUp() {
        testSubject = new Calculator();
    }

    @Test
    public void squareShouldReturnSquare() throws Exception {
        assertEquals(4, testSubject.square(2));
        assertEquals(4, testSubject.square(-2));
        assertEquals(0, testSubject.square(0));
    }
}