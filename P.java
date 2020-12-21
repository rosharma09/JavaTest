class P{

	String name;
	int val;
	
	
	void show(){
		System.out.println("Test");
	}
	
	void display(){
		System.out.println(name+" "+val);
	}

}

class Q extends P{
	
	public static void main(String[] args){
		
		
		Q obj = new Q();
		obj.name = "Rohan";
		obj.val=12;
		
		obj.display();
		obj.show();
		
		
	}
	
	
}