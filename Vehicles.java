class Vehicles{
	
	String make ,category;
	double mileage;
	int seatingCapacity , modelYear;
	boolean isSelfDrive , isAutomatic;
	
	
	public static void main(String[] args){
		
		Vehicles v1 = new Vehicles();
		v1.make = "Hyundai";
		v1.category = "hatchback";
		v1.mileage = 21.7;
		v1.seatingCapacity = 5;
		v1.modelYear = 2019;
		v1.isSelfDrive = false;
		v1.isAutomatic = true;
		
		v1.display();
		
		
		Vehicles v2 = new Vehicles();
		v2.make = "Suzuki";
		v2.category = "SUV";
		v2.mileage = 11.7;
		v2.seatingCapacity = 7;
		v2.modelYear = 2020;
		
		v2.isSelfDrive = false;
		v2.isAutomatic = false;
		
		v2.display();
		
		
	}
	
	
	public void drive(){
		System.out.println("This car can drive");
	}
	
	public void horn(){
		System.out.println("Car can HONK !!!");
	}
	
	public void display(){
		
		System.out.println("make : " + make);
		System.out.println("category : " + category);
		System.out.println("mileage : " + mileage);
		System.out.println("seatingCapacity :" + seatingCapacity);
		System.out.println("modelYear : " + modelYear);
		System.out.println("Is Self Drive : " + isSelfDrive);
		System.out.println("Is Automatic : " + isAutomatic);
		System.out.println();
		
	}

}