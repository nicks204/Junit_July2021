package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;

public class AssumptionsExample {
	
	@BeforeAll
	public static void setup() {
		
		System.setProperty("ENV", "PROD");
		
		
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunctions.isPalindrome("madam"));
		
		
	}
	
	
	@Test
	public void test2() {
		
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}

}
