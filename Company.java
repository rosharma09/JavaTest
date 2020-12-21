class Employee{
	
	// 1. Make the variables/Fields as private [Data Hiding] 
	private int emp_id;
	private String emp_name;
	
	// 2. Create the public getter and setter methods
	
	// Employee ID Setter method
	public void setEmpid(int eId){
		if(eId > 0){
			emp_id = eId;
		}
		else{
			System.out.println("Invalid Employee ID!");
		}
	}
	
	// Employee ID getter method
	public int getEmpid(){
		return emp_id;
	}
	
	// Employee Name setter method
	public void setEmpname(String eName){
		
		if(eName != null){
			emp_name = eName;
		}
		else{
			System.out.println("Name cannot be null");
		}
		
	}
	
	// Employee Name getter method
	public String getEmpname(){
		return emp_name;
	}

}

class Company{
	
	void displayEmpDetails(int e , String n){
		System.out.println("Emp Id: "+e);
		System.out.println("Emp Name: "+n);
	}
	
	public static void main(String[] args){
		
		Employee emp1 = new Employee();
		emp1.setEmpid(101);
		emp1.setEmpname("Rohan Sharma");
		
		Company cmp1 = new Company();
		cmp1.displayEmpDetails(emp1.getEmpid() , emp1.getEmpname());
			
	}
	
}