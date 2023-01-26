package com.testing.lang;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	final void testLength() {
		System.out.println("Testing length " + myString);
		assertTrue(8==myString.length());
		assertFalse(9==myString.length());
	}

	@Test
	final void testSubstring() {
		System.out.println("Testing substring " + myString);
		System.out.println("Testing substring " + myString.substring(0,4));
		
		assertEquals("1234",myString.substring(0,4));
		assertNotEquals("1235",myString.substring(0,4));
		Supplier<String> messageSupplier  = () -> "Substring 0,4 test failed";
		//make it fail to check supplier
		System.out.println("Testing substring message " + messageSupplier.get());
		assertNotEquals("5", myString.substring(0,4), messageSupplier);
		
	}

	
}
