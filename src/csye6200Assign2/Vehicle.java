/**
 * CSYE 6200 Vehicle class
 * 
 * @author (Yuxi Zhang)
 * ID: (001668446)
 *
 */

package csye6200Assign2;

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
