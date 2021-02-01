package com.techelevator;

import org.junit.Test;

public class SameFirstLastTest {
	
	
	@Test
	public void sameFirstLast() {
		assertEquals("Input: sameFirstLast(new int[]{1, 2, 3})", false, (new int[]{1, 2, 3}));
		assertEquals("Input: sameFirstLast(new int[]{1, 2, 3, 1})", true, (new int[]{1, 2, 3, 1}));
		assertEquals("Input: sameFirstLast(new int[]{1, 2, 1})", true, (new int[]{1, 2, 1}));
	}

	private void assertEquals(String string, boolean b, int[] is) {
		
		
	}

}
