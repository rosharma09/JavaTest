class ConstructorExample{
	
	public ConstructorExample(){
		System.out.println("Inside User Defined Constructor");
	}
	
	public ConstructorExample(String str){
		System.out.println("Inside User Defined Parameterised Constructor");
	}
	
	public static void main(String[] args){
		
		ConstructorExample c1 = new ConstructorExample();
		ConstructorExample c2 = new ConstructorExample("CallParameterisedConstructor");
		
		
	}


}