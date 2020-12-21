/*This program is to illustrate the concept of overidding with exception handling*/

class SuperClass{
	
	Object test(){
		System.out.println("Super Class Method");
		return null;
	}

}

class SubClass extends SuperClass{
	
	Object test() throws RuntimeException{
		System.out.println("Sub Class Method");
		return null;
	}
	
	public static void main(String[] args){
		
		SubClass obj = new SubClass();
		try{
			obj.test();
		}catch(Exception e){
			System.out.println("Exception Caught");
		}
		
	}
	
}