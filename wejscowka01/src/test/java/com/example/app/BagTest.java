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
	private final int testValue_int = 7;
	private final double testValuedouble = 9.3;
	private final boolean testValubool = true;
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
		expect(mock.findBagByValueint(testValue_int)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByValueint(testValue_int));
		verify(mock);
	}
	
	@Test
	public void findBagByValueDouble() {
		expect(mock.findBagByValuedouble(testValuedouble)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByValuedouble(testValuedouble));
		verify(mock);
	}
	@Test
	public void findBagByValueBool() {
		expect(mock.findBagBybool(testValubool)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagBybool(testValubool));
		verify(mock);
	}
	
	
}
