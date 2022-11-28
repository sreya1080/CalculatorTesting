package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Multiplications;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.InputStream;

public class MulTest {

Multiplications into = new Multiplications();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testMul() {
        assertEquals(88, into.multiply(11, 8), "Successful");
        assertEquals(70.0, into.multiply(7.0, 10.0), "Successful");
        
        assertNotEquals(17, into.multiply(6, 4));
    }

}