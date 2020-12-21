import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Contacts{
	
	static int choice;
	String contactName;
	String contactNo;
	
	static Scanner scan;
	
	static List<Contacts> contactList = new ArrayList<Contacts>();
	
	/*Constructor of the class*/
	public Contacts(String name , String no){
		this.contactName = name;
		this.contactNo = no;
	}

	public static void main(String[] args){
		
		
		
		while(true){
			System.out.println("1. Create Contact: ");
			System.out.println("2. View Contact: ");
			System.out.println("3. Delete Contact: ");
			System.out.println("4. Display All Contact: ");
			System.out.println("5. EXIT ");
			System.out.println("Enter Choice: ");
			
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter Name: ");
					String name = scan.next();
					System.out.println("Enter Mobile No: ");
					String mobile = scan.next();
					createContact(name , mobile);
					break;
				case 2: 
					viewContact();
					break;
				case 3:
					deleteContact();
					break;
				case 4: 
					displayAllContacts();
					break;
				case 5:
					System.exit(1);
					
				default:
					System.out.println("Invalid Choice");
				
			}
		}
		
	}
	
	public static void createContact(String contactName , String mobileNo){
		System.out.println("Create a new Contact");
		
		contactList.add(new Contacts(contactName , mobileNo));
		System.out.println(contactName + " added to the Contact List");
		
	}
	
	public static void viewContact(){
		System.out.println("View a new Contact");
	}
	
	public static void deleteContact(){
		System.out.println("Delete a new Contact");
	}
	
	public static void displayAllContacts(){
		System.out.println("Contact List");
		
		for(Contacts contact : contactList){
			
			System.out.println("Contact Name: "+contact.contactName);
			System.out.println("Mobile No: "+contact.contactNo);
			System.out.println();
		}
		
	}
	

}