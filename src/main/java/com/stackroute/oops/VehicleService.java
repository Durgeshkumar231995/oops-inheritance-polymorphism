package com.stackroute.oops;

public class VehicleService {
	
    /*
    create a Car object and return it
    
     */
	
    public Car createCar(String name, String modelName, String type) {
  
        return new Car(name,modelName,type);
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
    	 
        return new Bike(name,modelName,type);
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {

		Car ty = (Car) first;
		Bike b = (Bike) second;

		if (ty.getType().equals("sports") && b.getType().equals("sports")) {
			int firstMaxSpeed = first.maxSpeed("sports");
			int secondMaxSpeed = second.maxSpeed("sports");

			System.out.println(firstMaxSpeed + " " + secondMaxSpeed);
			if (firstMaxSpeed == secondMaxSpeed) {
				return 0;
			} else {

				return (firstMaxSpeed < secondMaxSpeed) ? secondMaxSpeed : firstMaxSpeed;
			}

		} else {
			return -1;
		}

	}
}
