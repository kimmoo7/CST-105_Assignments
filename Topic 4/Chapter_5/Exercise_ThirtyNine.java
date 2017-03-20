package chapter5;

public class Exercise_ThirtyNine {

	public static void main(String[] args) {
		/* You have just started a sales job in a department store. Your pay consists of
		   a base salary and a commission. The base salary is $5,000. The scheme shown
		   below is used to determine the commission rate
		   		Sales Amount					Commission Rate
		   		$0.01 - $5000						8%
		   		$5000.01 - $10000					10%
		   		$10,000.01 and above				12%
		 * Note that this is a graduated rate. The rate for the first $5000 is at 8%, the 
		   next $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, 
		   the commission is 5000 * 8% + 5000 * 10% + 15000 * 12% = 2700
		 * Your goal is to earn $30,000 a year. Write a program that finds the minimum
		   sales you have to generate in order to make $30,000. */

		final double DESIRED_COMMISSION = 25000;
		final double INITIAL_SALES_AMOUNT = 0.01;
		double commission = 0;
		double salesAmount = INITIAL_SALES_AMOUNT;
		
		do {
			
		salesAmount += 0.01;
		
		if (salesAmount >= 10000.01)
			commission = 5000 * .08 + 5000 * .10 + (salesAmount - 10000) * .12;
		
		else if (salesAmount >= 5000.01)
			commission = 5000 * .08 + (salesAmount - 5000) * 0.10;
		
		else
			commission = salesAmount * .08;
		
		} while (commission < DESIRED_COMMISSION);
		
		System.out.println("The sales amount $" + (int)((salesAmount * 100) / 100.0) +
				" is needed to make a commission of $" + DESIRED_COMMISSION);
	
	}

}
