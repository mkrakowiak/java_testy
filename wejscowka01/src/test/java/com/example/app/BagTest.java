package com.example.app;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class BagTest {
	
	
	private BagManager bagManager;
	private IMyList mock;
	private Bag testBag = new Bag(7,true,9.3);
	private final int testValueInt = 7;
	private final double testValueDouble = 9.3;
	private final boolean testValueBool = true;
		private List<Bag> bags;
	
	
	@Before
	public void setUp() {
		mock = createMock(IMyList.class);
		bagManager = new BagManager(mock);
	}
	@Test
	public void checkAddBag() {
		expect(mock.addBag(testBag)).andReturn(true).atLeastOnce();
		replay(mock);
		assertTrue(bagManager.addBag(testBag));
		verify(mock);
	}
	@Test
	public void checkRemoveDesk() {
		expect(mock.removeBag(testBag)).andReturn(true).atLeastOnce();
		replay(mock);
		assertTrue(bagManager.removeBag(testBag));
		verify(mock);
	}
	@Test
	public void checkGetAll() {
		expect(mock.getAll()).andReturn(bags);
		replay(mock);
		assertEquals(bags, bagManager.GetAllBag());
		verify(mock);
	}
	
	@Test
	public void findBagByValueInt() {
		expect(mock.findBagByValueInt(testValueInt)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByValueInt(testValueInt));
		verify(mock);
	}
	
	@Test
	public void findBagByValueDouble() {
		expect(mock.findBagByValueDouble(testValueDouble)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByValueDouble(testValueDouble));
		verify(mock);
	}
	@Test
	public void findBagByValueBool() {
		expect(mock.findBagByBool(testValueBool)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByBool(testValueBool));
		verify(mock);
	}
	
	
}
