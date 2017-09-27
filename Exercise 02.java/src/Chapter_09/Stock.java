package Chapter_09;

public class Stock {
    // Declare the variables
    String symbol;
    String name;

    double previousClosingPrice;
    double currentPrice;

    // A Constructor that creates a stock with the specific symbol and name.
    Stock(String newSymbol, String newName) {
        //Initialize the variables
        symbol = newSymbol;
        name = newName;
    }
    // A method that returns the percentage change from
    // previousClosingPrice and to currentPrice.
    double getChangePercent() {
        return ( (currentPrice - previousClosingPrice) / currentPrice) * 100;
    }
}
