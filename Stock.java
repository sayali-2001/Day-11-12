package StockAccountManagement;

public class Stock {
    private int price;
    private String stockName;
    private int numberOfShare;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }
    public String toString() {
        
        String str = "Stock Marketing: [Stock Name = " + getStockName() + ", Stock Price " + getPrice() +
                ", Stock Count = " + getNumberOfShare() +"]";
                return str;
        // return "Stocks [shareName=" + stockName + ", sharePrice=" + price + ", shareCount=" + numberOfShare + "]";
    }
}
