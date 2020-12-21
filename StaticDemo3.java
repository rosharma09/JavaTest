class StaticDemo3{
	static void m1(){
		System.out.println("1");
	}
	
	void display(){
		System.out.println();
	}
	
	public static void main(String[] args){
		m1(); // If the static method is inside the same class, then we need not specify the class Name to which it belongs 
		XYZ.m2(); // if the static method is outside the class, then we need to specify the class Name to which it belongs
		
		StaticDemo3 sd3 = new StaticDemo3();
		
		sd3.display();
	}

}


class XYZ{
	
	static void m2(){
		System.out.println("2");
	}

}