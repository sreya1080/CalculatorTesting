package demo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.sumOFDigits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.InputStream;

public class SumDigTest {

	sumOFDigits digSum = new sumOFDigits();

	    @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testAdd() {
	        assertEquals(19, digSum.getSum(658), "Successful");
	        
	        assertNotEquals(50, digSum.getSum(87));
	    }

	}

