package com.carpool.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.carpool.db.Data;
import com.carpool.model.Car;
import com.carpool.model.CarPoolingSystem;
import com.carpool.model.TripDetail;

public class BookingSystem {
	
	//Load the data 
	private static CarPoolingSystem carPoolingData = Data.getCarPoolingSystem();
	
	public static String bookATrip(String customerID, String startLocation, String endLocation, Date startDate, Date endTime){
		
		String tripID = System.currentTimeMillis()+""+(int)Math.random();
		List<TripDetail> trips = carPoolingData.trips;
		List<Car> cars = carPoolingData.cars;
		int bookedCarCount=0;
		boolean shouldANewTripBeCreated = false;
		Car carToBeUsedForBooking= null;
		List<String> listOfCarAlreadyBooked = new ArrayList<>();
		//check if the car registered with the system is available in the trip list to check the availaibility.
		
			if(trips.isEmpty()){
				shouldANewTripBeCreated= true;
				
			}
			else{
				for(TripDetail trip: trips){
					System.out.println("Trip Detail---" + trip);
					if(startDate.equals(trip.startTime) )
					{
						bookedCarCount = bookedCarCount+1;
						listOfCarAlreadyBooked.add(trip.car.vehicleNumber);
					}
				}
			}
			
			//Decide which car should be alloted for booking
		for(Car c : cars){
			if(!listOfCarAlreadyBooked.contains(c.vehicleNumber))
			{
				carToBeUsedForBooking=c;
				break;
			}
		}
			
					
		
		
		
		if(bookedCarCount<cars.size() || shouldANewTripBeCreated){
			TripDetail newtrip = createTrip(customerID, startLocation, endLocation, startDate, endTime,
					tripID, carToBeUsedForBooking);
			
			carPoolingData.trips.add(newtrip);
			return newtrip.bookingID;
		}
		
		return "Sorry No Cars are available!!";

		
		
		
	}

	private static TripDetail createTrip(String customerID, String startLocation, String endLocation, Date startDate,
			Date endTime, String tripID, Car car) {
		TripDetail newtrip = new TripDetail();
		
		newtrip.bookingID = tripID;
		newtrip.car= car;
		newtrip.customerID = customerID;
		newtrip.endLocation=endLocation;
		newtrip.endTime=endTime;
		newtrip.startLocation=startLocation;
		newtrip.startTime=startDate;
		newtrip.status="Booked";
		return newtrip;
	}
	
	

}
