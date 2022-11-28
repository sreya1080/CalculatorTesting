package demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Conversion.WeightConversion;

public class WeightConvTest {
	
	WeightConversion wt=new WeightConversion();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals("99.21",wt.KtoP((float) 45), "Successful");
	        assertEquals("45.36",wt.PtoK((float) 100),"Successful");

            assertEquals("145.51",wt.KtoP((float)66),"Failure");

	    }

}

