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
	static Bag testBag = new Bag(7,true,9.3);
	static final int szerokosc = 7;
	static final double waga = 9.3;
	static final boolean lotniczy = true;
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
	public void findBagBySzerokosc() {
		expect(mock.findBagByValueInt(szerokosc)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByValueInt(szerokosc));
		verify(mock);
	}
	
	@Test
	public void findBagByValueWaga() {
		expect(mock.findBagByValueDouble(waga)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByValueDouble(waga));
		verify(mock);
	}
	@Test
	public void findBagByValueLotniczy() {
		expect(mock.findBagByBool(lotniczy)).andReturn(testBag).atLeastOnce();
		replay(mock);
		assertEquals(testBag, bagManager.findBagByBool(lotniczy));
		verify(mock);
	}
	
	
}
