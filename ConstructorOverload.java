class ConstructorOverload{

	ConstructorOverload(int a){
		System.out.println("Parameterized contructor with single argument");
	}
	
	ConstructorOverload(int a , int b){
		System.out.println("Parameterized contructor with two argument");
	}


	public static void main(String[] args){
		
		ConstructorOverload obj = new ConstructorOverload(10);
		
	}

}