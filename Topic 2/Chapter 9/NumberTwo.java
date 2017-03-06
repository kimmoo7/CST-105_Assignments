package chapter9;

public class NumberTwo {

	public static void main(String[] args) {
		/* design a class named Stock and write a test program that creates a Stock object
		 * with the stock symbol ORCL, the name Oracle Corporation, and the previous closing
		 * price of 34.5. Set a new current price to 34.35 and display the price-change 
		 * percentage. */
		
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");
		stock1.setPreviousClosingPrice(34.5);
		
		// set current price
		stock1.setCurrentPrice(34.35);
		
		// display stock info
		System.out.println("Previous Closing Price: " + stock1.getPreviousClosingPrice());
		System.out.println("Current Price: " + stock1.getCurrentPrice());
		System.out.println("Price Change Percentage: " + stock1.getChangePercent() + "%");
		
		class Stock {
			
			// a string data field named symbol for the stock's symbol
			String symbol; 
			
			// a string data field named name for the stock's name
			String name;
			
			/* a double data field named previousClosingPrice that stores the stock 
			  price for the previous day */
			double previousClosingPrice;
			
			/* a double data field named currentPrice that stores the stock price for the
			  current time */
			double currentPrice;
			
			// a constructor that creates a stock with the specified symbol and name
			Stock () {
			}
			
			Stock(String newSymbol, String newName) {
				symbol = newSymbol;
				name = newName;
			}
			
			/* a method named getChangePercent() that returns the percentage changed from
			  previousClosingPrice to currentPrice */
			double getChangePercent() {
				return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
			}
			
			double getPreviousClosingPrice () {
				return previousClosingPrice;
			}
			
			double getCurrentPrice () {
				return currentPrice;
			}
			
			// set a new current price
			void setCurrentPrice (double newCurrentPrice) {
				currentPrice = newCurrentPrice;
			}
			
			// set a new previous closing price
			void setPreviousClosingPrice (double newPreviousClosingPrice) {
				previousClosingPrice = newPreviousClosingPrice;
			}
		
		}
	}

}
