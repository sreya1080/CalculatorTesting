package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Operations.isPrime;

public class isPrimeTest {
	isPrime p = new isPrime();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testPrimeNumber() {
    	
        assertEquals(true, p.isPrimeNumber(17), "Successful");
      
        assertEquals(true, p.isPrimeNumber(66), "Successful");

    }

}
