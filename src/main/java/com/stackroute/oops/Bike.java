package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
	
    private String modelName;
	
	private String Type;
	
	private String Name;
	
	
	
    public Bike() {
    	
    	
    }
    public Bike(String name, String modelName, String type) {
	
		this.Name = name;
		this.modelName = modelName;
		this.Type = type;
		
	}
    
    

	public String getName() {
		return Name;
	}



	public String getModelName() {
		return modelName;
	}



	public String getType() {
		return Type;
	}



	/*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(String bikeType) {
    	if(bikeType.equalsIgnoreCase("Sports")) {
    		return 300;
    	}else if (bikeType.equalsIgnoreCase("cruiser")) {
    		return 170;
		}else {
			return 0;
		}
		
    }

    /*
    should return in the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	return String.format("Bike{Manufacturer name:%s,Model Name:%s,Type:%s}",this.Name,this.modelName,this.Type);
    }
}
