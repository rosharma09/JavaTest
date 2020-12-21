class ThisDemo2{

	void display(int result){
		System.out.println(result);
	}

	void sum(int a , int b){
		int c = a + b;
		this.display(c); // if we don't add this keyword for the class method which is called, in that case the compiler will automatically add this keyword to invoke the current class method
	}

}

class Test{

	public static void main(String[] args){
		ThisDemo2 td2 = new ThisDemo2();
		td2.sum(12,45);
	
	}

}