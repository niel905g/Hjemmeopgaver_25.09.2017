package Chapter_09;

public class Main {

    public static void main(String[] args) {
	// Create a new stock;
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        //Initialize variable
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        // Displays the new stock with symbol and name
        System.out.println("\nNew stock with symbol: " + stock.symbol
                + "! og navn: " + stock.name + " launched!");
        // Displays the previousClosingPrice of the stock
        System.out.println("\nThe previous closing price of the stock was: "
        + stock.previousClosingPrice);
        // Displays the current price
        System.out.println("\nCurrent price is: " + stock.currentPrice);
        // Display the difference between previousClosingPrice and currentPrice.
        System.out.println("\nThe difference between previous closing price and " +
                "current price, in percentage: " + stock.getChangePercent());
    }
}
