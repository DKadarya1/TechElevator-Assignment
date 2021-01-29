package com.techelevator;

public abstract class Wall  {
	
	 private String name;
	 private String color;

	public Wall(String name, String color) {
		this.name = name;
		this.color = color;
		
		
		
	}
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract int getArea();

}
