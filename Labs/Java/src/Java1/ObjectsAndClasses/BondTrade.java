package Java1.ObjectsAndClasses;

public class BondTrade extends Trade{
    private Double dividend;

    public BondTrade(String ID, String symbol, int quantity, Double dividend){
        super(ID, symbol, quantity);
        this.dividend = dividend;
    }

    public Double calcDividend() {
        return this.dividend;
    }
}

