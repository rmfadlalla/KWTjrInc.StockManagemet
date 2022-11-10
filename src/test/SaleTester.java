package src.test;

import src.main.Sale;

public class SaleTester {
    public static void main(String[] args) {
        Sale s1 = new Sale();
        s1.setSaleID(001);
        s1.setCustomerID(97);
        s1.setItemID(123456);
        s1.setQuantity(3);
        s1.setSaleAmount(46.99);
        s1.setDate("10.31.22");
        System.out.println(s1.getSaleID() + " " + s1.getCustomerID() + " " + s1.getItemID() + " " + s1.getQuantity() + " " + s1.getSaleAmount() + " " + s1.getDate());
        Sale s2 = new Sale(003, 76, 654321, 6, 22.22, "9");
        System.out.println(s2.getSaleID() + " " + s2.getCustomerID() + " " + s2.getItemID() + " " + s2.getQuantity() + " " + s2.getSaleAmount() + " " + s2.getDate());
    }
}
