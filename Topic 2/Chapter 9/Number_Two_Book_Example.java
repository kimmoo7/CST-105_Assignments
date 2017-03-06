package chapter9;

public class Number_Two_Book_Example {
	    public static void main(String[] args) {
	      Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");
	      stock.setPreviousClosingPrice(100);

	      // Set current price
	      stock.setCurrentPrice(90);

	      // Display stock info
	      System.out.println("Previous Closing Price: " +
	        stock.getPreviousClosingPrice());
	      System.out.println("Current Price: " +
	        stock.getCurrentPrice());
	      System.out.println("Price Change: " +
	        stock.getChangePercent() + "%");
	    }
	  }

	class Stock {
	  String symbol;
	  String name;
	  double previousClosingPrice;
	  double currentPrice;

	  public Stock() {
	  }

	  public Stock(String newSymbol, String newName) {
	    symbol = newSymbol;
	    name = newName;
	  }

	  public double getChangePercent() {
	    return ((previousClosingPrice - currentPrice) / currentPrice) * 100;
	  }
	  
	  public double getPreviousClosingPrice() {
	    return previousClosingPrice;
	  }
	  
	  public double getCurrentPrice() {
	    return currentPrice;
	  }
	  
	  public void setCurrentPrice(double newCurrentPrice) {
	    currentPrice = newCurrentPrice;
	  }
	  
	  public void setPreviousClosingPrice(double newPreviousClosingPrice) {
	    previousClosingPrice = newPreviousClosingPrice;
	  }
	}

