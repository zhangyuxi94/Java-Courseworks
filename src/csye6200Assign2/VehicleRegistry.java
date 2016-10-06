/**
 * CSYE 6200 Vehicle class
 * 
 * @author (Yuxi Zhang)
 * ID: (001668446)
 *
 */

package csye6200Assign2;

import java.util.ArrayList;
import java.util.HashMap;

class VehicleRegistry{
	//a private ArrayList for holding Vehicles
	private ArrayList<Vehicle> vehicleHolder=new ArrayList<Vehicle>(5);
	//a private HashMap stores Vehicles by license Number
	private HashMap<String,Vehicle> vehicleLicense=new HashMap<String,Vehicle>();
	
	//adding vehicles
	public void addVehicles(Vehicle car){
		vehicleHolder.add(car);
		vehicleLicense.put(car.getLicensePlate(), car);
	}
	
	//getting Vehicles
	public void getVehicles(String license){
		Vehicle retrieve=retrieveByLicense(license);
		String output=retrieve.getMake()+"\t"+retrieve.getModel()+"\t"
				+retrieve.getModelYear()+"\t"+retrieve.getLicensePlate()+"\t"
				+retrieve.getPassengers()+"\t"+retrieve.getRange();
		System.out.println("Get the Vehicle data by license:");
		System.out.println("Make\tModel\tYear\tLicense\tPSGR#\tRange");
		System.out.println(output);
	}
	
	//removing Vehicles
	public void removeVehicles(String license){
		if(retrieveByLicense(license)!=null){
			for(int i=0;i<vehicleHolder.size();i++){
				if(vehicleHolder.get(i).getLicensePlate()==license){
					vehicleHolder.remove(i);
				}
			}
		};
	}
	
//a method loops through all vehicles in ArrayList and display
	public void loopVehicles(){
		System.out.println("Display all vehicles in the arraylist:");
		System.out.println("Make\tModel\tYear\tLicense\tPSGR#\tRange");
		for(Vehicle car:vehicleHolder){
			String vehicleInfo=car.getMake()+"\t"+car.getModel()+"\t"
		+car.getModelYear()+"\t"+car.getLicensePlate()+"\t"
					+car.getPassengers()+"\t"+car.getRange();
			System.out.println(vehicleInfo);
		}
	}
	
//a method retrieve Vehicles by license plate String
	public Vehicle retrieveByLicense(String license){
		if(vehicleLicense.get(license)==null){
			return null;
		}
		return vehicleLicense.get(license);
	}
}