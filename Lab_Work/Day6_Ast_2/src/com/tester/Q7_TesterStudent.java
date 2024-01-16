//7:Create Student class with rollno,name address.
//Write business logic for auto incrment of rollno(don't accept roll no from user)
//Write parameterised constr for accepting name and address only
//Write getter and setter and display function

//7.1 Test Student class by creating  5 diff object.and display aal details
//(chk rollno created automatically)
//7.2 Create an array of 5 students and show only names 

package com.tester;

import java.util.Scanner;

import com.java.Q7_Student;

public class Q7_TesterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------Q7----------");

		Q7_Student obj= new Q7_Student("Pranay ", "Pune");
		System.out.println(obj);
		
		Q7_Student obj1= new Q7_Student("Mohan ", "Pune");
		System.out.println(obj1);
		
		System.out.println("Setter--------");
		obj.setName("Pranay Patil ");
		obj.setAdd(" Thane");
		obj1.setName("Mohan Talavar ");
		obj1.setAdd(" Nigdi");
		
		System.out.println("Getter----------");
		
		System.out.println(obj.getName());
		System.out.println(obj1.getName());
		System.out.println(obj.getAdd());
		System.out.println(obj1.getAdd());
		
		System.out.println("Final ---------");
		
		System.out.println(obj);
		System.out.println(obj1);
		
		//////////////////////////////////////////////////////////////////
		System.out.println("--------- Q7.1------");
		Q7_Student[] arr= new Q7_Student[5];
		
		Q7_Student std = null;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Details of 5 student: ");
		for(int i = 0 ; i< arr.length ; i++) {
			
			System.out.println("Enter name & Address");
			std= new Q7_Student(sc.next(), sc.next());
			arr[i]= std;
			
		}

		System.out.println("Names of 5 students: ");
		for(int i = 0 ; i< arr.length ; i++) {
		
			System.out.println(arr[i].getName());
		}
		
		
		
	}

}
