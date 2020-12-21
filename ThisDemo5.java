class Test1{
	
	Test1(Test t){	
		System.out.println("Test1 class constructor");	
	}
	
	
}

class Test{

	Test(ThisDemo5 td){
		System.out.println("Test class constructor");
		Test1 t1 = new Test1(this);
	}

}


class ThisDemo5{

	void callTestClassConstructor(){
		Test tObj = new Test(this);
	}


}

class Main{

	public static void main(String[] agrs){
	
		ThisDemo5 td5 = new ThisDemo5();
		td5.callTestClassConstructor();
	}

}