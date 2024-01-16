package com.cdac.geometry;

public class Apple extends Fruit {
	
	 //private boolean fresh;
	public Apple(String color, String name, double weight,boolean fresh){
		super(color, name, weight);
		this.fresh=fresh;
	}

	



	public String taste() {
		
		String str= "Apple : Sweet and sour";
		return str;
	}
	
//	2.6 Add specific functionality , in the sub classes
//	In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
//	In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}
//	In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}


	public void jam()
	{
		System.out.println(this.getName()+": Making jam");
	}





	@Override
	public String toString() {
		return super.toString()+" " +this.fresh;
	}
	
	

}
