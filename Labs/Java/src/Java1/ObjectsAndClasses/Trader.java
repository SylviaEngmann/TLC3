package Java1.ObjectsAndClasses;

import java.util.ArrayList;

public class Trader {
    private String name ;
    private Account account = new Account();
    private ArrayList<Trade> trades = new ArrayList<>();

    public void addTrade(Trade trade){
        trades.add(trade);
        account.setTrade_value(account.getTrade_value() + trade.getTradeValue());
    }

}
