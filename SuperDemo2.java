class SuperDemo2{

	void m1(){
		System.out.println("M1 - Parent Class");
	}
	
	void m3(){
		System.out.println("M3 - Parent Class");
	}

}


class Test extends SuperDemo2{

	void m1(){
		System.out.println("M1 - Child Class");
	}
	
	void m2(){
		System.out.println("M2 - Child Class");
		this.m1(); // Complier will add this keyword implicitly
		super.m1(); // refers to the parent class method
	}
	
	void m3(){
		super.m3();
	}
	
	void m4(){
		System.out.println("M4 - Child Class");
	}

	public static void main(String[] args){
		Test t = new Test(); // Child class object
		SuperDemo2 sd2 = new SuperDemo2(); // parent class object
		t.m1();
		t.m2();
		t.m4();
		
		
		try{
			t.m3();
		}catch(StackOverflowError e){
			//e.printStackTrace();
			System.out.println("Recurrsive function readed limit");
		}
		
		
		sd2.m1();
		sd2.m3();
		
	}
}