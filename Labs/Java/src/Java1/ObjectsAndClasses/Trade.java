package Java1.ObjectsAndClasses;

public abstract class Trade {
    private String ID;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(){}


    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price > 0 ){
            this.price = price;
        }
        else {
            System.out.println("Price can't be negative");
        }
    }

    public double getTradeValue(){
        return quantity * price;
    }

    public abstract Double calcDividend(){}

    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}


