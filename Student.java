import java.util.*;
import java.util.Scanner;

class Student{
	
	String fName , mName , lName , emailId , mobileNo , location;
	int age , choice;
		
	public Scanner scan;
	
	Student stud;
	
	public Student(String fname , String mname , String lname , String emailid, String mob , String locn , int age){
		this.fName = fname;
		this.mName = mname;
		this.lName = lname;
		this.emailId = emailid;
		this.mobileNo = mob;
		this.location = locn;
		this.age = age;
		
	}
	
	public static void main(String[] args){	
	
		//stud = new Student();
		
		List<Student> studentList = new ArrayList<Student>();
		
		Sytem.out.println("1. Add Student");
		Sytem.out.println("2. Remove Student");
		Sytem.out.println("3. Display All Student");
		Sytem.out.println("4. Exit");
		Sytem.out.println("Enter Choice: ");
		
		try{
			choice = scan.nextInt();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		while(true){
			
			switch(choice){
				
				case 1: 
				
					System.out.println("Enter First Name:");
					
					try{
						String firtName = scan.nextString();
					}catch(IOException e){
						e.printStackTrace();
					}
					
					System.out.println("Enter First Name:");
					String firstname = scan.next();
					System.out.println("Enter Middle Name:");
					String middlename = scan.next();
					System.out.println("Enter Last Name:");
					String lastname = scan.next();
					System.out.println("Enter Age:");
					String age = scan.next();
					System.out.println("Enter Email Id:");
					String emailid = scan.next();
					System.out.println("Enter Mobile No:");
					String mobile = scan.next();
					System.out.println("Enter Location:");
					String location = scan.next();
					
					addStud(firstname , middlename , lastname , emailId , mobileNo , location , age);
					
					
					break;
					
				case 2: 
					removeStud();
					break;
					
				case 3: 
					displayAllStud();
					break;
					
				case 4: System.exit(1);
					
				default: 
					System.out.println("Invalid Input");
					
				
				
			}
			
			
		}		
		
	}
	
	public static void addStud(fName , mName , lName , emailId , mobileNo , location , age){
			
			studentList.add(new Student(fName , mName , lName , emailId , mobileNo , location , age));
			
		}
		
	public Student void removeStud(){
		
	}
	
	public static void displayAllStud(){
		
	}
	

}