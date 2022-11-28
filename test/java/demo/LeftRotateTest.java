package demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BitwiseCalculation.LeftRotate;
public class LeftRotateTest {

	LeftRotate p=new LeftRotate();
	 @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void testPrimeNumber() {
	    	
	        assertEquals(136, p.leftRotate(17,3), "Successful");
	        assertEquals(64, p.leftRotate(16,2), "Successful");
	   

	    }

}
