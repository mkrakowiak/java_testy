package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class KalkulatorTest {
private kalkulator kalk = new kalkulator();
	
	@Test
	public void addCheck(){	
		assertEquals(5.0, kalk.add(3.0,2.0),0);
		
	}
	@Test
	public void addSub(){
		assertEquals(1.0, kalk.sub(3.0,2.0),0);
		
	}
	@Test
	public void multiCheck(){
		assertEquals(6.0, kalk.multi(3.0,2.0),0);
		
	}
	@Test
	public void divCheck(){
		assertEquals(1.5,kalk.div(3.0,2.0),0);
		
	}
	@Test
	public void greaterCheck(){
		assertEquals(true, kalk.greater(3.0,2.0));
		
	}
	
	@Test (expected = AssertionError.class) 
	public void div2Check(){
		assertEquals(6, kalk.div(3.0,0.0),0);
		
	}
}
