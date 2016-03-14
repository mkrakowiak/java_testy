package com.example.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;


import org.junit.Test;
public class BagTest {
	
	private MyApp myApp;
	private ICalculator mock;

	@Before
	public void setUp() {
		mock = createMock(IBagManager.class);
		bag = new Bag(mock);
	}
	
	
	BagManager bagManager = new BagManager();
	@Test
	public void testAdd()
	{	
		
		int SizeBeforeAdd = 0;

		Bag cos = new Bag(7,(float)8.1,9.3);

		//bagManager.addBag(cos);
		expect(mock.addBag(cos)).andReturn(5.0).times(1);
		int SizeAfterAdd = bagManager.bags.size();

		int Sub = SizeAfterAdd - SizeBeforeAdd;
		replay(mock);
		assertEquals(1, Sub);

		
	}
	@Test
	public void checkRemoving(){

		int SizeBeforeAdd = 0;

		Bag cos = new Bag(7,(float)8.1,9.3);
		//bagManager.addBag(cos);
		expect(mock.addBag(cos)).andReturn(5.0).times(1);
		int SizeAfterAdd = bagManager.bags.size();

		int Sub = SizeAfterAdd - SizeBeforeAdd;

		assertEquals(1, Sub);
		expect(mock.removeBag(cos)).andReturn(5.0).times(1);
		//bagManager.removeBag(cos);

		int SizeAfterRemove = bagManager.bags.size();
		replay(mock);
		assertEquals(0, SizeAfterRemove);

	}
}
