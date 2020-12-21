abstract class Vehicle{

	int no_of_tyres;
	
	abstract void start(String method);

}

class Car extends Vehicle{
	
	void start(String startMethod){
		System.out.println("Start with: " +startMethod);
	}

}

class Scooter extends Vehicle{
	
	void start(String startMethod){
		System.out.println("Start with: " +startMethod);
	}

}

class Main{

	public static void main(String[] args){
		
		Car carObj = new Car();
		carObj.no_of_tyres = 4;
		System.out.println("Number Of Tyres: " + carObj.no_of_tyres);
		carObj.start("Key");
		
		Scooter scooterObj = new Scooter();
		scooterObj.no_of_tyres = 2;
		System.out.println("Number of tyres: " + scooterObj.no_of_tyres);
		scooterObj.start("Kick");
		
	}
	
}