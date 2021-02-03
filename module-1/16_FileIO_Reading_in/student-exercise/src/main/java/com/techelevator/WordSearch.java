package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordSearch {

	public static void main(String[] args) {
	       
		File inputFile = getInPutFileFromUser();
		String word = searchForWords();
		askUserIfCaseSensitive (inputFile, word);
	

	}
	
	
	public static File getInPutFileFromUser() {
		Scanner fileInput = new Scanner(System.in);
		System.out.print("What is the file that should be searched? ");
		String location = fileInput.nextLine();
		
		File inputFile = new File(location);
		if(!inputFile.exists()) {
			System.out.println(location+" does not exist");
			System.exit(1); 
		
		} else if(!inputFile.isFile()) {
			System.out.println(location+" is not a file");
			System.exit(0);
		}
		return inputFile;
	}
     
	
	public static String searchForWords() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the search word you are looking for?");
		String searchWord = userInput.nextLine();
		
		return searchWord;
	}
	
	public static String askUserIfCaseSensitive (File inputFile, String searchWord ) {
		
		Scanner caseSensitive = new Scanner(System.in);
		System.out.println ("Should the search be case sensitive? (Y\\N)");
		String yesOrNo = caseSensitive.nextLine().toLowerCase().substring(0,1);
		 
		try (Scanner input = new Scanner(inputFile)) {
			 int i =0;
			 
			while (input.hasNextLine()) {
				if(yesOrNo.equals("n")) {
					i++;
					String line = input.nextLine();
					if(line.toLowerCase().contains(searchWord.toLowerCase())) {
						  System.out.println(i + ") " + line);
				
					}  
					
				} else {
						    i++;
						    String line = input.nextLine();
						    if (line.contains(searchWord)) {
						    	System.out.println (i + ") " + line);
						    }
					}
				
				}
			
		} catch (FileNotFoundException e) {
			System.out.println ("File doesn't exist");
		 }
		return "";
	}
}

