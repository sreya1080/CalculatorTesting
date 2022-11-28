package demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BitwiseCalculation.RightRotate;


public class RightRotateTest {

	 RightRotate p=new RightRotate();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals(9, p.rightRotate(36,2), "Successful");
	        assertEquals(1, p.rightRotate(16,4), "Successful");
	   

	    }

}

