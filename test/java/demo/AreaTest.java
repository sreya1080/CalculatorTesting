package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Geometry.Area;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AreaTest {

Area a = new Area();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSub() {
        assertEquals(104.0, a.TriangleArea(16.0, 13.0), "Successful");
        assertNotEquals(100.0, a.TriangleArea(25.0, 3.0));
        
        assertEquals(288.00, a.RectangleArea(16.0, 18.0));
        assertNotEquals(50, a.RectangleArea(16, 7));
        
        assertEquals(28.00, a.CircleArea(3.0));
        assertEquals(50.00, a.CircleArea(4.0));
        
        assertNotEquals(42, a.CircleArea(4.0)); 
       
    }
}



