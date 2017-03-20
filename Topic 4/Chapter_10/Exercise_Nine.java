package chapter10;

public class Exercise_Nine {

	public static void main(String[] args) {
		/* Revise the Course class as follows:	
		 	* The array size is fixed in Listing 10.6. Improve it to automatically
		 	  increase the array size by creating a new larger array and copying the 
		 	  contents of the current array to it
		 	* Implement the dropStudent method
		 	* Add a new method named clear() that removes all students from the course
		 * Write a test program that creates a course, adds three students, removes one,
		   and displays the students in the course */

		Course course = new Course("Intro to Java :)");

	    for (int i = 0; i < 20; i++) {
	        course.addStudent("Student " + (i + 1));
	    }

	    String[] students = course.getStudents();
	    System.out.println(course.getCourseName());
	    for (int i = 0; i < students.length; i++) {
	        System.out.printf("%-12s ", students[i]);
	        if ((i + 1) % 5 == 0) {
	        System.out.printf("\n");
	        }
	    }
	       
	    System.out.println("Number of students: " + course.getNumberOfStudents());

	    System.out.println("\nDropping two students from course..");
	    System.out.println("Student #1 dropped.");
	        course.dropStudent("Student " + (1));
	    System.out.println("Student #8 dropped.");
	        course.dropStudent("Student " + (8));

	    System.out.println("Displaying students...\n");
	    for (int i = 0; i < course.getNumberOfStudents(); i++) {
	        System.out.printf("%-12s ", students[i]);

	        if ((i + 1) % 5 == 0) {
	        	System.out.printf("\n");
	        }
	    }
	        
	    System.out.println("\nNumber of students: " + course.getNumberOfStudents());

	}

}

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {

        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

        for (int i = 0; i < students.length; i++) {

            if (student.equalsIgnoreCase(students[i])) {

                students[i] = null; // sets dropped student's value to null
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
        }

    }

    public void clear(){
        students = new String[25];
        numberOfStudents = 0;
    }

    public Object clone() {
        Course course = null;
        try {
            course = (Course)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        course.students = students.clone();
        course.courseName = new String(courseName);

        return course;
    }

}