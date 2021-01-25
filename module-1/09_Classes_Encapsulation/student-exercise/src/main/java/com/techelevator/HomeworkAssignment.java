package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks, String sumbitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = sumbitterName;
	}
	
	public String getLetterGrade() {
		double grade = (double)earnedMarks / (double)possibleMarks;
		if(grade >=0.9) {
			return "A";
		}
		
		if (grade >= 0.8) {
			return "B";
		}
		
		if (grade >= 0.7) {
			return "C";
		}
		if (grade >= 0.6) {
			return "D";
		}
		return "F";
	}
	
	
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	
	
}
