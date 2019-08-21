package com.carpool.db;

import java.util.ArrayList;

import com.carpool.model.Car;
import com.carpool.model.CarPoolingSystem;
import com.carpool.model.Customer;

public class Data {
	
	private static  CarPoolingSystem carPoolingSystem;

	public static CarPoolingSystem getCarPoolingSystem() {
		if(carPoolingSystem==null){
			carPoolingSystem=loadData();
			return carPoolingSystem;
		}else{
			return carPoolingSystem;
		}
		
		
	}



	public static CarPoolingSystem loadData(){
		
		//load 2 cusomter
		Customer cs1 = new Customer();
		cs1.bookingID=new ArrayList<>();
		
		Customer cs2 = new Customer();
		cs2.bookingID= new ArrayList<>();
		
		//load Vehicle list registered with pooling system
		Car car1 = new Car();
		car1.modelType="Sedan";
		car1.vehicleNumber="ABC1";
		
		Car car2 = new Car();
		car2.modelType="XL";
		car2.vehicleNumber="ABC2";
		
		Car car3 = new Car();
		car3.modelType="XL";
		car3.vehicleNumber="ABC4";
		
		
		CarPoolingSystem carPoolingSystem = new CarPoolingSystem();
		carPoolingSystem.trips= new ArrayList<>();
		carPoolingSystem.cars = new ArrayList<Car>();
		carPoolingSystem.cars.add(car1);
		carPoolingSystem.cars.add(car2);
		carPoolingSystem.cars.add(car3);
		
		return carPoolingSystem;
		
		
		
	}
	
	
}
