abstract class VehicleTest{
	
	String MEASURE;
	int no_of_tyres; 
	int no_of_airbags; 
	int seatingCapacity;
	double efficiency;
	String model;
	String segment;
	int year;
	boolean is_automatic;
	
	abstract double mileage(double distance , double liters);
	abstract String segment(int capacity);
	

}

class Car extends VehicleTest{
		
	double distanceTraveled;
	double fuelUsed; 
	
	// Create parameterized constructor of the class
	
	Car(int d , int f){
		this.distanceTraveled = d;
		this.fuelUsed = f;
	}
	
	double mileage(double dis , double ltrs){
		return dis / ltrs;
	}
	
	String segment(int cap){
		if(cap == 4 || cap == 5){
			return "Hatch Back";
		}
		else if(cap == 7 || cap == 6){
			return "SUV";
		}
		else{
			return null;
		}
	}
	
	public static void main(String[] args){
		//Note : Abstract class cannot be instantiated --> cannot create an object of abstract class
		//VehicleTest vObj = new VehicleTest();
		
		Car cObj = new Car(600,100);
		
		cObj.no_of_tyres = 4;
		cObj.no_of_airbags = 2;
		cObj.seatingCapacity = 4;
		cObj.model = "Hyundai i20";
		cObj.year = 2019;
		cObj.is_automatic = false;
		cObj.MEASURE = "kmpl";
		
		cObj.efficiency = cObj.mileage(cObj.distanceTraveled , cObj.fuelUsed);
		System.out.println("Mileage of "+cObj.model+" which is a "+ cObj.segment(cObj.seatingCapacity)+": " +String.valueOf(cObj.efficiency) +" "+cObj.MEASURE);
		
	}
	
}