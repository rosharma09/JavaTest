class Employee{
	
	String eName;
	String dept;
	int age, deptNo;
	double salary;
	
	public static void main(String[] args){
		
		Employee e1 = new Employee();
		e1.display();
		Employee e2 = new Employee();
		e2.display();
		Employee e3 = new Employee();
		e3.display();
		Employee e4 = new Employee();
		e4.display();
		Employee e5 = new Employee();
		e5.display();
		
	}
	
	public void display(){
		System.out.println("Employee Name : " + eName);
		System.out.println("Dept : " + dept);
		System.out.println("Dept No : " + deptNo);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}