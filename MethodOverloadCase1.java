/*Concept of Automatic promotion*/

/*Case 1: The char data type is automatically promoted to int*/

class MethodOverloadCase1{

	void test(int a){
		System.out.println("int method");
	}
	
	void test(String s){
		System.out.println("String method");
	}
	
	public static void main(String[] args){
		MethodOverloadCase1 o = new MethodOverloadCase1();
		o.test(1); // call the test method with int argument
		o.test("abc"); // call the test method with String argument
		
		o.test('a'); // char will be automatically propomted to int type to match the method
	}
	
}