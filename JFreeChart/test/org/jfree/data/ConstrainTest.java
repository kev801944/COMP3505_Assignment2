package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstrainTest {
<<<<<<< HEAD
//	private Range exampleRange;
//	@BeforeEach
//	void setUp() throws Exception {
//		exampleRange = new Range(1, 5); 
//    }
//
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//    void testConstrainWithinRange() {
//		
//		Range actual = exampleRange.constrain(3);
//		Range expected = 3;
//		
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testConstrainBelowRange() {
//    	
//    Range actual = exampleRange.constrain(0);
//	Range expected = 1;
//	
//    assertEquals(expected, actual);;
//    }
//
//    @Test
//    void testConstrainAboveRange() {
//    	Range actual = exampleRange.constrain(7);
//		Range expected = 5;
//		
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testConstrainAtLowerBound() {
//    	Range actual = exampleRange.constrain(1);
//		Range expected = 1;
//		
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testConstrainAtUpperBound() {
//    	Range actual = exampleRange.constrain(5);
//		Range expected = 5;
//		
//        assertEquals(expected, actual);
//    }
=======
	private Range exampleRange;
	@BeforeEach
	void setUp() throws Exception {
		exampleRange = new Range(1, 5); 
    }


	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    void testConstrainWithinRange() {
		
		double actual = exampleRange.constrain(3);
		double expected = 3.0;
		
        assertEquals(expected, actual);
    }

    @Test
    void testConstrainBelowRange() {
    	
    double actual = exampleRange.constrain(0);
	double expected = 1.0;
	
    assertEquals(expected, actual);;
    }

    @Test
    void testConstrainAboveRange() {
    	double actual = exampleRange.constrain(7);
		double expected = 5;
		
        assertEquals(expected, actual);
    }

    @Test
    void testConstrainAtLowerBound() {
    	double actual = exampleRange.constrain(1);
		double expected = 1;
		
        assertEquals(expected, actual);
    }

    @Test
    void testConstrainAtUpperBound() {
    	double actual = exampleRange.constrain(5);
		double expected = 5;
		
        assertEquals(expected, actual);
    }
>>>>>>> 405d68cef16caf8071a56da95513bcd57ee34d13
}
