import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_I() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(1, sc.converti("I"));
	}
	@Test
	public void test_III() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(3, sc.converti("III"));
	}
	@Test
	public void test_letter() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals('I', sc.letter("III",2));
	}
	@Test
	public void test_letter2() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(1, sc.transf("III",2));
	}
	@Test
	public void test_V() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(10, sc.converti("X"));
	}
	@Test
	public void test_IV() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(4, sc.converti("IV"));
	}
	@Test
	public void test_IX() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(9, sc.converti("IX"));
	}
	@Test
	public void test_XL() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(40, sc.converti("XL"));
	}
	@Test
	public void test_CM() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(900, sc.converti("CM"));
	}
	@Test
	public void test_CD() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(400, sc.converti("CD"));
	}
	@Test
	public void test_chiffre() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(true, sc.NotaromainNumerals("8"));
	}
	@Test
	public void test_only_romain_letter() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(true, sc.NotaromainNumerals("e"));
	}
	
	@Test
	public void test_more_than_3() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(0, sc.converti("CCCC"));  // if we have more than 3 I,C,X,M this is not a roman number and the program return 0
	}
	@Test
	public void test_more_than_one() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(0, sc.converti("VV"));   // if we have more than 1 V,D this is not a roman number and the program return 0
	}
	@Test
	public void test_X() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(5, sc.converti("V"));
	}
	@Test
	public void test_1984() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(1984, sc.converti("MCMLXXXIV"));
	}
	@Test
	public void test_2014() {
		RomanNumerals sc = new RomanNumerals();
		assertEquals(2014, sc.converti("MMXIV"));
	}

}
