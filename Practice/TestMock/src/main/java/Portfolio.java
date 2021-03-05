import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Portfolio implements PortfolioService {
    private List<Stock> stockList = new ArrayList<>();

    public Portfolio() {
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    @Override
    public void addStock(Stock stock) throws StockAlreadyExistsException {
        List<Stock> stocks = stockList
                .stream()
                .filter(s -> s.getId() == stock.getId())
                .collect(Collectors.toList());

        if (stocks.isEmpty()) {
            stockList.add(stock);
        } else {
            // throw an exception
            throw new StockAlreadyExistsException("Stock with " + stock.getId() + " already exist.");
        }

    }

    @Override
    public Optional<Stock> getStock(int id) {
        return stockList.stream().filter(stock -> stock.getId() == id).findFirst();
    }

    @Override
    public int totalStocks() {
        return stockList.size();
    }
}