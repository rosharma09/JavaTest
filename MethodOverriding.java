class MethodOverrding{
	
	Object show(){
		System.out.println("Inside Super Class");
		return null;
	}
	
}

class SubClass extends MethodOverrding{
	
	String show(){
		System.out.println("Inside sub class");
		return null;
	}
	
	public static void main(String[] args){
		MethodOverrding parentClassObj = new MethodOverrding();
		parentClassObj.show(); // this will call the super class method
		
		SubClass childClassObj = new SubClass();
		childClassObj.show(); // this will call the sub class method
	}
	
}