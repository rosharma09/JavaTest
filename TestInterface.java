/*Interface in java contains only abstract methods()*/

interface I1{

	void display();

}

class TestInterface implements I1{
	
	public void display(){
		System.out.println("Implemented Method");
	}
	
	public static void main(String[] args){
		TestInterface tObj = new TestInterface();
		tObj.display();
	}
	
}