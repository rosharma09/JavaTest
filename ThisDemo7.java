class ThisDemo7{
	
	int rollNo;
	String name;
	String DOB;
	
	// No arg Constructor
	public ThisDemo7(){
		
		this(1); // This should be the first statement in the constructor
		System.out.println("Calling Constructor");
		
	}
	
	public ThisDemo7(int a){
		this(1,2);
		System.out.println("Calling Againg Constructor");
	}
	
	public ThisDemo7(int a , int b){
		System.out.println("Calling");
	}

	void setData(int rollNo , String name , String DOB){
		//U1: Refer class instance variable
		this.rollNo = rollNo;
		this.name = name;
		this.DOB = DOB;
		
		this.displayData(this.rollNo , this.name , this.DOB); // U2: Call the method of current class
	}
	
	void displayData(int rollno , String name1 , String dob){
		
		System.out.println("Name: " +name1);
		System.out.println("Roll No: " +rollno);
		System.out.println("Date of Birth: " +dob);
	}

}

class Main{

	public static void main(String[] args){
		
		ThisDemo7 td7 = new ThisDemo7();
		td7.setData(101 , "Rohan Sharma" , "09-June-1995");
			
	}

}