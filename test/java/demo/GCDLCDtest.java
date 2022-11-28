package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.GCDLCD;
import Operations.LeapYear;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;



public class GCDLCDtest {
	
	GCDLCD g = new GCDLCD();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testLeap() {
    	
        assertEquals(2, g.gcd(4,6), "Successful");
        int l=g.gcd(4, 6);
        assertEquals(18, g.lcm(6,9,l), "Successful");

    }

}
