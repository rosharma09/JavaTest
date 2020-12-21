/*Super Class - Parent Class*/
class A{

	String text;
	int num;
	boolean val;
	double decimal;
	
	void classAMethod(){
		System.out.println("Inside the Class A Method");
	}

}

/*Sub Class - Child Class*/
class B extends A{
	
	void classBMethod(){
		System.out.println("Inside the Class B Method");
	}
	
	public static void main(String[] args){
		
		B classBObj = new B(); // Sub class object
		A classAObj = new A(); // Super Class Object
		classBObj.classBMethod();
		classBObj.classAMethod();
		
		classAObj.classAMethod();
		//classAObj.classBMethod();
		
	}
}