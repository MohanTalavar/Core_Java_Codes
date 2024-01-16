//6:create BankAccount   aaplication for operations like withdraw ,deposite  and moneyTransfer.
//Create menu drive program for bank operations..
package com.code;

public class Account {
		private int actId;
		private double salary;
		private String actName;
		public Account( int actId,double salary, String actName) {
			super();
			
			this.actId = actId;
			this.salary = salary;
			this.actName = actName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
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
			System.out.println("ID: " + actId+ " Name: "+  actName+ " Balance: "+ salary);
			
		}
		
		public void depositMoney(double amount) {
			
			this.salary+= amount;
			System.out.println("Updated Balance: " +this.salary);
		}
		
		public void WithdrawMoney(double amount) {
			
			this.salary-= amount;
			System.out.println("Updated Balance: " +this.salary);
		}
		
		public void moneyTransfer( Account act , double amt)
		{
			this.salary= salary-amt;
			act.salary+= amt;
			System.out.println("Amount transferred from "+ this.actId+ " to "+ act.actId);
		
			
			
		}
		
		
}
