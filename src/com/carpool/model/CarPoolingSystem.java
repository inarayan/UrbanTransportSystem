package com.carpool.model;

import java.util.List;

public  class CarPoolingSystem {

	public List<Car> cars;
	
	public List<TripDetail> trips ;
	
	@Override
	public String toString() {
		return "CarPoolingSystem [cars=" + cars + ", trips=" + trips + "]";
	}
	
	
}
