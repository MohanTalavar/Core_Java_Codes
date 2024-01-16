package com.app.core;


// By ME
public enum Color {
	WHITE(10), SILVER(20), BLACK(30), BLUE(40), RED(50);
	
	private double colorCost;
	
	private Color(double colorCost)
	{
		this.colorCost = colorCost;
	}
	
	public String getColorCost() {
		
		return this.getColorCost();
	}
	
	public String toString()
	{
		return name() + "@" + colorCost;
	}

}
