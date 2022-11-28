package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BitwiseCalculation.Powerof2;
import BitwiseCalculation.Powerof4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Powerof4Test {
	
	Powerof4 p=new Powerof4();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals(1, p.isPowerOfFour(16), "Successful");
	      
	        assertEquals(0, p.isPowerOfFour(6), "Successful");
	        
	        assertNotEquals(1,p.isPowerOfFour(17),"SucessFul");

	    }
}


