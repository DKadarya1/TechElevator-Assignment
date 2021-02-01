package com.techelevator;

import java.util.Map;

import org.junit.*;

public class WordCountTest {

	@Test
	public void input_of_null_returns_empty_map() {
		
		WordCount objectToTest = new WordCount(); //Arrange
		
		Map<String, Integer> output = objectToTest.getCount(null); //Act
		
		//Assert
		Assert.assertNotNull(output);
		Assert.assertEquals(0, output.size());
	}
	
	@Test
	public void input_of_array_returns_empty_map() {
		//Arrange
		WordCount objectUnderTest = new WordCount();
		String[] emptyArray = new String[0];
		
		Map<String, Integer> output = objectUnderTest.getCount(emptyArray); //Act
		
		//Assert
		Assert.assertNotNull(output);;
		Assert.assertEquals(0, output.size());
	}
}

