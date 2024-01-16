package com.cdac.geometry;

public class Orange extends Fruit {

	public Orange(String color, String name, double weight, boolean fresh) {
		super(color, name, weight);
		this.fresh=fresh;
		// TODO Auto-generated constructor stub
	}

	public String taste() {

		String str = "Orange : Sweet and sour";
		return str;
	}
	
	public void juice()
	{
		System.out.println(this.getName()+"  "+this.getWeight()+" Extracting Juice");
		
	}

	@Override
	public String toString() {
		return super.toString()+"  " + this.fresh;
	}
	
	
}
