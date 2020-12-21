class SuperDemo1{

	int val = 10;

}

class Test extends SuperDemo1{

	int val = 20;
	void showVal(int val){
		System.out.println("Local Variable Val: " + val); // Local variable
		System.out.println("Current class Val: " + this.val); // current class instance variable
		System.out.println("Parent Class Val: " +super.val); // parent class instance variable
	}
	
	public static void main(String[] args){
		Test t = new Test();
		t.showVal(100);
	}
}