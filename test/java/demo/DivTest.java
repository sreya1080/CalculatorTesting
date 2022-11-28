package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Dividing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DivTest {

Dividing by = new Dividing();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSub() {
        assertEquals(3, by.div(39, 13), "Successful");
        assertEquals(2.0, by.div(96.0, 48.0));
        
        assertNotEquals(5, by.div(16, 7));
    }
}
