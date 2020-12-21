interface BMW{
	
	// The access modifier for the methods in interface is public
	void mileage(int dist , int ltr);
}

class BMWseries7 implements BMW{
	
	int dist , ltr;
	
	
	public BMWseries7(int d , int l){
		this.dist = d;
		this.ltr = l;
	}
	
	void mileage(int distance , int liters){
		return distance/liters;
	}
	
	public static void main(String[] args){
		BMWseries7 bmwObj = new BMWseries7(600 , 30);
		System.out.println("The Mileage of the car is:" +bmwObj.mileage(bmwObj.dist , bmwObj.ltr)+"kmpl");
	}
	
}