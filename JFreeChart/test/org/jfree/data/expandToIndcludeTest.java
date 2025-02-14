package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class expandToIndcludeTest {
<<<<<<< HEAD
//	Range exampleRange;
//	@BeforeEach
//	void setUp() throws Exception {
//		exampleRange = new Range(2, 6);
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	 @Test
//	    void testExpandToIncludeInsideRange() {
//	        Range result = Range.expandToInclude(exampleRange, 4);
//	        
//	        Range actualLowerBound = result.getLowerBound();
//	        Range expectedLowerBound = 2;
//	        
//	        Range actualUpperBound = result.getUpperBound();
//	        Range expectedUpperBound = 6;
//	        
//	        assertEquals(expectedLowerBound, actualLowerBound);
//	        assertEquals(expectedUpperBound, actualUpperBound);
//	    }
//
//	    @Test
//	    void testExpandToIncludeBelowRange() {
//	    	
//	    	Range result = Range.expandToInclude(exampleRange, 1);
//	        
//	        Range actualLowerBound = result.getLowerBound();
//	        Range expectedLowerBound = 1;
//	        
//	        Range actualUpperBound = result.getUpperBound();
//	        Range expectedUpperBound = 6;
//	        
//	        assertEquals(expectedLowerBound, actualLowerBound);
//	        assertEquals(expectedUpperBound, actualUpperBound);
//	    }
//
//	    @Test
//	    void testExpandToIncludeAboveRange() {
//	    	
//	    	Range result = Range.expandToInclude(exampleRange, 8);
//	        
//	        Range actualLowerBound = result.getLowerBound();
//	        Range expectedLowerBound = 2;
//	        
//	        Range actualUpperBound = result.getUpperBound();
//	        Range expectedUpperBound = 8;
//	        
//	        assertEquals(expectedLowerBound, actualLowerBound);
//	        assertEquals(expectedUpperBound, actualUpperBound);
//	    	
//	    }
//
//	    @Test
//	    void testExpandToIncludeNullRange() {
//	    	
//	    	Range result = Range.expandToInclude(null, 5);
//	        
//	        Range actualLowerBound = result.getLowerBound();
//	        Range expectedLowerBound = 5;
//	        
//	        Range actualUpperBound = result.getUpperBound();
//	        Range expectedUpperBound = 5;
//	        
//	        assertEquals(expectedLowerBound, actualLowerBound);
//	        assertEquals(expectedUpperBound, actualUpperBound);
//	    }
=======
	Range exampleRange;
	@BeforeEach
	void setUp() throws Exception {
			exampleRange = new Range(2, 6);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	 @Test
	    void testExpandToIncludeInsideRange() {
	        Range result = Range.expandToInclude(exampleRange, 4);
	        
	        Range expectedRange = new Range(2,6);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    }

	    @Test
	    void testExpandToIncludeBelowRange() {
	    	
	    	Range result = Range.expandToInclude(exampleRange, 1);
	    	  
	        Range expectedRange = new Range(1,6);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    }

	    @Test
	    void testExpandToIncludeAboveRange() {
	    	
	    	Range result = Range.expandToInclude(exampleRange, 8);
	        
	    	  
	        Range expectedRange = new Range(2,8);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    	
	    }

	    @Test
	    void testExpandToIncludeNullRange() {
	    	
	    	Range result = Range.expandToInclude(null, 5);
	        
	        Range expectedRange = new Range(5,5);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    	
	    }
>>>>>>> 405d68cef16caf8071a56da95513bcd57ee34d13

}
