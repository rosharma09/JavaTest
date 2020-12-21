class Test1{
	
	String returnStringMethod(int a) throws Exception{
		return String.valueOf(a);
	}


}

class ExtendsTest1 extends Test1{
	
	StringBuffer returnStringMethod(int a) throws ArithmeticException{
		return String.valueOf(a);
	}
	public static void main(String[] args){
		Test1 obj = new Test1();
		String result = obj.returnStringMethod(1);
		System.out.println(result);
	}
	
}

