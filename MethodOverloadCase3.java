/* Case 3: In this case the arguments are at the same level*/

class MethodOverloadCase3{
	
	void test(StringBuffer str){
		System.out.println("String buffer method");
	}
	
	void test(String str){
		System.out.println("String method");
	}
	
	public static void main(String[] args){
		
		MethodOverloadCase3 o = new MethodOverloadCase3();
		o.test("abc");  // this will call the method havins string as the argument
		o.test(new StringBuffer("xyz")); // call to the string buffer method
		//o.test(null); // this will cause the complier to get in an ambigous state
		
	}

}