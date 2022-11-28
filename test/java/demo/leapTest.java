package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.LeapYear;
import Operations.sumOFDigits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.InputStream;

public class leapTest {
	LeapYear checkLeap = new LeapYear();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testLeap() {
    	
        assertEquals(true, checkLeap.isLeap(2024), "Successful");
        assertEquals(false, checkLeap.isLeap(2022), "Successful");

    }

}
