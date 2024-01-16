//1.1 Create a parameterized constructor to accept x & y co-ords.
//1.2 Add public String show()) --to return point's x & y co-ords
//1.3 Add isEqual method to Point2D class : boolean returning method : 
//	must return true if both points are having same x,y co-ords 
//	or false otherwise.
//1.4 Add a method , calculateDistance , to calc distance between 2 points
//Hint : use distance formula.
//1.5  Create a driver  class(for UI)  , in the "tester" package "TestPoints" , 
//with main(..)



package com.cdac.geometry;

public class Point2D {

	private double x, y;
	
	public Point2D( double x, double y) {
		
		this.x= x;
		this.y= y;
	}
	
	public String show() {
		
		return "values of x:" + x+ ", y: " +y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	
	public boolean isEqual(Point2D p)
	{
		if(this.getX()==p.getX() && this.getY()==p.getY())
		return true;
		else
			return false;		
	}
	
	public void calDist(Point2D pt)
	{
		double x1 = this.getX()- pt.getX();
		double y1= this.getY() - pt.getY();
		
		x1= Math.pow(x1, 2);
		y1= Math.pow(y1, 2);
		
		double d= Math.sqrt((x1 +y1));
		System.out.println("Distance between " + this.show()+ "& "+ pt.show()+ "is equal to : " + d);
	}
}

















