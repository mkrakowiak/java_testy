package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalkulatorTest {
	private Kalulator kalk = new Kalulator();
	
	@Test
	public void addCheck(){	
		assertEquals(5, kalk.add(3,2));
		
	}
	@Test
	public void addSub(){
		assertEquals(1, kalk.sub(3,2));
		
	}
	@Test
	public void multiCheck(){
		assertEquals(6, kalk.multi(3,2));
		
	}
	@Test
	public void divCheck(){
		assertEquals(1, kalk.div(3,2));
		
	}
	@Test
	public void greaterCheck(){
		assertEquals(true, kalk.greater(3,2));
		
	}
	
	@Test (expected = ArithmeticException.class) 
	public void div2Check(){
		assertEquals(6, kalk.div(3,0));
		
	}
}
