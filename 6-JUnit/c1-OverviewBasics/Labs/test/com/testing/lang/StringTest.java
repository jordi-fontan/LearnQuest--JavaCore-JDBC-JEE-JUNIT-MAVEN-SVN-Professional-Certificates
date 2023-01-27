package com.testing.lang;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Supplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 *  Class showing the basics of JUnit
 *  Also includes @Displayname and Supplier func Interface
 *  Version 2: Adds Grouped Assertions
 */

@DisplayName("Testing Java Strings!!")
class StringTest {
	String myString;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myString="12345678";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("String length Test")
	final void testLength() {
		
		// Trace length test to check test order
		System.out.println("Testing length " + myString); 
		
		// Check for succeed and fail
		assertTrue(8==myString.length());
		assertFalse(9==myString.length());
	}

	@Test
	@DisplayName("SubString Test")
	final void testSubstring() {
		
		// Trace substring test
		System.out.println("Testing substring " + myString);
		System.out.println("Testing substring " + myString.substring(0,4));
		
		// Check for succeed and fail
		
		assertEquals("1234",myString.substring(0,4));
		assertNotEquals("1235",myString.substring(0,4));
		
		// Testing Supplier lambda
		
		Supplier<String> messageSupplier  = () -> "Substring 0,4 test failed";
		//make it fail to check supplier
		System.out.println("Testing substring message " + messageSupplier.get());
		assertNotEquals("5", myString.substring(0,4), messageSupplier);
		
	}
	
	@Test
	@DisplayName("Grouped Assertion")
	void groupedAssertion() {
		
		// Include Both test in a grouped Assertion and make the first fail
		assertAll(" Both String Methods",
				()->assertEquals("0234",(myString.substring(0,4))),
				()->assertEquals(7,myString.length()));
		
	}
	

	
}
