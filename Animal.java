class Animal{
	
	String color;
	int age;
	boolean canSwim;
	
	public static void main(String[] args){
		
		Animal dog = new Animal();
		dog.color = "brown";
		dog.age = 4;
		dog.canSwim = true;

		Animal cat = new Animal();
		cat.color = "white";
		cat.age = 2;
		cat.canSwim = false;
		
		System.out.println(dog.color + " " + dog.age + " " + dog.canSwim);
		System.out.println(cat.color + " " + cat.age + " " + cat.canSwim);
		
		Birds b1 = new Birds();
		b1.initObj(10 , "Green");
		b1.display();
		
	}	
	
}

class Birds{
	
	int wingSpan;
	String color;
	
	public void initObj(int a , String c){
		wingSpan = a;
		color = c;
		
	}
	
	public void display(){
		System.out.println(wingSpan + " " + color);
	}
		
	
	
	
	
}