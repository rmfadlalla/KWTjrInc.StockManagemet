package src.test;

import src.main.Supplier;

/**
 *
 * @author Kyle Wade
 */

public class SupplierTester {
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
    }
}