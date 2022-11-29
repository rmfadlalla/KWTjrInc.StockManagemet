/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package src.main;

/**
 *
 * @author Kyle Wade
 */
public class Stock {
    private int stockID;
    private String itemName;
    private int amount;
    private int supplierID;
    private String location;

    //edit 11/26/2022
    //added constructor(not overloaded), made variables lowercase, minor formatting changes
    public Stock(){
        stockID = 0;
        itemName = "";
        amount = 0;
        supplierID = 0;
        location = "";
    }
    public Stock (int stockID, String itemName, int amount, int supplierID,String location){
        this.stockID=stockID;
        this.itemName=itemName;
        this.amount=amount;
        this.supplierID=supplierID;
        this.location=location;
    }

    public int getStockID(){
        return stockID;
    }
    public String getItemName(){
        return itemName;
    }
    public int getAmount(){
        return amount;
    }
    public int getSupplierID(){
        return supplierID;
    }
    public String getLocation(){
        return location;
    }
    public void setStockID(int newStockID){
        this.stockID=newStockID;
    }
    public void setItemName(String newItemName){
        this.itemName=newItemName;
    }
    public void setAmount(int newAmount){
        this.amount=newAmount;
    }
    public void setSupplierID(int newSupplierID){
        this.supplierID=newSupplierID;
    }
    public void setLocation(String newLocation){
        this.location=newLocation;
    }
    public void dispatchStock(int disAmount){
        amount = amount - disAmount;
    }
}
    

