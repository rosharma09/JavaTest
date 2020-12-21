class Demo1{
	
	void test(){
		System.out.println("test() method having return type as void");
	}
	
	int test(int a){
		System.out.println("test() method having return type as int");
		return a*a;
	}


	public static void main(String[] args){
		Demo1 dObj = new Demo1();
		int res = dObj.test(10);
		System.out.println(res);
	}
	

}