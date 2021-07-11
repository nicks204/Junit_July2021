package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunitTest {
	
	
	@BeforeAll
	public static void beforeAllMethod() {
		
		System.out.println("Inside before All");
	}
	
	@BeforeEach
	public void beforeEachMethod() {
		
		System.out.println("Inside before each");
	}
	
	
	@Test
	public void testcase1() {
		
		boolean flag = false;
		
		Assert.assertTrue(flag);
	}
	
	@AfterEach
	public void afterEach() {
		
		System.out.println("Inside after each");
	}
	
	

}
