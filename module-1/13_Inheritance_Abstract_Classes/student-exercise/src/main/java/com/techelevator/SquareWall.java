package com.techelevator;

public class SquareWall extends RectangleWall{

	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
	
		
	}
	
	public int getSideLength () {
		return this.getSideLength();
	}
	
	public String toString () {
		String rectangleOutput = super.toString();
		return rectangleOutput.replace("rectangle", "square");
	}

}
