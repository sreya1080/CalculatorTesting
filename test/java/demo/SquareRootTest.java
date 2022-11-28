package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Dividing;
import Operations.Factorial;
import Operations.SquareRoot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
public class SquareRootTest {
	
	SquareRoot by = new SquareRoot();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSub() {
        assertEquals(3, by.sqrt(9), "Successful");
    
        
        
    }

}
