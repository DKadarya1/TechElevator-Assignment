package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		double linear = 0.0;
		
		System.out.println("Please enter a number:");
		String firstQuestion = input.nextLine();
		int linear2 = Integer.parseInt(firstQuestion);
		System.out.println("Is the number in (F)oot, or (M)eter?");
		String secondQuestion = input.nextLine();
		
		if (secondQuestion.equals("F")) {
			linear = (linear2 * 0.3048);
		}
		else {
			linear = (linear2 * 3.2808399);
		}
		System.out.println(linear);
	}


	}


