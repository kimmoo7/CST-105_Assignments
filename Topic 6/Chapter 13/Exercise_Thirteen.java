package chapter13;

public class Exercise_Thirteen {

	public static void main(String[] args) {
		/* Rewrite the Course class in Listing 10.6 to add a clone method to perform a 
		   deep copy on the students field */

	      Course course1 = new Course("Course1");
	        course1.addStudent("student1");
	        course1.addStudent("student2");
	        Course course2 = (Course)course1.clone();
	        System.out.println(course1 == course2);
	        System.out.println(course1.getCourseName() == course2.getCourseName());
	        System.out.println(course1.getStudents() == course2.getStudents());
	
	}


}
