class ThisDemo4{
	
	// td is reference of class ThisDemo4 
	void m1(ThisDemo4 td){
		System.out.println("Inside m1 Method");
	}
	
	void m2(){
		m1(this);
	}

}

class Test{

	public static void main(String[] args){
	
		ThisDemo4 td4 = new ThisDemo4();
		td4.m2();
	
	}

}