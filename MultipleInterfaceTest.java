interface I1{
	void methodI1();
}

interface I2{
	void methodI2();
}

interface I3 extends I1 , I2{
	void methodI3();
}

class MultipleInterfaceTest implements I3{
	
	public void methodI1(){
		System.out.println("Method of I1 - Implementation");
	}
	
	public void methodI2(){
		System.out.println("Method of I2 - Implementation");
	}
	
	public void methodI3(){
		System.out.println("Method of I3 - Implementation");
	}
	
	
	public static void main(String[] agrs){
		MultipleInterfaceTest obj = new MultipleInterfaceTest();
		obj.methodI1();
		obj.methodI2();
		obj.methodI3();
	}
}