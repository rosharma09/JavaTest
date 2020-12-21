class Electronics{
	
	void elec(){
		System.out.println("Inside elec method");
	}
	
}


class Mobile extends Electronics{
	
	public static void main(String[] args){
		
		Mobile m = new Mobile();
		m.elec();
		
	}
	
}

class Laptops extends Electronics{
	
	public static void main(String[] args){
		
			Laptops lap = new Laptops();
			lap.elec();
	}
	
}