package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("Please provide the Destination for FizzBuzz.txt?");
			String fileName = userInput.nextLine();
			
			writeFileFizzBuzzTo300(fileName);
		}
	}
	
	private static void writeFileFizzBuzzTo300(String filePath) {
		File fizzBuzzFile = new File(filePath + "/FizzBuzz.txt");
		
		try (PrintWriter pw = new PrintWriter(fizzBuzzFile)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 5 == 0 &&
					i % 3 == 0) {
					pw.println("FizzBuzz");
				} else if (i % 5 == 0 ||
						   containsA5(i)) {
					pw.println("Buzz");
				} else if (i % 3 == 0 ||
						   containsA3(i)) {
					pw.println("Fizz");
				} else {
					pw.println(i);
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private static boolean containsA5(int number) {
		String numberAsString = Integer.toString(number);
		
		if (numberAsString.contains("5")) {
			return true;
		}
		return false;
	}
	
	private static boolean containsA3(int number) {
		String numberAsString = Integer.toString(number);
		
		if (numberAsString.contains("3")) {
			return true;
		}
		return false;
	}

}

