package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BitwiseCalculation.Powerof2;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Powerof2Test {
	Powerof2 p=new Powerof2();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals(3, p.nextPowerOf2(17), "Successful");
	      
	        assertEquals(32, p.nextPowerOf2(4), "Successful");
	        assertNotEquals(4,p.nextPowerOf2(16),"SucessFul");

	    }
}
