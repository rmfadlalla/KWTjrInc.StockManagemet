package src.test;

import src.main.Sale;

import java.util.ArrayList;

public class SaleTester {
    public static void main(String[] args) {
        Sale s1 = new Sale();
        s1.setSaleID(001);
        s1.setCustomerID(97);
        s1.setItemID(123456);
        s1.setQuantity(3);
        s1.setSaleAmount(46.99);
        s1.setDate("10.31.2022");
        System.out.println(s1.getSaleID() + " " + s1.getCustomerID() + " " + s1.getItemID() + " " + s1.getQuantity() + " " + s1.getSaleAmount() + " " + s1.getDate());
        Sale s2 = new Sale(003, 76, 654321, 6, 22.22, "09.11.2021");
        System.out.println(s2.getSaleID() + " " + s2.getCustomerID() + " " + s2.getItemID() + " " + s2.getQuantity() + " " + s2.getSaleAmount() + " " + s2.getDate());
        //part 2
        ArrayList<Sale> sales = new ArrayList<>();

        System.out.println("View Sales");
        if (sales.size() > 0) {
            int i = 0;
            System.out.println("Index  Sale ID    Customer ID    Item ID    Quantity   Sale Amount    Date");
            for (Sale s:sales) {
                System.out.printf("%5d  %07d    %09d %09d %9d %.2f %s",i,s.getSaleID(),s.getCustomerID(),s.getItemID(),s.getQuantity(),s.getSaleAmount(),s.getDate());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
    }
}
