package ScalaOO;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.junit.jupiter.api.Test
    void ValueOfTrade() {
        Trade trade1 = new Trade("T1","TestTrade1", 3, 45.0);
        assertEquals(135, trade1.value(trade1.initialPrice(), trade1.quantity()));
    }
}