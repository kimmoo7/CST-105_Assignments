package chapter24;

public class NumberFour {

	public static void main(String[] args) {
		// first 50 prime numbers in descending order
		
		import java.util.Stack;

		public class Primes{
		    public static void main(String[]args){
		    Stack<Integer> stack = new Stack<Integer>();

		    stack.push(null);
		    //number of primes to display
		    final int numberOfPrimes = 50;
		    //number of primes to display per line
		    final int numberOfPrimesPerLine = 10;
		    //count number of primes
		    int count = 0;
		    int number = 2;

		    System.out.println("The first 50 primes are \n");

		    while(count < numberOfPrimes){
		        boolean isPrime = true;

		    for(int divisor = 2; divisor <= number/2; divisor++){
		        if(number % divisor == 0){
		            isPrime = false;
		            break;
		        }
		    }
		    if(isPrime){
		        count++;

		        if(count % numberOfPrimesPerLine ==0){
		            System.out.println(number);

		        }
		        else
		            System.out.print(number + " ");

		    }
		    number++;
		    }
		}

	}

