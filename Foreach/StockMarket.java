class StockMarket {
    public static void main(String[] args) {
        String stockNames[] = {
            "NYSE", "NASDAQ", "LSE", "TSE", "SSE",
            "HKEX", "Euronext", "TSX", "BSE", "NSE"
        };

        for (String stock : stockNames) {
            System.out.println(stock);
        }
    }
}
