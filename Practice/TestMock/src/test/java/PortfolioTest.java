import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

class PortfolioTest {
//    @Mock
//    Stock stock;

    @Test
    public void stockCanBeAddedToPortfolio() throws StockAlreadyExistsException {
        Stock stock = mock(Stock.class);
        Portfolio portfolio = new Portfolio();
        portfolio.addStock(stock);
        assertEquals(1, portfolio.totalStocks(), "Stock could not be added to the portfolio");
    }

    @Test
    public void addingDuplicateStocksThrowsAnException() throws StockAlreadyExistsException {
        Stock stock = mock(Stock.class);
        Portfolio portfolio = new Portfolio();
        portfolio.addStock(stock);

        assertThrows(StockAlreadyExistsException.class, () -> {
            portfolio.addStock(stock);
        }, "Adding duplicate stocks did not throw an exception");
    }
    @Test
    public void gettingANonexistentStockReturnsOptionalEmpty() {
        Portfolio portfolio = new Portfolio();
        assertTrue(portfolio.getStock(anyInt()).isEmpty());
    }

}