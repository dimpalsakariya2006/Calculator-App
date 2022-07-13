package com.miit.calculatorapp.calculatorapp;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase 
{
	
	@Test 
	public void testadd()
	{
		Calculator c = new Calculator();
		assertEquals(6, c.add( 3, 3));
		
	}
	@Test
	public void testsub()
	{
		Calculator c = new Calculator();
		assertEquals(0, c.sub( 3, 3));
		
	}	
	@Test
	public void testmul()
	{
		Calculator c = new Calculator();
		assertEquals(9, c.mul( 3, 3));
		
	}	
	@Test
	public void testdiv()
	{
		Calculator c = new Calculator();
		assertEquals(1, c.div( 3, 3));
		
	}	
	
	

}
