package edu.teamrocket.golfstrokes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HoleTest {

    private Hole hole;

    @BeforeEach
    void setUp() {
        hole = new Hole((byte) 1, (byte) 4);
    }

    @Test
    void constructorCreatesHoleObject() {
        assertNotNull(hole);
    }

    @Test
    void testConstructor() {
        assertEquals((byte) 1, hole.getNumber());
        assertEquals((byte) 4, hole.getPar());
    }

    @Test
    void testGetNumber() {
        assertEquals((byte) 1, hole.getNumber());
    }

    @Test
    void testGetPar() {
        assertEquals((byte) 4, hole.getPar());
    }
}
