package Tester;
import java.util.Scanner;

import Logic.Point_Q5;
public class TestPoint {

	public static void main(String[] args) {

		
		Point_Q5 obj1 = new Point_Q5();
		obj1.Display();
		
		// Para
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of x and y:");
		obj1 = new Point_Q5(sc.nextInt(), sc.nextInt());
		obj1.Display();
		
		// Update value of x & y
		
		System.out.println("Enter value of x & y to update:");
		obj1.setX(sc.nextInt());
		obj1.setY(sc.nextInt());
		
		// getter
		System.out.println("Updated value of x: "+ obj1.getX()+ " and y: " +obj1.getY());
		
		
		
		
		sc.close();
	}

}
