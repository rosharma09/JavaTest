class OverloadMain{
	
	public static void main(String[] args){
		
		System.out.println("Inside the main() method");
		main(10);
		main("Call Overloaded Main");
		
	}
	
	public static void main(int a){
		System.out.println("Inside the overloaded main() mehthod");
	}
	
	public static void main(String s){
		System.out.println("Inside the overloaded main() mehthod");
	}

}