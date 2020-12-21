/* Case 2: In this example the arguments are at different level*/

class MethodOverloadingCase2{
	
	
	// Object is the super class of all the classes in java
	// Object class alone doesn't have any super class
	void test(Object o){
		System.out.println("int method");
	}
	
	void test(String str){
		System.out.println("String method");
	}
	
	public static void main(String[] args){
		MethodOverloadingCase2 o = new MethodOverloadingCase2();
		o.test('a'); // The char data type is automatically prompoted to int data type
		o.test("abc"); // this will call the test() with string 
		
		/*While resolving the overloaded mehtods, complier will always give preference to the child type argument than 
		Comapared to the parent type argument
		*/
		
	}

}