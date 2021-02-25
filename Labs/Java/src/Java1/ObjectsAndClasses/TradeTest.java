package Java1.ObjectsAndClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void tradePriceIsPositive() {
        Trade trade1 = new BondTrade("T1","TestTrade1", 3, 45.0);
        trade1.setPrice(45.00);
        trade1.setPrice(-5.00);

        assertEquals(45.00, trade1.getPrice());
    }
}
