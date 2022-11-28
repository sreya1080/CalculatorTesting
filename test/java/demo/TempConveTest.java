package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BitwiseCalculation.LeftRotate;
import Conversion.TempConversion;
public class TempConveTest {
	TempConversion temp=new TempConversion();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals("98.60",temp.CtoF((float) 37), "Successful");
	        assertEquals("37.00",temp.FtoC((float) 98.6),"Successful");
	        assertNotEquals("105.00",temp.CtoF((float)65),"Sucessful");
            assertEquals("65.00",temp.FtoC((float)66),"Failure");

	    }

}
