package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Addition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;



class AddTest {

Addition plus = new Addition();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testAdd() {
        assertEquals(20, plus.plus(12, 8), "Add Successful");
        assertEquals(56, plus.plus(16, 40));
        
        assertNotEquals(50, plus.plus(16, 40));
    }

}
