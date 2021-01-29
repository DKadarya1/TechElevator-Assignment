package com.techelevator;

import org.junit.*;

public class AnimalGroupNameTest {
	
	@Test
	public void giraffe_returns_Towers() {
		//Arrange .. setup my data
		String input = "giraffe";
		AnimalGroupName agn = new AnimalGroupName();
		//Act
		String output = agn.getHerd(input);
		
		//Assert
		Assert.assertEquals("Tower", output);
		
		
	}


@Test
public void empty_string_retuns_unknown() {
	String input = "";
	AnimalGroupName agn = new AnimalGroupName ();
	
	String output = agn.getHerd("");
	Assert.assertEquals("unknown", output);
}
}