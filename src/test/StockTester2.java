package src.test;

import src.main.Stock;

import java.util.ArrayList;

public class StockTester2 {
    public static void main(String[] args) {
        //Stock Stock1 = new Stock();
        Stock stock1 = new Stock(0,"n", 0, 0, "P");
        stock1.setStockID(1);
        stock1.setItemName("name");
        stock1.setAmount(2);
        stock1.setSupplierID(3);
        stock1.setLocation("Place");
        System.out.println("Stock");
        System.out.println("StockID"+ stock1.getStockID());
        System.out.println("ItemName"+ stock1.getItemName());
        System.out.println("Amount"+ stock1.getAmount());
        System.out.println("SupplierID"+ stock1.getSupplierID());
        System.out.println("Location"+ stock1.getLocation());

        //testing arrays
        ArrayList<Stock> stock = new ArrayList<>();
        stock.add(stock1);
        if (stock.size() > 0) {
            int i = 0;
            System.out.println("Index  Stock ID    Item Name                      Amount   Supplier ID    Location");
            for (Stock s:stock) {
                System.out.printf("%05d  %09d   %-20.20s   %9d          %09d    %8.8s %n(Y/N)%n", i, s.getStockID(), s.getItemName(), s.getAmount(), s.getSupplierID(), s.getLocation());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
        stock.get(0).dispatchStock(1);
        if (stock.size() > 0) {
            int i = 0;
            System.out.println("Index  Stock ID    Item Name              Amount      Supplier ID    Location");
            for (Stock s:stock) {
                System.out.printf("%05d  %09d   %-20.20s   %09d     %09d    %8.8s %n(Y/N)%n", i, s.getStockID(), s.getItemName(), s.getAmount(), s.getSupplierID(), s.getLocation());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
    }

}
