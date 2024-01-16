//2.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
//
//Use tight encapsulation.
//
//2.2 Properties (instance variables)  : color : String , weight : double , 
//name:String, fresh : boolean
//
//2.3 Add suitable constructor.
//
//2.4 Override  toString correctly to return state of all fruits 
//		(return only  : name ,color , weight )
//
//2.5 Add a taste() method to return String form of the taste of the Fruit
//eg :  public String taste()

package com.cdac.geometry;

public class Fruit {

	private String color, name;
	private double weight;
	protected boolean fresh= false;

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}


	//
	public Fruit(String color, String name, double weight) {
		super();
		this.color = color;
		this.name = name;
		this.weight = weight;

	}

	public String taste() {

		System.out.println();
		String str = "Default: Sweet and sour";
		return str;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", name=" + name + ", weight=" + weight + "]";
	}

}
