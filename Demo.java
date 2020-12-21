class Demo{
	
	void show(){
		System.out.println("show() with no arguments");
	}
	
	/*
	void show(){
		System.out.println("show() with no arguments");
	}
	*/
	
	void show(int a){
		System.out.println("show() with single argument of type int");
	}
	
	void show(String a){
		System.out.println("show() with single argument of type String");
	}
	
	void show(int a , String s){
		System.out.println("show() method with two arguments of type int and String");
	}
	
	void show(String a , int s){
		System.out.println("show() method with two arguments of type string and int");
	}
	
	public static void main(String args[]){
		
		Demo dObj = new Demo();
		dObj.show();
		dObj.show(12);
		dObj.show("test");
		dObj.show(10 , "test");
		dObj.show("test" , 10);
		
	}

}