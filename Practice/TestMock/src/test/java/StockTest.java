import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StockTest {

    @Test
    public void userCanGetStockQuantity() {
        //Stock stock = new Stock(1, "AAPL", 4)
        //stock.getQuantity();
        // 1. mock the class
        Stock mockedStock = mock(Stock.class);
        //2. declare the dummy result to return
        when(mockedStock.getQuantity()).thenReturn(5);
        //3. write assertion
        assertEquals(5, mockedStock.getQuantity(), "User cannot get stock quantity");
    }

    @Test
    public void userCanGetStockPrice() {
        Stock mockedStock = mock(Stock.class);
        //anyDouble(), anyInt(), anyString()
        when(mockedStock.getStockPrice()).thenReturn(6.0);
        assertTrue(mockedStock.getStockPrice() != null, "User cannot get stock price");
    }
}