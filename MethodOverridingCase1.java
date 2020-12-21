/* Case 1 : The access modifier for the overidden method must always be weaker than the access modifier of the child class method

If(Child method access modifier is public)
	then access modifier for the parent class method can be: default, protected , public
	
If(Child method access modifier is protected)
	then access modifier for the parent class method can be: default, protected
	
If(Child method access modifier is private)
	then access modifier for the parent class method can be: private, 

*/

class MethodOverridingCase1{
	
	public void test(){
		System.out.println("Overidden Method");
	}
	
}

class SubClass extends MethodOverridingCase1{
	
	private void test(){
		System.out.println("Overidding Method");
	}
	
	public static void main(String[] args){
		MethodOverridingCase1 obj1 = new MethodOverridingCase1();
		//obj1.test();
		
		SubClass obj2 = new SubClass();
		obj2.test();
	}
	
}