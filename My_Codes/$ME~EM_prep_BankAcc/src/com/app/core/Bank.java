package com.app.core;

import java.time.LocalDate;

public class Bank {

	private int acctNo;
	private String customerName;
	private Account type;
	private double balance;
	private LocalDate createdOn;
	private LocalDate lastUpdated;
	private boolean isActive;
	
	// ALL ARGS CTOR
	public Bank(int acctNo, String customerName, Account type, double balance, LocalDate createdOn
			) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.createdOn = createdOn;
		this.lastUpdated = this.createdOn;
		this.isActive = isActive;
	}

	// TO STRING 
	
	@Override
	public String toString() {
		return "Bank [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance=" + balance
				+ ", createdOn=" + createdOn + ", lastUpdated=" + lastUpdated + ", isActive=" + isActive + "]";
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getType() {
		return type;
	}

	public void setType(Account type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
