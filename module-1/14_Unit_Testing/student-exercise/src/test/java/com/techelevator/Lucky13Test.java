package com.techelevator;


import org.junit.Test;


public class Lucky13Test {
	private Object exercises;

	//Lucky13 exercises = new Lucky13();
	
	@Test
	public void lucky13() {
		assertEquals("Input: lucky13(new int[]{0, 2, 4})", true, (new int[]{0, 2, 4}));
		assertEquals("Input: lucky13(new int[]{1, 2, 3})", false, (new int[]{1, 2, 3}));
		assertEquals("Input: lucky13(new int[]{1, 2, 4})", false, (new int[]{1, 2, 4}));
	}

	private void assertEquals(String string, boolean b, int[] is) {
		
		
	}
}
