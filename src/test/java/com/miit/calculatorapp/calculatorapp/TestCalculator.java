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

}
