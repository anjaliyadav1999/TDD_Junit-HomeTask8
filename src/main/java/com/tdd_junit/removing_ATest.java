package com.tdd_junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class removing_ATest {

	@Test
	public void test1Remove() {
		removing_A r1=new removing_A();
		String test=r1.remove("ABCD");
		assertEquals("BCD",test);
	}
	@Test
	public void test2Remove() {
		removing_A r1=new removing_A();
		String test=r1.remove("AACD");
		assertEquals("CD",test);
	}
	@Test
	public void test3Remove() {
		removing_A r1=new removing_A();
		String test=r1.remove("BACD");
		assertEquals("BCD",test);
	}
	@Test
	public void test4Remove() {
		removing_A r1=new removing_A();
		String test=r1.remove("BBAA");
		assertEquals("BBAA",test);
	}
	@Test
	public void test5Remove() {
		removing_A r1=new removing_A();
		String test=r1.remove("AABAA");
		assertEquals("BAA",test);
	}

}
