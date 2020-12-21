class StaticDemo1{
	
	static int a = 10; // variables defined as static becomes class variables and can be shared across the objects of the class 
	
	public static void main(String[] args){
		
		StaticDemo1 sd1 = new StaticDemo1();
		System.out.println(StaticDemo1.a);
	
	}
}