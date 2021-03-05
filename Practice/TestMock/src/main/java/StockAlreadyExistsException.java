public class StockAlreadyExistsException extends Exception {
    public StockAlreadyExistsException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}