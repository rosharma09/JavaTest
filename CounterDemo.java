class CounterDemo{
	
	int counter1 = 0; // class instance variable --> allocated memory for every object created in the heap memory
	static int counter = 0; // class variable --> allocated memory only once in the class  area and can be shared across all the objects
	
	CounterDemo(){
		counter++;
		counter1++;
		System.out.println(CounterDemo.counter); // Static variables are to be used in a static way --> Using the className.Static_variableName
		System.out.println(counter1);
	}
	
	public static void main(String[] agrs){
		CounterDemo c1 = new CounterDemo();
		CounterDemo c2 = new CounterDemo();
		CounterDemo c3 = new CounterDemo();
		CounterDemo c4 = new CounterDemo();
	}
	

}