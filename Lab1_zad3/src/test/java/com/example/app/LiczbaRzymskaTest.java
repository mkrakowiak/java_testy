package com.example.app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LiczbaRzymskaTest {

private LiczbaRzymska rzym = new LiczbaRzymska(9);
	private LiczbaRzymska rzym2 = new LiczbaRzymska(3);
	private LiczbaRzymska rzym3 = new LiczbaRzymska(5);
	private LiczbaRzymska rzym_za_duza = new LiczbaRzymska(22);
	private LiczbaRzymska rzym_ujemna = new LiczbaRzymska(-5);
	
	@Test
	public void testToStringProper() {
		assertEquals("IX", rzym.toString());
		assertEquals("III", rzym2.toString());
		assertEquals("V", rzym3.toString());
	}
	
	@Test
	public void testZaDuza() {
		assertEquals("Zla liczba", rzym_za_duza.toString());
	}
	
	@Test
	public void testUjemna() {
		assertEquals("Zla liczba", rzym_ujemna.toString());
	}
}
