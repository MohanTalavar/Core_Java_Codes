//6:create BankAccount   aaplication for operations like withdraw ,deposite  and moneyTransfer.
//Create menu drive program for bank operations..
package com.code;

public class Account {
		private int actId;
		private double balance;
		private String actName;
		public Account( int actId,String actName, double balance) {
			super();
			
			this.actId = actId;
			this.actName = actName;
			this.balance = balance;
			
		}
		public double getBalance() {
			return balance;
		}
		public void setSalary(double balance) {
			this.balance = balance;
		}
		public int getActId() {
			return actId;
		}
		public void setActId(int actId) {
			this.actId = actId;
		}
		public String getActName() {
			return actName;
		}
		public void setActName(String actName) {
			this.actName = actName;
		}
		
		public void getDetails()
		{
			System.out.println("ID: " + actId+ " Name: "+  actName+ " Balance: "+ balance);
			
		}
		
		public void depositMoney(double amount) {
			
			this.balance+= amount;
			System.out.println("Updated Balance: " +this.balance);
		}
		
		public void WithdrawMoney(double amount) {
			
			this.balance-= amount;
			System.out.println("Updated Balance: " +this.balance);
		}
		
		public void moneyTransfer( Account act , double amt)
		{
			
			System.out.println(this.actId);
			System.out.println(act.actId);
			this.balance= this.balance-amt;
			act.balance= act.balance + amt;
			System.out.println("Amount transferred from Account no: "+ this.actId+ " to "+ act.actId);
			System.out.println("Senders balance: "+ this.balance + " Recievers balance: " + act.balance);
			
			
		}
		
		
}
