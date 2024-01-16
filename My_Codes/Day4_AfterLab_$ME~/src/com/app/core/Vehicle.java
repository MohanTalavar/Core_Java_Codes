package com.app.core;

import java.time.LocalDate;

// by me

public class Vehicle {
	
	private String chasisNo;
	private Color vehicleColor;
	private double price;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	
	public Vehicle(String chasisNo,Color vehicleColor, double price,
			LocalDate manufactureDate, String company ) {
		
		this.chasisNo =chasisNo;
		this.vehicleColor= vehicleColor;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
		
	}// end of para
	
	public Vehicle(String newChasisNo) {
		
		this.chasisNo = newChasisNo;
	}

	@Override
	public String toString() {
		
		return "Vehicle: ChasisNo: "+ chasisNo + "Vehicle Color: "+ vehicleColor + " Price: "+ price +
				"Manufacturig Date: " + manufactureDate+ "Company: "+ company;
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle equals");
		if (o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);
		return false;
	}
	
	

}
