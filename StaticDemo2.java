import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StaticDemo2{
	
	int eId;
	String eName;
	String dName;
	static String companyName = "o9 Solutions";
	static int emp_count = 0;
	
	static List<String> empNameList = new ArrayList<String>();
	static List<String> devTeam = new ArrayList<String>();
	static List<String> qaTeam = new ArrayList<String>();
	
	public StaticDemo2(int eId , String eName , String dName){
		
		this.eId = eId;
		this.eName = eName;
		this.dName = dName;
		emp_count++;
		empNameList.add(eName);
		
		if(dName.equals("RND-DEV")){
			devTeam.add(eName);
		}
		else if(dName.equals("RND-QA")){
			qaTeam.add(eName);
		}
	}
	
	
	void displayDetails(){
		
		System.out.println("Employee Id: " +eId);
		System.out.println("Employee Name: "+eName);
		System.out.println("Dept Name: "+dName);
		System.out.println("Company Name: "+StaticDemo2.companyName);
		System.out.println();
	}
	
	public void displayEmpNames(){
		System.out.println("Employee List");
		for(String n : empNameList){
			System.out.println(n);
		}
		System.out.println();
	}
	
	public void dispDevTeam(){
		System.out.println("Dev Team List:");
		for(String n:devTeam){
			System.out.println(n);
		}
		System.out.println();
	}
	
	public void dispQaTeam(){
		System.out.println("QA Team List");
		for(String n:qaTeam){		
			System.out.println(n);
		}
		System.out.println();
	}
	
}

class Test{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		StaticDemo2 s1 = new StaticDemo2(101 , "Rohan Sharma" , "RND-QA" );
		s1.displayDetails();
		StaticDemo2 s2 = new StaticDemo2(102 , "Jayant Paul" , "RND-QA" );
		s2.displayDetails();
		StaticDemo2 s3 = new StaticDemo2(103 , "Rishab Singh" , "RND-DEV" );
		s3.displayDetails();
		StaticDemo2 s4 = new StaticDemo2(104 , "Roopa Patil" , "RND-QA" );
		s4.displayDetails();
		StaticDemo2 s5 = new StaticDemo2(105 , "Hemal Shah" , "RND-QA" );
		s5.displayDetails();
		StaticDemo2 s6 = new StaticDemo2(106 , "Deepa Sharma" , "RND-DEV" );
		s6.displayDetails();
		StaticDemo2 s7 = new StaticDemo2(107 , "Vinay Pathak" , "RND-QA" );
		s7.displayDetails();
		StaticDemo2 s8 = new StaticDemo2(108 , "Shama Shah" , "RND-QA" );
		s8.displayDetails();
		
		System.out.println("Employee Count: " +StaticDemo2.emp_count);
		
		// Display the names of all the employees
		s1.displayEmpNames();
		s1.dispDevTeam();
		s1.dispQaTeam();
	}
	
	
}