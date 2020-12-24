class StaticBlockDemo2{
	
	static int ele1;

	static{
		ele1 = 10;
		System.out.println("Static Block 1");
		System.out.println(ele1);
	}
	
	static{
		System.out.println("Static Block 2");
	}
	
	public static void main(String[] args){
		
		System.out.println("Inside the Main() method");
	}
	
	static{
		System.out.println("Static Block 3");
	}


}