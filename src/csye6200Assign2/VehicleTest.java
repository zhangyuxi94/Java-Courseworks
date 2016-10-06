/**
 * CSYE 6200 Vehicle class
 * 
 * @author (Yuxi Zhang)
 * ID: (001668446)
 *
 */

package csye6200Assign2;

//create a vehicleTest class
public class VehicleTest {
	public static void run(){
	//test Class Vehicle
		Vehicle minivan=new Vehicle("Mini","Cooper",2011,"5HZ964",2,15.75,40);
		Vehicle sportscar=new Vehicle("Volvo","S80",2013,"VBG984",4,8.92,68);
		System.out.println("Make\tModel\tYear\tLicense\tPSGR#\tRange");
		minivan.display();
		sportscar.display();
		System.out.println();
		
	//test Class VehicleRegistry
		VehicleRegistry registerNewCar=new VehicleRegistry();
		//test addVehicles and loopVehicles
		registerNewCar.addVehicles(minivan);
		registerNewCar.addVehicles(sportscar);
		registerNewCar.loopVehicles();
		System.out.println();
		//test getVehicles
		registerNewCar.getVehicles(minivan.getLicensePlate());
		System.out.println();
		//test removeVehicles
		registerNewCar.removeVehicles(minivan.getLicensePlate());
		registerNewCar.loopVehicles();
		System.out.println();
	}
	
	public static void main(String[] args) {
		run();
	}
}

