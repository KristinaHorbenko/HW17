package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {

    @Test
    void arrayTestFirst() {
        assertArrayEquals(new int[] {1,7}, ArrayManipulation.array(new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }
    @Test
    void arrayTestSecond() {
        assertArrayEquals(new int []{}, ArrayManipulation.array(new int[] {1, 2, 3, 4}));
    }

    @Test
    void arrayTestThird() {
        assertArrayEquals(new int[]{}, ArrayManipulation.array(new int[]{4, 4, 4, 4}));
    }


    @Test
    void arrayTestFourth() {
        assertThrows(RuntimeException.class, () -> ArrayManipulation.array(new int [] {1, 2, 3, 5}));
    }

    @Test
    void checkArrayTestFirst() {
        assertTrue(ArrayManipulation.checkArray(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    void checkArrayTestSecond() {
        assertFalse(ArrayManipulation.checkArray(new int[] {4, 4, 4, 4}));
    }

    @Test
    void checkArrayTestThird() {
        assertFalse(ArrayManipulation.checkArray(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void checkArrayTestFourth() {
        assertTrue(ArrayManipulation.checkArray(new int[] {1, 4, 4, 1, 1, 4, 3}));
    }
}