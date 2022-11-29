package src.test;
import src.main.Supplier;

import java.util.ArrayList;

/**
 *
 * @author Kyle Wade
 */

public class SupplierTester2 {
    public static void main(String[] args) {
        Supplier Supplier1 = new Supplier();
        Supplier1.setSupplierID(1);
        Supplier1.setSupplierName("name");
        Supplier1.setAddress("address");
        Supplier1.setEmail("email");
        Supplier1.setPhoneNumber("phone");
        System.out.println("Supplier");
        System.out.println("supplierID: "+ Supplier1.getSupplierID());
        System.out.println("supplierName: "+ Supplier1.getSupplierName());
        System.out.println("address: "+ Supplier1.getAddress());
        System.out.println("email: "+ Supplier1.getEmail());
        System.out.println("phoneNumber: "+ Supplier1.getPhoneNumber());

        ArrayList<Supplier> suppliers = new ArrayList<>();
        suppliers.add(Supplier1);
        if (suppliers.size() > 0) {
            int i = 0;
            System.out.println("Index  Supplier ID    Supplier Name                   Address                                                  E-Mail                          Phone Number");
            for (Supplier s:suppliers) {
                System.out.printf("%05d  %09d      %-30s  %-55s  %-30s  %-12s",i, s.getSupplierID(),s.getSupplierName(), s.getAddress(), s.getEmail(), s.getPhoneNumber());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
        int editChoice = 0;
        System.out.printf("Is this correct? %nName:       %-30s %nAddress:    %-55s %nE-mail:     %-30s %nPhone No.:  %-12s %n(Y/N) %n", suppliers.get(editChoice).getSupplierName(),suppliers.get(editChoice).getAddress(),suppliers.get(editChoice).getEmail(),suppliers.get(editChoice).getPhoneNumber());
        System.out.printf("Index:      %09d %nName:       %-30s %nAddress:    %-55s %nE-mail:     %-30s %nPhone No.:  %-12s %n(Y/N) %n", suppliers.get(editChoice).getSupplierID(), suppliers.get(editChoice).getSupplierName(),suppliers.get(editChoice).getAddress(),suppliers.get(editChoice).getEmail(),suppliers.get(editChoice).getPhoneNumber());


    }
}
