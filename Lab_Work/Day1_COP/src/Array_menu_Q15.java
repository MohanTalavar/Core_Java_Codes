//15:Create Menu driven program for array operations.
//1:Read Array 
//2:Print Array 
//3:Search element in array 
//4:Reverse Array 
//5:Even number from array
//6:sum of array element

import java.util.Scanner;
public class Array_menu_Q15 {

	public static void main(String[] args) {
		
		int size;
		System.out.println("Enter the size of array= ");
		Scanner sc=new Scanner(System.in);
		size= sc.nextInt();
		int arr[]= new int [size];
		
		System.out.println("Enter choice=");
		
		int choice;
		do {
				System.out.println("1:Read Array");
				System.out.println("2:Print Array");
				System.out.println("3:Search element in array");
				System.out.println("4:Reverse Array");
				System.out.println("5:Even number from array");
				System.out.println("6:sum of array element");
				System.out.println("7:Exit..");
				choice= sc.nextInt();
				
				switch(choice) 
				{
				
				case 1:
					System.out.println("Enter the elements of array");
					for(int i= 0;i<size; i++)
					{
						arr[i]= sc.nextInt();	
					}
					break;
					
				case 2:
					System.out.println("Elements of array= ");
					for(int i= 0;i<size; i++)
					{
						System.out.println(arr[i]+ " ");	
					}
					break;
					
					
				case 3: 
					System.out.println("Enter the element to search= ");
					int search= sc.nextInt();
					boolean isPresent= false;
					for(int i =0; i<size; i++)
					{
						if(search==arr[i])
							{isPresent= true;
							break;
							}
							else
								isPresent= false;
					}// for
					if(isPresent)
						System.out.println("Element "+search+ " Found");
					else System.out.println(search+" Not Found");
					
					break;
					
				case 4: //reverse array
					
					System.out.println("Reversed Array= ");
					for(int i=size-1; i>=0; i--)
					{
						System.out.println(arr[i]);
					}
					break;
					
				case 5: //even number from array;
					int k=0;
					System.out.println("Even numbers in given array=");
					for(int i=0; i<size; i++)
					{
						if(arr[i]%2==0)
							{System.out.println(arr[i]+"  ");
							k++;
							}
					}
					if(k==0)
						System.out.println("Even numbers not found!");
					
					break;
					
				case 6:
					int sum= 0;
					for(int i=0; i<size; i++)
					{
						sum+= arr[i];
				
					}
					System.out.println("Sum of array= "+sum);
					break;
					
					
				case 7:
					System.out.println("Exiting the code");
					break;
					
				default:
					System.out.println("Invalid Input!");
					break;
					
				}// switch
				
			
		}while(choice!= 7);//do
	
		sc.close();
	}

}
