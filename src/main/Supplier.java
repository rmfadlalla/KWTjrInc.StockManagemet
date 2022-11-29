/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package src.main;
/**
 *
 * @author Kyle Wade
 */
public class Supplier {
    private int supplierID;
    private String supplierName;
    private String address;
    private String email;
    private String phoneNumber;
    public Supplier (){
        supplierID = 0;
        supplierName = "";
        address = "";
        email = "";
        phoneNumber = "";
    }

    public Supplier(int supplierID, String supplierName, String address, String email, String phoneNumber){
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public int getSupplierID(){
        return supplierID;
    }
    public String getSupplierName(){
        return supplierName;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setSupplierID(int supplierID){
        this.supplierID = supplierID;
    }
    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}

