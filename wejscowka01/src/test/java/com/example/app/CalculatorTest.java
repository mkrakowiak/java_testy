package com.example.app;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.example.app.Calculator;

public class CalculatorTest {
	
	private Calculator calc = new Calculator();
	@Test
	public void addCheck(){	
		assertEquals(5, calc.add(3,2));
		
	}
	@Test
	public void addSub(){
		assertEquals(1, calc.sub(3,2));
		
	}
	@Test
	public void multiCheck(){
		assertEquals(6, calc.multi(3,2));
		
	}
	@Test
	public void divCheck(){
		assertEquals(1, calc.div(3,2));
		
	}
	@Test
	public void greaterCheck(){
		assertEquals(true, calc.greater(3,2));
		
	}
	
	@Test (expected = ArithmeticException.class) 
	public void div2Check(){
		assertEquals(6, calc.div(3,0));
		
	}
}
