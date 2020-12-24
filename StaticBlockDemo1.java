class StaticBlockDemo1{
	
	
	// The static method will be called first 
	static{
		System.out.println("Inside the static block");
	}

	
	public static void main(String[] args){
		// This will be executed after the static block execution
		System.out.println("Inside the main method");
	}
}