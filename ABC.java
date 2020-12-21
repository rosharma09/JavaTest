class ABC{
	
	double divide(int a , int b){
		return a/b;
	}
	
}

class PQR extends ABC{
	
	int divide(int a , int b){
		if(a < b){
			int temp = a;
			a = b;
			b = temp;
		}
		return a/b;
	}
	
	public static void main(String[] args){
		ABC abc = new ABC();
		double res = abc.divide(12,48);
		System.out.println(res);
		
		System.out.println("++++++++++++++++++++++++++");
		
		PQR pqr = new PQR();
		res = pqr.divide(12,48);
		System.out.println(res);
		
	}
	
}