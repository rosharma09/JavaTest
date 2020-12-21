interface Test{
	
	// Fields --> public , static and final
	
	public static final int a = 100;

	// abstract method --> public abstract
	void display();
	
	// default method --> public default concrete method
	default void display1(){
		System.out.println("Default Method inside interface");
	}
	
	// static method --> public static concrete method
	public static void display2(){
		System.out.println("Static Method inside interface");
	}
	
	// private method --> private concrete method
	private void display3(){
		System.out.println("Private Method inside interface");
	}


}

interface Test2{
	
	
	void method1(); // public abstract 
		
}

abstract class InterfaceSampleProgram implements Test , Test2{
	
	void testMethod(){
		System.out.println("Inside the abstract class");
	}
}

class Main extends InterfaceSampleProgram{
	
	public void display(){
		System.out.println("Overriden display method");
	}
	
	public void testMethod(){
		System.out.println("Overriden testMethod method");
	}
	
	public void method1(){
		System.out.println("Overriden method1 method");
	}
	
}