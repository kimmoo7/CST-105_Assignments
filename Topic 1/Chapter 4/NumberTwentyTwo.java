package chapter4;

public class NumberTwentyTwo {

	public static void main(String[] args) {
		//Report whether the second string is a substring of the first string
		
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter string s1:");
		String s1 = input.nextLine();
		  
		System.out.print("Enter string s2:");
		String s2 = input.nextLine();
		 
		  if (s1.contains(s2)) {
		   System.out.println(s2 + " is a substring of " + s1);
		  } 
		  else {
		   System.out.println(s2 + " is not a substring of " + s1);
		  }

	}

}
