package com.app.core;

public class TempWorker extends Worker {

	@Override
	public double computeSalary() {
		
		System.out.println("tempWorker sal: "); 
		return 600;
	}
}
