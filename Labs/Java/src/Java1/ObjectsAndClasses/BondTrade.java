package Java1.ObjectsAndClasses;

public class Bond extends Trade{
    private Double dividend;

    public Bond(String ID, String symbol, int quantity,Double dividend){
        super(ID, symbol, quantity);
        this.dividend = dividend;
    }

    public Double calcDividend() {
        return this.dividend;
    }
}

