import java.util.ArrayList;
import java.util.HashMap;

/**
 * CSYE 6200 Vehicle starter class
 * 
 * @author (Yuxi Zhang)
 * ID: (001668446)
 *
 */

//create a vehicle class
class Vehicle{
//variables in Vehicle class
	private int passengers;
	private int fuelCap;
	private double kpl;
	private String make,model,licensePlate;
	private int modelYear;
	private double range;
	
//constructor of Vehicle class
	public Vehicle(String make, String model, int modelYear,
			String licensePlate,int passengers,double kpl, int fuelCap){
		this.make=make;
		this.model=model;
		this.modelYear=modelYear;
		this.licensePlate=licensePlate;
		this.passengers=passengers;
		this.kpl=kpl;
		this.fuelCap=fuelCap;
	}

	//getters
	public String getMake() {
		return make;
	}
	public int getPassengers() {
		return passengers;
	}
	public int getFuelCap() {
		return fuelCap;
	}
	public double getKpl() {
		return kpl;
	}
	public String getModel() {
		return model;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public int getModelYear() {
		return modelYear;
	}
	public double getRange() {
		return range;
	}
	
	//calculate range method
	public double calRange(double kpl,int fuelCap){
		double range=kpl*fuelCap;
		this.range=range;
		return range;
	}
	
//display vehicle info method
	public void display(){
		String vehicleInfo=make+"\t"+model+"\t"+modelYear+"\t"
	+licensePlate+"\t"+passengers+"\t"+calRange(kpl,fuelCap);
		System.out.println(vehicleInfo);
	}
}

//create a vehicleTest class
public class VehicleTest {
	public static void run(){
		Vehicle minivan=new Vehicle("Mini","Cooper",2011,"5HZ964",2,15.75,40);
		//mini cooper: fuel capacity is 40 Liter,15.75 kpl
		Vehicle sportscar=new Vehicle("Volvo","S80",2013,"88TE32",4,8.92,68);
		//Volvo S80: fuel capacity is 68 Liter,8.92 kpl
		System.out.println("Make\tModel\tYear\tLicense\tPSGR#\tRange");
		minivan.display();
		sportscar.display();
		System.out.println();
		

		VehicleRegistry registerNewCar=new VehicleRegistry();
		registerNewCar.addVehicles(minivan);
		registerNewCar.addVehicles(sportscar);
		registerNewCar.loopVehicles();
	}
	public static void main(String[] args) {
		run();
	}
}

class VehicleRegistry{
	private ArrayList<Vehicle> vehicleHolder=new ArrayList<Vehicle>(5);
	private HashMap<String,Vehicle> vehicleLicense=new HashMap<String,Vehicle>();
	
	public void addVehicles(Vehicle car){
		vehicleHolder.add(car);
		vehicleLicense.put(car.getLicensePlate(), car);
	}
	public void getVehicles(String license){
		retrieveByLicense(license);
	}
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
//a method retrieve Vehicles by license plate 
	public Vehicle retrieveByLicense(String license){
		if(vehicleLicense.get(license)==null){
			return null;
		}
		return vehicleLicense.get(license);
	}
}
