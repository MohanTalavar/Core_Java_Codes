package com.core.app;

public class BankAccount {
	
	private int acctNo;
	private String customerName;
	private AccountType type;
	private double balance;
	
	/// para ctr
	public BankAccount(int acctNo, String customerName, AccountType type, double balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
	} // end of para

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + "]";
	}
	
	//PK : acct no
	@Override
	public boolean equals(Object o) {
		
		System.out.println("In BankAcc equals ");
		if(o instanceof BankAccount)
			return this.acctNo==((BankAccount)o).acctNo;
		return false;
	}
	
	// override hashcode
	
	public int hashCode() {
		
		System.out.println("in acct HC");
		return acctNo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
