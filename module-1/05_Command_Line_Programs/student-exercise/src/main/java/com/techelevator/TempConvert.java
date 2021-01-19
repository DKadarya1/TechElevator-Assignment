package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

	
Scanner input = new Scanner(System.in);
		
		double convertedTemp = 0.0;
		
		System.out.println("Please enter the temperature:");
		String firstQuestion = input.nextLine();
		int temperature = Integer.parseInt(firstQuestion);
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String secondQuestion = input.nextLine();
		
		if (secondQuestion.equals("C")) {
			convertedTemp = (temperature * 1.8 + 32);
		}
		else {
			convertedTemp = (temperature - 32) / 1.8;
		}
		
		System.out.println(convertedTemp);
	}
}