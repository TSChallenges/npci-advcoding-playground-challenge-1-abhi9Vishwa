class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO
        this.symbol = symbol;
        this.quantity = quantity;
        this.highestPrice = buyingPrice;
        this.currentPrice = buyingPrice;
        this.buyingPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        // TODO
        if(newPrice >= 0.0){
            this.currentPrice  = newPrice;
            if(newPrice > this.highestPrice) this.highestPrice = newPrice;
        }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
        double profit = 0;
        double diff = (currentPrice - buyingPrice);
        profit = diff*quantity;
        return profit;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        double totValue = currentPrice*quantity;
        return totValue;
    }
}
