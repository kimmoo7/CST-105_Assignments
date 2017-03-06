package chapter3;

public class NumberFour {

	public static void main(String[] args) {
		/* randomly generate an integer between 1 and 12 and display the corresponding 
		English month name */
		
		int month = (int)(Math.random() * 12);
		
		if (month == 1) {
			System.out.print("January");
		}
		else if (month == 2) {
			System.out.print("February");
		}
		else if (month == 3) {
			System.out.print("March");
		}
		else if (month == 4) {
			System.out.print("April");
		}
		else if (month == 5) {
			System.out.print("May");
		}
		else if (month == 6) {
			System.out.print("June");
		}
		else if (month == 7) {
			System.out.print("July");
		}
		else if (month == 8) {
			System.out.print("August");
		}
		else if (month == 9) {
			System.out.print("September");
		}
		else if (month == 10) {
			System.out.print("October");
		}
		else if (month == 11) {
			System.out.print("November");
		}
		else if (month == 12) {
			System.out.print("December");
		}

	}

}
