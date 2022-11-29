package src.test;
import src.main.Purchase;
import java.util.ArrayList;

public class PurchaseTester2 {
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

        ArrayList<Purchase> purchases = new ArrayList<>();
        purchases.add(Purchases1);
        if (purchases.size() > 0) {
            int i = 0;
            System.out.println("Index  Purchase ID   Supplier ID    ItemID         Total Price     Purchase Date     Payment Date");
            for (Purchase s:purchases) {
                System.out.printf("%5d  %09d     %09d      %09d    %6.2f            %10s        %10s%n",i,s.getPurchaseID(),s.getSupplierID(),s.getItemID(),s.getTotalPrice(),s.getPurchaseDate(),s.getPaymentDate());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
        int editChoice = 0;
        System.out.println("Is this the correct entry?");
        //print info here
        System.out.printf("Purchase ID:    %09d %nSupplier ID:    %09d %nItem ID:        %09d %nTotal Price:       %6.2f %nPurchase Date: %s %nPayment Date:  %s %n",purchases.get(editChoice).getPurchaseID() , purchases.get(editChoice).getSupplierID(), purchases.get(editChoice).getItemID(), purchases.get(editChoice).getTotalPrice(), purchases.get(editChoice).getPurchaseDate(), purchases.get(editChoice).getPaymentDate());
        System.out.println("(Y/N)");
    }
}