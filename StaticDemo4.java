class StaticDemo4{
	
	static int i = 10;
	
	static void m1(){
		System.out.println("Method - m1()"+i);
	}
}

class New{
	
	public New(int a){
		System.out.println("Inside parameterised constructor");
	}
	
	public New(){
		this(10);
		System.out.println("Inside New Class constructor");
	}
	
	void m2(){
		
		System.out.println("Overidden Method - m2() - New Class");
	}
}

class New1 extends New{
	
	void m2(){
		super.m2();
		System.out.println("Overidding Method - m2()");
	}
	
	void m3(){
		System.out.println("Method - m3()");
	}	
}

class Test{
	
	public static void main(String[] args){
		
		StaticDemo4.m1();
		New1 obj1 = new New1();
		obj1.m2();
		
	}
	
}

