package demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BitwiseCalculation.countSetBits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class countSetBitsTest {
countSetBits c=new countSetBits();
@BeforeEach
void setUp() {
}

@AfterEach
void tearDown() {
}

@Test
public void testSub() {
    assertEquals(2, c. countSetBits(3), "Successful");
    assertEquals(4,c.countSetBits(13),"Sucessfull");
    
}
}
