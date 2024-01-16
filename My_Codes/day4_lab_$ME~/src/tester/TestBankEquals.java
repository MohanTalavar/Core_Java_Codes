package tester;

import understaning_equlas.Bank;

public class TestBankEquals {

	public static void main(String[] args) {
		
		Object acct1 = new Bank(101, "Mohan", "saving", 10000);
		Object acct2 = new Bank(101, "Mohan", "saving", 10000);

		//System.out.println(acct1==acct2);
		
		System.out.println(acct1.equals(acct2));
		
		Object o=100;
		System.out.println(o.getClass());
		System.out.println(acct1.equals(o));
		
	}// end of main

}
