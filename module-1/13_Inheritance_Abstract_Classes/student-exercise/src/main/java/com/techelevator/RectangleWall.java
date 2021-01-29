package com.techelevator;

public class RectangleWall extends Wall {
	
	
	private int length;
	private int height;

	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		
		this.length = length;
		this.height = height;
		
		

	}
	
	public int getArea() {
		return this.length *this.height;
		
}
	
	

	public int getLength() {
		return this.length;
	}


	public int getHeight() {
		return this.height;
	}
	@Override
	public String toString() {
		return getName() + " (" + this.length + "x" + this.height +") rectangle";
	}

	

}
