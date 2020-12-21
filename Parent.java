class Parent{

	String parentName;
	int parentAge;
	
	Parent(String pname , int page){
		this.parentName = pname;
		this.parentAge = page;
	}
	
	void parentMethod(){
		System.out.println("Hey I'm the parent");
	}

}

class Child1 extends Parent{
	
	String childName;
	int childAge;
	
	Child1(String cname , int cage){
		super("RP Sharma" , 56);
		this.childName = cname;
		this.childAge = cage;
	}
	
	void childMethod1(){
		System.out.println("Hey I'm the child");
	}
	
	public static void main(String[] args){
				
		Child1 c1 = new Child1("Rohan Sharma" , 25);
		System.out.println(c1.childName + " " + c1.childAge);
		
		System.out.println(c1.parentName + " " + c1.parentAge);
		
	}
}


class grandChild extends child1{
	
	
	
	void childMethod2(){
		System.out.println("Hey I'm the child");
	}
	
	
	
	
}