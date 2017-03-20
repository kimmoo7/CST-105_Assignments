package chapter10;

public class Exercise_One {

	public static void main(String[] args) {
		/* Design a class named Time. The class contains:
		 	* The data fields hour, minute, and second that represent a time
		 	* A no-arg constructor that creates a Time object for the current time. (The 
		 	 values of the data fields will represent the current time)
		 	* A constructor that constructs a Time object with a specified elapsed time
		 	 since midnight, January 1, 1970, in milliseconds. (The values of the data 
		 	 fields will represent this time)
		 	* A constructor that constructs a Time object with the specified hour, minute,
		 	 and second
		 	* Three getter methods for the data fields hour, minute, and second,
		 	 respectively
		 	* A method named setTime(long elapseTime) that sets a new time for the object
		 	 using the elapsed time. For example, if the elapsed time is 555550000 
		 	 milliseconds, the hour is 10, the minute is 19, and the second is 10
		 * Draw the UML diagram for the class and then implement the class. Write a test 
		   program that creates two Time objects (using new Time() and new Time(555550000)
		   and displays their hour, minute, and second in the format hour:minute:second
		 * (Hint: The first two constructors will extract the hour, minute, and second 
		   from the elapsed time. For the no-arg constructor, the current time can be 
		   obtained using System.currentTimeMillis(), as shown in Listing 2.7, 
		   ShowCurrentTime.java) */

		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.printf("%d:%d:%d%n%n",
							time1.getHour(), 
							time1.getMinute(), 
							time1.getSecond());
		System.out.printf("%d:%d:%d",
							time2.getHour(),
							time2.getMinute(),
							time2.getSecond());
	
	}

}

class Time {
	private int hour;
	private int minute;
	private int second;
	private long time;
	
	public Time() {
		time = System.currentTimeMillis();
	}
	
	public Time(long elapsedTime) {
		time = elapsedTime;
	}
	
	public Time(int hour, int minute, int second) {
		hour = (int)(time / (1000 * 60 * 60)) % 24;
		minute = (int)(time / (1000 * 60)) % 60;
		second = (int)(time / 1000) % 60;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
}