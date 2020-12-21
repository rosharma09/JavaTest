/*In case of the abstract class, a class extending an abstract class must override all the abstract method of the abstract class*/

abstract class Class1{
	
	// Non-abstract method
	void display(){
		System.out.println("Non abstract method");
	}
	
	// abstract method
	abstract void display1();
	

}

class Class2 extends Class1{
	
	void display1(){
		System.out.println("Override abstract method");
	}
	
	public static void main(String[] args){
		
		Class2 obj = new Class2();
		obj.display1();
		obj.display();
		
	}
	
}