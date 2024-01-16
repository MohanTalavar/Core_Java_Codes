//6:create BankAccount   aaplication for operations like withdraw ,deposite  and moneyTransfer.
//Create menu drive program for bank operations..
package com.tester;
import java.util.Scanner;

import com.code.Account;

public class TesterAccount {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the no of accounts: ");
		int size= sc.nextInt();
		Account arr[]= new Account[size];
		
		Account act = null;
		int index= 0;
		int choice;
		
		System.out.println(" 1)Create an account 2)Deposit 3)Withdraw 4)Money Transfer 5)Check Balance 6)Exit...");
		
		do {
			System.out.println("Enter choice:");
			choice= sc.nextInt();
			
			switch(choice) {
			
			case 1:// create account
				
				System.out.println("Enter Id: Name: Salaray: ");
				act= new Account(sc.nextInt(), sc.next(), sc.nextDouble() );
				arr[index]= act;
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
				// check sender exist or not
				
				System.out.println("Enter senders ID: ");
				int sendId=sc.nextInt();
				for(int i=0; i<index; i++)
				{
					if(arr[i].getActId()==sendId)
					{sendId= i;	
					System.out.println("sender id at index " + sendId);
					break;
					}
				}
				// check receiver exist or not
				
				System.out.println("Enter receivers ID: ");
				int recId=sc.nextInt();
				for(int i=0; i<index; i++)
				{
					if(arr[i].getActId()==recId)
					{recId= i;	
					System.out.println("receiver id  at index "+ recId);
					break;
					}
				}
				
				// amount
				System.out.println("Enter amount to transfer:");
				double amt= sc.nextDouble();
				
				// final money transfer
				arr[sendId].moneyTransfer(arr[recId], amt );
				
				break;
			
			case 6:
				System.out.println("Exiting the code");
				break;
			default:
				System.out.println("Invalid Input!!");
			}
				
		}while(choice!=6);
		
		System.out.println("Thank You !!!");
		sc.close();
	}

}
