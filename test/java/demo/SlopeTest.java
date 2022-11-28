package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Geometry.Area;
import Geometry.Slope;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SlopeTest {

Slope m = new Slope();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSub() {
        assertEquals(3.0, m.slope(4,2,6,8), "Successful");
        assertEquals(5.0, m.slope(3,5,6,20), "Successful");
        
        assertNotEquals(3.0, m.slope(4,2,7,8), "Successful");

    }
}
