package Java1.ObjectsAndClasses;

public class Fund extends Trade{
    private Double dividend;
    private double percentage;

    public Fund(String ID, String symbol, int quantity, int price, double percentage)
    {
        super(ID, symbol, quantity, price);
        this.percentage = percentage;
    }

    public Double calcDividend(){
        this.dividend = (this.percentage / 100) * this.getPrice();
        return this.dividend;
    }
}
