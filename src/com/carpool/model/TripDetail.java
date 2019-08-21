package com.carpool.model;

import java.util.Date;

public class TripDetail {

	public String bookingID;
	
	public String customerID;
	
	public Car car ;
	
	public Date startTime;
	
	public Date endTime;
	
	public String status;
	
	public String startLocation;
	
	public String endLocation;

	@Override
	public String toString() {
		return "TripDetail [bookingID=" + bookingID + ", customerID=" + customerID + ", car=" + car + ", startTime="
				+ startTime + ", endTime=" + endTime + ", status=" + status + ", startLocation=" + startLocation
				+ ", endLocation=" + endLocation + "]";
	}

	

	
	
	
}
