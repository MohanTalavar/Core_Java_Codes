package com.app.core;

import java.time.LocalDate;

public class Vehicle {

	private String chasisNo;
	private Color vehicleColor;
	private double netPrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	
	// Para constr
	
	public Vehicle(String chasisNo, Color vehicleColor, double basePrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.netPrice = basePrice+vehicleColor.getColorCost();
		this.manufactureDate = manufactureDate;
		this.company = company;
	}
	
	// pK para wrapper
	
	public Color getVehicleColor() {
		return vehicleColor;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Vehicle(String chasisNo) {
		
		this.chasisNo=chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [ChasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", netPrice=" + netPrice
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in vehicle equals");
		if(obj instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle)obj).chasisNo);
		return false;
		
	}
	
	

	// end of para 
	
	
	
}
