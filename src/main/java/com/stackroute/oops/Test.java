package com.stackroute.oops;

public class Test {
	
	public static void main(String[] args) {
		
		VehicleService vehicleService=new VehicleService();
		Bike createBike = vehicleService.createBike("BMW", "S1000RR", "sports");
		Car createCar = vehicleService.createCar("Maruti Suziki", "Baleno", "sedan");
		
		System.out.println(createBike.getManufacturerInformation());
		System.out.println(createCar.getManufacturerInformation());
		
	}

}
