
//14:Create menu driven program for Pizza Shop.And display total amount,
import java.util.Scanner;

public class pizza_Q14 {

	public static void main(String[] args) {
		int total= 0;
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Welcome to Pizza Shop. ");
		System.out.println("Our Menu");
		
		do 
		{
//			System.out.println("Welcome to Pizza Shop. ");
//			System.out.println("Our Menu");
			System.out.println("1:Margerita Pizza Cost= 200Rs");
			System.out.println("2:Peri Peri Pizza Cost= 250Rs");
			System.out.println("3:Cheese Pizza Cost= 300Rs");
			System.out.println("4:Exit the cart");
			System.out.println("Add Items to cart= ");
			choice= sc.nextInt();
			
			switch(choice)
			{
				case 1: 
					System.out.println("Enter the number of Margerita Pizza");
					int n1=sc.nextInt();
					total+= n1*200;
					System.out.println("Total Cost=" +total+ "Rs");
					break;
					
				case 2:
					System.out.println("Enter the number of Peri Peri Pizza=");
					int n2= sc.nextInt();
					total+= n2*250;
					System.out.println("Total Cost= " +total+ "Rs");
					break;
					
				case 3:
					System.out.println("Enter the number of Cheese Pizza");
					int n3=sc.nextInt();
					total+= n3*300;
					System.out.println("Total Cost=" +total+ "Rs");
					break;
					
				case 4:
					System.out.println("Exiting the code..");
				break;
			
				default:
					System.out.println("Invalid Input");
				
			}//switch
			
			
		}while(choice!= 4);
		System.out.println("THANK YOU! Visit again.. ");
		
		sc.close();
	}

}
