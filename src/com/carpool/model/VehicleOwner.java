package com.carpool.model;

public class VehicleOwner {

	public Car car;
	
	public String customerID;
	
	public String customerName;
	
	public String LicenseNumber;

	@Override
	public String toString() {
		return "VehicleOwner [car=" + car + ", customerID=" + customerID + ", customerName=" + customerName
				+ ", LicenseNumber=" + LicenseNumber + "]";
	}
	
	
}
