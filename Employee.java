class Employee{
	
	String eName;
	String dept;
	int age, deptNo;
	double salary;
	
	
	/*
	
		@Default constructor		
		access_modifier className(){
			
			
			
		}
		
	*/
	
	// Create a parameterized constructor to intialize the object variables
	
	public Employee(String ename , String dept , int deptno , int age , double sal){
		this.eName = ename;
		this.dept = dept;
		this.deptNo = deptno;
		this.age = age;
		this.salary = sal;
		
	}
	
	public static void main(String[] args){
		
		Employee e1 = new Employee("Rohan Sharma" , "QA" , 412 , 25 , 60080.90);
		e1.display();
		Employee e2 = new Employee("Ishank Verma" , "HR" , 452 , 32 , 10080.90);
		e2.display();
		Employee e3 = new Employee("Naveen Taneja" , "DEV" , 123 , 55 , 600110.90);
		e3.display();
		Employee e4 = new Employee("Sharma" , "QA" , 412 , 23 , 6000.90);
		e4.display();
		Employee e5 = new Employee("Kunal" , "ETS" , 323 , 25 , 80.90);
		e5.display();
		
	}
	
	public void display(){
		System.out.println("Employee Name : " + eName);
		System.out.println("Dept : " + dept);
		System.out.println("Dept No : " + deptNo);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
		System.out.println();
	}
}