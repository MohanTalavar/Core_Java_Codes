package com.core.app;

import java.time.LocalDate;
public class Customer implements Comparable<Customer> {
	
	// declaring static members
	public static int idGenerator;

	// declaring data members
	
	private int custId;
	private String firstName; 
	private String lastName;
	private String email; 
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastSubscriptionPaidDate;
	// end of data members
	
	// para constructor
	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan, LocalDate lastSubscriptionPaidDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
		this.custId= ++idGenerator;
		
	}// end of all para
	
	public LocalDate getLastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}

	public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	//primary key based constructor
	public Customer(String email) {
		this.email=email;
	}// end of Pk para
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in Customers equals");
		if(obj instanceof Customer)
			return this.email.equals(((Customer)obj).email);
		return false;
		
	}

	@Override
	public int compareTo(Customer cust) {
		System.out.println("In Customer : compare to");
			return this.email.compareTo(cust.email);
	}
	
}// end