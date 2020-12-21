class FinalDemo2{
	
	// Overidden method
	// When we define the method as final, then this method cannot be overidden 
	final void m1(){
		System.out.println("Inside FinalDemo2");
	}

}

class Test extends FinalDemo2{
	
	// Overidding method
	void m1(){
		System.out.println("Inside Test class");
	}

	public static void main(String[] args){
		
	}

}