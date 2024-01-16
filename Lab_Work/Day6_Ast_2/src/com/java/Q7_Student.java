//7:Create Student class with rollno,name address.
//Write business logic for auto incrment of rollno(don't accept roll no from user)
//Write parameterised constr for accepting name and address only
//Write getter and setter and display function

//7.1 Test Student class by creating  5 diff object.and display aal details
//(chk rollno created automatically)
//7.2 Create an array of 5 students and show only names 

package com.java;

public class Q7_Student {

	private int rollNo;
	private String name, address;
	private static int rollCount;
	
	static {
		
		rollCount= 1000;
		
	}
	
	public Q7_Student(String name, String address)
	{
		rollCount++;
		this.rollNo= rollCount;
		this.name = name;
		this.address= address;
		
	}
	
	public String toString() {
		
		return "Roll No: "+ rollNo + " Name: " + name + "Address: "+ address;
		
	}
	
	public void setName( String name) {
		
		this.name= name;
	}
	
	public void setAdd( String add) {
		
		this.address= add;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getAdd() {
		
		return address;
	}
	
	
}


















