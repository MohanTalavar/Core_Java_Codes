//3. Create a class Person with data members as name, age, city. Write getters and 
//setters for all the data 
//members. Also add the display function. Create Default and Parameterized constructors.
//Create the 
//object of this class in main method and invoke all the methods in that class.

package Tester;
import java.util.Scanner;

import Logic.Person_L3_Q3;

public class TestPersonQ3L3 {

	public static void main(String[] args) {
		
		Person_L3_Q3 obj1= new Person_L3_Q3();
		
		obj1.display();
		
		System.out.println("--------------------");
		
		
		System.out.println("Enter Name City Age= ");
		Scanner sc= new Scanner(System.in);
		obj1 = new Person_L3_Q3(sc.next(), sc.next(), sc.nextInt());
		obj1.display();
		
		System.out.println("Enter name to update");
		obj1.setName(sc.next());
		String str= obj1.getName();
		
		System.out.print("Updated Name:");
		System.out.println(str);
		
		
		System.out.println("Enter city to update:");
		obj1.setCity(sc.next());
		String str1= obj1.getCity();
		System.out.print("Updated city: ");
		System.out.println(str1);
		
		System.out.println("Enter Age to Update:");
		obj1.setAge(sc.nextInt());
//		String str2= obj1.getAge();
		System.out.println("Updated age"+ obj1.getAge());
		
		System.out.println("Changes you made applied succesfully!!!");
		obj1.display();
		
		sc.close();
	}

}
