package com.cdac.geometry;

import java.util.Scanner;

public class testFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Fruit obj= new Apple("Red", "Apple ", 30, true);
//		System.out.println(obj);
//		
//		((Apple)obj).jam();
//		System.out.println();
//		////////////
//		
//		Fruit obj1= new Orange("Orange", "Orange", 20, false);
//		System.out.println(obj1);
//		((Orange)obj1).juice();
//		System.out.println();
//		
//		///
//		Fruit obj2= new Mango("Yellow", "Mango", 35, true);
//		System.out.println(obj2);
//		((Mango)obj2).pulp();
//		
		System.out.println("Q2.9 onwards ------------");

//		2.9 Prompt user for the basket size n create suitable data structure
//
//		2.10 Supply options
//		1. Add Mango
//		2. Add Orange
//		3. Add Apple
//		NOTE : You will be adding a fresh fruit in the basket , in all of above 
//		options.
//
//		4. Display names of all fruits in the basket.
//
//		5. Display name,color,weight , taste of all fresh fruits , in the basket.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basket size:");
		int n = sc.nextInt();
		Fruit[] basket = new Fruit[n];
		int index = 0;

		System.out.println("Add fruits to your basket!!!");
		System.out.println("1: Add Mango");
		System.out.println("2: Add Orange");
		System.out.println("3: Add Apple");
		System.out.println("4: Display all fruit names");
		System.out.println("5: Details of all fresh fruits");
		System.out.println("6: Exit");

		int choice;
		do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1: // addding mango
				
				if (index < n) {

					basket[index] = new Mango("Yellow", "Mango", 35, true);
					System.out.println("Mango added!!!");
					index++;
				} else
					System.out.println("Array is full!!!");

				break;

			case 2://adding orange
				
				if (index < n) {

					basket[index]= new Orange("Orange", "Orange", 20, false);
					System.out.println("Orange added!!!");
					index++;
				} else
					System.out.println("Array is full!!!");
				break;

			case 3: // adding apple
				
				if (index < n) {

					basket [index]= new Apple("Red", "Apple ", 30, true);
					System.out.println("Apple added!!!");
					index++;
				} else
					System.out.println("Array is full!!!");
				break;
				
			case 4:
				System.out.println("Names of all fruits in the basket");
				for(Fruit f: basket)
				{
					System.out.println(f.getName());
					
				}
				
				break;
				
			case 5:
				for(Fruit f: basket)
				{
					if(f.fresh== true)
						System.out.println(f.toString());
					else
						System.out.println(f.getName() + " is stale!!");
				}
				break;
				
				
				
				
				
				
				
				
				
				
			default: System.out.println("Invalid Input!!!");
				break;
				
			}// switch
			
		} while (choice != 6);

		sc.close();
	}

}
