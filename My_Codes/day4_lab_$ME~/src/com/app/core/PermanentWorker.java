package com.app.core;

public class PermanentWorker extends Worker {

	@Override
	public double computeSalary() {
		
		System.out.println("PermanentWorker sal: "); 
		return 700;
	}
}
