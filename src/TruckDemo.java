class NewVehicle {
  private int passengers; // number of passengers   
  private int fuelcap;// fuel capacity in gallons 
  private int mpg;// fuel consumption in miles per gallon
  NewVehicle(int p,int f,int m){
	  passengers=p;
	  fuelcap=f;
	  mpg=m;
  }
  int range(){
	  return mpg*fuelcap;
  }
  double fuelneeded(int miles){
	  return (double)miles/mpg;
  }
  int getPassengers(){
	  return passengers;
  }
  void setPassengers(int p){
	  passengers=p;
  }
  int getFuelcap(){
	  return fuelcap;
  }
  void setFuelcap(int f){
	  fuelcap=f;
  }
  int getMpg(){
	  return mpg;
  }
  void setMpg(int m){
	  mpg=m;
  }
}
class Truck extends NewVehicle{
	private int cargocap;
	Truck(int p, int f, int m, int c){
		super(p,f,m);
		cargocap=c;
	}
	
	int getCargo(){
		return cargocap;
	}
	void putCargo(int c){
		cargocap=c;
	}
}


public class TruckDemo {
	public static void main(String[] args) {
		   Truck semi = new Truck(2, 200, 7, 44000);
		    Truck pickup = new Truck(3, 28, 15, 2000);
		    double gallons;
		    int dist = 252;
		 
		    gallons = semi.fuelneeded(dist); 

		    System.out.println("Semi can carry " + semi.getCargo() +
		                       " pounds.");
		    System.out.println("To go " + dist + " miles semi needs " +
		                       gallons + " gallons of fuel.\n");

		    gallons = pickup.fuelneeded(dist);

		    System.out.println("Pickup can carry " + pickup.getCargo() +
		                       " pounds.");
		    System.out.println("To go " + dist + " miles pickup needs " +
		                       gallons + " gallons of fuel.");

		
		NewVehicle minivan=new NewVehicle(7,16,21);
		NewVehicle sportscar=new NewVehicle(2,14,12);
	    gallons = minivan.fuelneeded(dist);

	    System.out.println("To go " + dist + " miles minivan needs " +
	                       gallons + " gallons of fuel.");

	    gallons = sportscar.fuelneeded(dist);

	    System.out.println("To go " + dist + " miles sportscar needs " +
	                       gallons + " gallons of fuel.");
		
	}
}
