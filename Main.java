public class Main {
    public static void main(String[] args) {
        // Test Case 1: Stock Analysis
        StockPortfolio stock = new StockPortfolio("AAPL", 10, 130.0);
        stock.updatePrice(-30.0);
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());
        stock.updatePrice(30.0);
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());
        stock.updatePrice(0.0);
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());
        stock.updatePrice(300.0);
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());
    }
}
