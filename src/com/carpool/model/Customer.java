package com.carpool.model;

import java.util.List;

public class Customer {

	public String name;
	
	public String customerID;
	
	public List<String> bookingID;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerID=" + customerID + ", bookingID=" + bookingID + "]";
	}
	
	
	
	
}
