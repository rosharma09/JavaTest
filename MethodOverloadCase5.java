class MethodOverloadCase5{
	
	void test(int a){
		System.out.println("method with no arguments");
	}
	
	// This function is an example of variable length arguments ->> can have 0 or more arguments
	void test(int... a){
		System.out.println("method with 0 or multiple arguments arguments");
	}
	
	public static void main(String[] args){
		MethodOverloadCase5 o = new MethodOverloadCase5();
		o.test(1 , 2); // 
	}
}