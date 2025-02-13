package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstrainTest {
	private Range exampleRange;
	@BeforeEach
	void setUp() throws Exception {
		exampleRange = new Range(1, 5); // Example range [1,5]
    }

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    void testConstrainWithinRange() {
		
		Range actual = exampleRange.constrain(3);
		Range expected = 3;
		
        assertEquals(expected, actual);
    }

    @Test
    void testConstrainBelowRange() {
    	
    Range actual = exampleRange.constrain(0);
	Range expected = 1;
	
    assertEquals(expected, actual);;
    }

    @Test
    void testConstrainAboveRange() {
    	Range actual = exampleRange.constrain(7);
		Range expected = 5;
		
        assertEquals(expected, actual);
    }

    @Test
    void testConstrainAtLowerBound() {
    	Range actual = exampleRange.constrain(1);
		Range expected = 1;
		
        assertEquals(expected, actual);
    }

    @Test
    void testConstrainAtUpperBound() {
    	Range actual = exampleRange.constrain(5);
		Range expected = 5;
		
        assertEquals(expected, actual);
    }
}
