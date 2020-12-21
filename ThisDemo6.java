class ThisDemo6{

	ThisDemo6 returnThisDemoReference(){
		return this;
	}


}

class Main{

	public static void main(String[] args){
	
		ThisDemo6 td6 = new ThisDemo6();
		td6.returnThisDemoReference();
		
	
	}
}
