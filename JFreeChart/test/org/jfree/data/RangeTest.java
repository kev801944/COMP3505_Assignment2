package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
<<<<<<< HEAD
=======

>>>>>>> 9be3dd85afb42adbef7ee92f4fdb5b9524353a35
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeTest {
<<<<<<< HEAD
  	private Range exampleRange;
  	@BeforeAll
  	static void setUpBeforeClass() throws Exception {
  	}
  	@BeforeEach
  	void setUp() throws Exception {
  	}
  	
  	@Test                	
  	void test() {
  		exampleRange = new Range(-1,1);
  		assertEquals(0, exampleRange.getCentralValue());
  	}
  	@AfterEach
  	void tearDown() throws Exception {
  	}
  	@AfterAll
  	static void tearDownAfterClass() throws Exception {
  	}
	
=======
	private Range exampleRange;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		exampleRange = new Range(-1,1);
 		assertEquals(0, exampleRange.getCentralValue(),0.1d,"The central value of (-1,1) is 0");
	}

>>>>>>> 9be3dd85afb42adbef7ee92f4fdb5b9524353a35
}
