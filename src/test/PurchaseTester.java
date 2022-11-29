package src.test;
import src.main.Purchase;

public class PurchaseTester {
    public static void main (String[] args){
        Purchase Purchases1 = new Purchase();
        Purchases1.setPurchaseID(1);
        Purchases1.setSupplierID(2);
        Purchases1.setItemID(3);
        Purchases1.setTotalPrice(4);
        Purchases1.setPurchaseDate("01.01.2002");
        Purchases1.setPaymentDate("01.01.2002");
        System.out.println("Purchases");
        System.out.println("PurchaseID"+ Purchases1.getPurchaseID());
        System.out.println("SupplierID"+ Purchases1.getSupplierID());
        System.out.println("ItemID"+ Purchases1.getItemID());
        System.out.println("totalPrice"+ Purchases1.getTotalPrice());
        System.out.println("PurchaseDate"+ Purchases1.getPurchaseDate());
        System.out.println("PaymentDate"+ Purchases1.getPaymentDate());
    }
}