/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.test;
import src.main.Stock;

/**
 *
 * @author Kyle Wade
 */
public class StockTester {
    public static void main(String[]args){
        Stock Stock1 = new Stock();
        Stock1.setStockID(1);
        Stock1.setItemName("name");
        Stock1.setAmount(2);
        Stock1.setSupplierID(3);
        Stock1.setLocation("Place");
        System.out.println("Stock");
        System.out.println("StockID"+ Stock1.getStockID());
        System.out.println("ItemName"+ Stock1.getItemName());
        System.out.println("Amount"+ Stock1.getAmount());
        System.out.println("SupplierID"+ Stock1.getSupplierID());
        System.out.println("Location"+ Stock1.getLocation());
    }
}
