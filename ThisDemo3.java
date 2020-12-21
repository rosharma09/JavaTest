class ThisDemo3{

	// this() can be used to call the constructor of the current class
	
	ThisDemo3(){
		System.out.println("No args constructor");
	}
	
	ThisDemo3(int a){
		this();
		System.out.println("Single arg constructor");
	}
	
	ThisDemo3(int a, int b){
		this(a);
		System.out.println("Two arg constructor");
	}
	
}

class Test{
	
	public static void main(String[] args){
		ThisDemo3 td3 = new ThisDemo3(10 , 20);
	}
}