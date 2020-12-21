class MethodOverloadCase4{
	
	void test(int a , float f){
		System.out.println("int float method");
	}
	
	void test(float f , int a){
		System.out.println("float int method");
	}
	
	
	void test(float a , float b){
		System.out.println("float float method");
	}

	public static void main(String[] args){
		MethodOverloadCase4 o = new MethodOverloadCase4();
		o.test(10 , 21.5f);
		o.test(12.3f , 12);
		o.test(12.4f , 45.23f);
		o.test(12.9f,12);
	}

}