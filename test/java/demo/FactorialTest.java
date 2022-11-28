package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Dividing;
import Operations.Factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class FactorialTest {

Factorial f = new Factorial();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSub() {
        assertEquals(120, f.calculateFactorial(5), "Successful");
        
        
        
    }
}
