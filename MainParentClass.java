/*This program illustrate the methods which cannot be overidden*/


class MainParentClass{
	
	//1. Final methods cannot be overridden
	
	final void test(){
		System.out.println("Test Method");
	}
	
	//2. static method cannot be overridden

	static void test1(){
		System.out.println("Static method of parent Class");
	}
	
	//3. Private methods cannot be overridden
	
	private void test2(){
		System.out.println("Private method of main class");
	}
}


class MainChildClass extends MainParentClass{
	
	public void testChild(){
		System.out.println("Test Method of Child class");
	}
	
	static void test1(){
		System.out.println("Static method of child Class");
	}
	
	public void test2(){
		System.out.println("Private method of child class");
	}
	
	public static void main(String[] args){
		
		MainChildClass cObj = new MainChildClass();
		cObj.test();
		
		cObj.test1();
		cObj.test2();
		
	}
	
}