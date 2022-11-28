package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Subtracting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SubTest {

Subtracting minus = new Subtracting();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSub() {
        assertEquals(7, minus.subt(20, 13), "Successful");
        assertEquals(8.0, minus.subt(56.0, 48.0));
        
        assertNotEquals(5, minus.subt(16, 7));
    }

}
