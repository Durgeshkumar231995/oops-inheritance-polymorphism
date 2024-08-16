package com.stackroute.oops;

public class Car extends AbstractManufacturer implements Vehicle {
	
	private String name;
	private String modelName;
	private String Type;
	
	

    public Car() { 	
    	
    }
    
    
    public Car(String name, String modelName, String Type) {
		
		this.name = name;
		this.modelName = modelName;
		this.Type = Type;
		
	}
    
    


	public String getName() {
		return name;
	}


	public String getModelName() {
		return modelName;
	}



	public String getType() {
		return Type;
	}



	/*
    Method returns maximum speed depending upon their types
    For sports-250kmh
    For sedan-190kmh
     */
    @Override
    public int maxSpeed(String carType) {
    	if(carType.equalsIgnoreCase("sports")) {
    		return 250;
    	}else if (carType.equalsIgnoreCase("sedan")) {
    		return 190;
		}else {
			return 0;
		}
        
    }

    /*
    should return in the format : Car{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
    	
        return String.format("Car{Manufacturer name:%s,Model Name:%s,Type:%s}",this.name,this.modelName,this.Type);
    }
}

// return String.format("Car{Manufacturer name:'%s',Model Name:'%s',Type:'%s'}",manufacturerName, modelName, type);
