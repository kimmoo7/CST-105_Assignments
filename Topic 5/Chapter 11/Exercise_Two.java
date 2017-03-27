package chapter11;

public class Exercise_Two {

	public static void main(String[] args) {
		/* Design a class named Person and its two subclasses named Student and Employee.
		   Make Faculty and Staff subclasses of Employee. A person has a name, address, 
		   phone number, and email address. A student has a class status (freshman, 
		   sophomore, junior, or senior). Define the status as a constant. An employee
		   has an office, salary, and date hired. Use the MyDate class define in 
		   Programming Exercise 10.14 to create an object for date hired. A faculty member
		   has office hours and a rank. A staff member has a title. Override the toString
		   method in each class to display the class name and the person's name.
		 * Draw the UML diagram for the classes and implement them. Write a test program
		   that creates a Person, Student, Employee, Faculty, and Staff, and invokes 
		   their toString() methods.'  
		 */

	}

public class Person {
	String name;
	String address;
	String phoneNumber;
	String emailAddress; 
	
	Person() {
	}
	
	Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Person";
	}
}
	
public class Student extends Person {
	public static int freshman = 1;
	public static int sophomore = 2;
	public static int junior = 3;
	public static int senior = 4;
	
	protected int status;
	
	@Override
	public String toString() {
		return "Student";
}
	
public class Employee extends Person {
	private String office;
	private String salary;
	private Date dateHired = new java.util.Date();
	
	@Override
	public String toString() {
		return "Employee";
	}
}


public class Faculty extends Employee {
	public int LECTURER = 1;
	public int ASSISTANT_PROFESSOR = 2;
	public int ASSOCIATE_PROFESSOR = 3;
	public int PROFESSOR = 4;
	
	protected String officeHours;
	protected int rank;
	
	@Override
	public String toString() {
		return "Faculty";
	}
}	
	
public class Staff extends Employee {
	protected String title;
	
	@Override
	public String toString() {
		return "Staff's title is " + title;
	}
	
}

