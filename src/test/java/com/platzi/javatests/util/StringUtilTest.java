package com.platzi.javatests.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void repeat_string_once() {	
		assertEquals("holaholahola",StringUtil.repeat("hola", 1));
	}
	
	@Test
	public void repeat_string_multiple_times() {	
		assertEquals("holaholahola",StringUtil.repeat("hola", 3));	
	}
	
	@Test
	public void repeat_string_zero_times() {	
		assertEquals("holaholahola",StringUtil.repeat("hola", 0));	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void repeat_string_negative_times() {	
		assertEquals("holaholahola",StringUtil.repeat("hola", -1));	
	}
}
