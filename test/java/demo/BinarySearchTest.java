package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.BinarySearch;
import Operations.Dividing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BinarySearchTest {
	
	

	BinarySearch b1 = new BinarySearch();

	    @BeforeEach
	    void setUp() {
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @Test
	    public void binarySearchTest() {
	    	int arr[]= {1,5,6,8,9,10};
	        assertEquals(false, b1.binarySearch(arr, 0, 6, 5), "Successful");
	    
	    }
	}



