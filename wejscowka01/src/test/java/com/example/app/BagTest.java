package com.example.app;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import com.example.app.Bag;

public class BagTest {
	
	
	private Bag bagg = new Bag();
	@Test
	public void addCheck(){	
		assertEquals(5, bagg.add(3,2));
		
	}
	@Test
	public void addSub(){
		assertEquals(1, bagg.sub(3,2));
		
	}

}
