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
	
	//BagManager bagManager = new BagManager();
	//@Test
	
	
	private BagManager bagManager;
	private IMyList mock;
	private Bag testBag = new Bag(7,(float)8.1,9.3);
	private int testValue_int = 7;
	private double testValue_double = 9.3;
	private float testValue_float = (float)8.1;
		private List<Bag> bags;
	
	
	@Before
	public void setUp() {
		mock = createMock(IMyList.class);
		bagManager = new BagManager(mock);
	}
	@Test
	public void check_AddBag() {
		expect(mock.addBag(testBag)).andReturn(true).atLeastOnce();
		replay(mock);
		assertTrue(bagManager.addBag(testBag));
		verify(mock);
	}
	
	
	
	@Test
	public void check_RemoveDesk() {
		expect(mock.removeBag(testBag)).andReturn(true).atLeastOnce();
		replay(mock);
		assertTrue(bagManager.removeBag(testBag));
		verify(mock);
	}
	@Test
	public void check_GetAll() {
		expect(mock.getAll()).andReturn(bags);
		replay(mock);
		assertEquals(bags, bagManager.GetAllBag());
		verify(mock);
	}
	
	@Test
	public void check_FindBag_ByValue_int() {
		expect(mock.FindBag_ByValue_int(testValue_int)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.FindBag_ByValue_int(testValue_int));
		verify(mock);
	}
	
	@Test
	public void check_FindBag_ByValue_double() {
		expect(mock.FindBag_ByValue_double(testValue_double)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.FindBag_ByValue_double(testValue_double));
		verify(mock);
	}
	@Test
	public void check_FindBag_ByValue_float() {
		expect(mock.FindBag_ByValue_float(testValue_float)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.FindBag_ByValue_float(testValue_float));
		verify(mock);
	}
	
	
}
