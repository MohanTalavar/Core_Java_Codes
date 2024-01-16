//6:create BankAccount   aaplication for operations like withdraw ,deposite  and moneyTransfer.
//Create menu drive program for bank operations..
package com.tester;
import java.util.Scanner;

import com.code.Account;

public class TesterAccount {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the no of accounts: ");
		Account arr[]= new Account[sc.nextInt()];
		
		int index= 0;
		int choice;
		
		System.out.println(" 1)Create an account 2)Deposit 3)Withdraw 4)Money Transfer 5)Check Balance 6)Exit...");
		
		do {
			System.out.println("Enter choice:");
			choice= sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				System.out.println("Enter Id: Salaray: Name: ");
				arr[index]= new Account(sc.nextInt(), sc.nextDouble() , sc.next());
				System.out.println("Account created successfully!!!");
				arr[index].getDetails();
				index++;
				break;
				
			case 2:
				System.out.println("Enter Account Id: ");
				int id=sc.nextInt();
				double de;
				for(int i=0; i<index; i++)
				{
					if(arr[i].getActId()==id)
					{
						System.out.println("Account found!! Enter amount to Deposit");
						de=sc.nextDouble();
						arr[i].depositMoney(de);
						break;
						
					}
				}
				break;
				
			case 3:
				
				System.out.println("Enter Account Id: ");
				 id=sc.nextInt();
				for(int i=0; i<index; i++)
				{
					if(arr[i].getActId()==id)
					{
						System.out.println("Account found!! Enter amount to Withdraw");
						de=sc.nextDouble();
						arr[i].WithdrawMoney(de);
						break;
						
					}
				}
				break;
				
			case 4:
//				System.out.println("Enter your id:");
//				int id1= sc.nextInt();
//				System.out.println("Enter ID for Money Transfer:");
//				int id2= sc.nextInt();
//				System.out.println("Enter Money to transfer:");
//				arr[id1].moneyTransfer(arr[id2], sc.nextDouble());
//				
//				arr[id2].getDetails();
				
				
				
			
			
			case 6:
				System.out.println("Exiting the code");
				break;
			default:
				System.out.println("Invalid Input!!");
			}
			
			
			
			
			
			
			
			
		}while(choice!=6);
		
		
		
		
		sc.close();
	}

}
