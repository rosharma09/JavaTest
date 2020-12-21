class ThisDemo1{

	String name;
	
	void setName(String name){
		
		// this is used as a reference to the current class object 
		// this.name --> reference to the current class instance variable
		this.name = name;
	}
	
	void display(){
		System.out.println(name);
	}

}

class Test{
	
	public static void main(String[] args){
		ThisDemo1 td1 = new ThisDemo1();
		td1.setName("Rohan");
		td1.display();
	}
}