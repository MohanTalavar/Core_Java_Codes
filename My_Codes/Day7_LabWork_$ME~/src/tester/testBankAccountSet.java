package tester;

import java.util.HashSet;

import com.core.app.AccountType;
import com.core.app.BankAccount;

public class testBankAccountSet {

	public static void main(String[] args) {
		
		BankAccount a1= new BankAccount(101, "Rama", AccountType.SAVING, 10000);
		BankAccount a2= new BankAccount(10, "Vijay", AccountType.CURRENT, 6000);
		BankAccount a3= new BankAccount(101, "Anand", AccountType.SAVING, 12000);
		BankAccount a4= new BankAccount(67, "Rama", AccountType.SAVING, 10000);
		
		// create empty HS of accounts
		HashSet<BankAccount> accounts = new HashSet<>(); // size=0; capacity=16; loadFactor=0.75
		
		System.out.println("Added" + accounts.add(a1)); // t , hc=1
		System.out.println("Added" + accounts.add(a2)); // t, hc=1 ,
		
		System.out.println("Added" + accounts.add(a3));// f , hc=1, eq=1
		System.out.println("Added" + accounts.add(a4));// t, hc=1, 
		System.out.println("Size :" + accounts.size());
		
		for(BankAccount a: accounts)
			System.out.println(a);

		System.out.println(a1.equals(a3)); // true
		System.out.println(a1.hashCode() + " "+ a3.hashCode()); // diff values
	}

}
