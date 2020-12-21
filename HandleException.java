class HandleException{
	
	int num1,num2;

	
	public HandleException(int n1 , int n2){
		this.num1 = n1;
		this.num2 = n2;
	}
	

	int div(int a , int b){
		return a/b;		
	}

}

class ExceptionDemo extends HandleException{
	
	public ExceptionDemo(int n1 , int n2){
		super(n1 , n2);
	}
	
	int div(int a , int b){
		return a/b;
	}
	
	public static void main(String[] args) {
		ExceptionDemo obj1 = new ExceptionDemo(12,24);
		obj1.div(obj1.num1 , obj1.num2);
	}
	
}