class SuperDemo3{

	//parent class constructor 
	SuperDemo3(int a){
		System.out.println("Parent class constructor");
	}
	
	SuperDemo3(){
		System.out.println("Parent class constructor - No agrs");
	}

}

class Test extends SuperDemo3{
	
	// child class constructor
	Test(){
		// Compiler will implicitly call the parent class constructor
		super();
		System.out.println("Inside child class constructor");
	}

	public static void main(String[] agrs){
		
		Test tObj = new Test();
	
	}
}