package Java1.ObjectsAndClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void tradePriceIsPositive() {
        Trade trade1 = new Trade("T1","TestTrade1", 3);
        //assertNotEquals(-1.0, 1.0 );
       // assertNotEquals("", trade1.setPrice(-1.0));
    }
}
