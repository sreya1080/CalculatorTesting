package demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geometry.checkTraingleValidity;

public class TriangleValiditytest {
	checkTraingleValidity c=new checkTraingleValidity();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals(1, c.checkValidity(4,5,6), "Successful");
	        assertEquals(1, c.checkValidity(1,4,2), "Successful");
	   

	    }


}
