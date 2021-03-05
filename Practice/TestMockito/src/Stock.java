public class Stock {
    private int id; // 1, 4, 67
    private String symbol; // AAPL
    private int quantity; // 5

    public Stock(int id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getStockPrice() {
        // makes http api call to Google server
        // or making a database call
        return 5.0;
    }
}
