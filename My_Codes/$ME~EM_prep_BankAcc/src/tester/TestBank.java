package tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Account;
import com.app.core.Bank;

import customException.BankAcoountExceptionHandling;

import static utils.Bankutils.populateMap;
import static utils.ValidationRules.*;

public class TestBank {

	public static void main(String[] args) throws BankAcoountExceptionHandling {
		
		try(Scanner sc=new Scanner(System.in)){
			
			
			Map<Integer, Bank> bankMap = populateMap();
			
			
			boolean exit = false;
			while(!exit) {
				
				System.out.println("Options 1. Cretae a/c");
				
				System.out.println("Choose an option");
				
				try {
					
					
					switch (sc.nextInt()) {
					
					case 1: // create an a/c
						
						System.out.println("Enter details: "
								+ "int acctNo, String customerName, Account type, double balance, LocalDate createdOn");
						Bank account = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), bankMap);
						bankMap.put(account.getAcctNo(), account);
						System.out.println("account created");
						break;
						
					case 2: //display all
						
						System.out.println("Accounts in bank");
						for(Bank a:bankMap.values())
							System.out.println(a);
						
						break;

					default:
						break;
					}
					
					
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		} // sc.close
		

	}// end of main

}
