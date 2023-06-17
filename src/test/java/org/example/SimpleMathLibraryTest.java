package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {

    @Test
    void add() { assertEquals(5, new SimpleMathLibrary().add(2,3));

    }

    @Test
    void minus() { assertEquals(3, new SimpleMathLibrary().minus(10, 7));
    }

}