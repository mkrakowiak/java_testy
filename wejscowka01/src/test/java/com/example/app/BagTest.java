package com.example.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
public class BagTest {
	
	BagManager bagManager = new BagManager();
	@Test
	public void testAdd()
	{	
		
		int SizeBeforeAdd = 0;

		Bag cos = new Bag(7,(float)8.1,9.3);

		bagManager.addBag(cos);

		int SizeAfterAdd = bagManager.bags.size();

		int Sub = SizeAfterAdd - SizeBeforeAdd;

		assertEquals(1, Sub);

		
	}
	
}
