package chapter9;

public class Number_Six {

	public static void main(String[] args) {
		/* design a class named StopWatch. Draw the UML diagram for the class and then
		 * implement the class. Write a test program that measures the execution time of 
		 * sorting 100,000 numbers using selection sort. */
		
		int size = 100000;
		
		double[] list = new double[size];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = Math.random() * list.length;
		}
		
		StopWatch stopWatch = new StopWatch();
		selectionSort(list);
		stopWatch.stop();
		
		System.out.print("The sort time is " + stopWatch.getElapsedTime() + " milliseconds");
	}
	
		static void selectionSort(double[] list) {
			for (int i = 0; i < list.length - 1; i++) {
			double currentMinimum = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
		        if (currentMinimum > list[j]) {
		          currentMinimum = list[j];
		          currentMinIndex = j;
		        }
			}
			
			if (currentMinIndex != i) {
		    list[currentMinIndex] = list[i];
		    list[i] = currentMinimum;
		      }
			}
			
			
		class StopWatch {
			
		// private data fields startTime and endTime with getter methods
		// a no-arg constructor that initializes startTime with the current time
			private long startTime = System.currentTimeMillis();
			private long endTime = startTime;
			
		// a method named start() that resets the startTime to the current time
			void start() {
				startTime = System.currentTimeMillis();
			}
			
		// a method named stop() that sets the endTime to the current time
			void stop() {
				endTime = System.currentTimeMillis();
			}
		/* a method named getElapsedTime() that returns the elapsed time for the stopwatch
		   in milliseconds */
			long getElapsedTime() {
				return endTime - startTime;
			}
		
		}
	}

}
