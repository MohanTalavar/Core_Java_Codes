package com.cdac.geometry;

public class Mango extends Fruit {

	public Mango(String color, String name, double weight, boolean fresh) {
		super(color, name, weight);
		this.fresh=fresh;
	}

	public String taste() {

		
		String str = "Mango : Sweet";
		return str;
	}
	
	public void pulp()
	{
		System.out.println(this.getName()+"  "+this.getWeight()+" Creating pulp!!");
	}

	@Override
	public String toString() {
		return super.toString()+ this.fresh;
	}
	
	

}
