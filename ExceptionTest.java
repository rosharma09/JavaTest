class ExceptionTest{

	void show() throws Exception{
		System.out.println("parent class method");
	}
}

class Test extends ExceptionTest{
	
	void show() throws RuntimeException{
		System.out.println("child class method");
	}
	
	public static void main(String[] args){
		Test testObj = new Test();
		testObj.show();
	}	
	
}