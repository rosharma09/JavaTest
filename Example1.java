class Example1{
	
	void method(){
		System.out.println("Inside Parent Class");
	}

}

class Test extends Example1{
	
	void method(){
		// In order to call the parent class method, we can use the super keyword
		super.method();
		System.out.println("Inside Child Class");
	}
	
	public static void main(String[] args){
		
		Test tObj = new Test();
		tObj.method();
	
		
	}
	
	
}

