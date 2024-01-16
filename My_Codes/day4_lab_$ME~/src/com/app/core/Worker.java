package com.app.core;

public abstract class Worker extends Emp{

	@Override
	public double computeSalary() {
		
		System.out.println("Workers sal: "); 
		return 200;
	}

}
