package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import customExp.VehicleHandlingExp;

public class ShowRoom {

	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in)){
			
			System.out.println("Enter showroom size: ");
			Vehicle[] showroom = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			
			while(!exit) {
				System.out.println("1. Add New Vehicle");
				System.out.println("2. Display Vehicles");
				System.out.println("0. Exit");
				
			try {
				switch (sc.nextInt()) {
				case 1:
					if(counter<showroom.length) {
						
					
						
						
						
					}else
						throw new VehicleHandlingExp("showroom full"))
						
					break;
					
				case 2:
					
					break;
					
				case 0:
				
					break;
				
				default:
					break;
				}
				
				
				
				
				
			}catch (Exception  e) {
				e.printStackTrace(); //  name msg location
			}
				
				
				
				
			}// end of while
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}// end of try resources

	}// end of main

}
