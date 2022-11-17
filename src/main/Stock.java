/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stock;

/**
 *
 * @author Kyle Wade
 */
public class Stock {
    private int StockID;
    private String ItemName;
    private int Amount;
    private int SupplierID;
    private String Location;
    
    public Stock (int StockID, String ItemName, int Amount, int SupplierID,String Location){    
    this.StockID=StockID;
    this.ItemName=ItemName;
    this.Amount=Amount;
    this.SupplierID=SupplierID;
    this.Location=Location;
    }

    Stock() {
        
    }
    public int getStockID(){
        return StockID;
    }
    public String getItemName(){
        return ItemName;
    }
    public int getAmount(){
        return Amount;
    }
    public int getSupplierID(){
        return SupplierID;
    }
    public String getLocation(){
        return Location;
    }
    public void setStockID(int newStockID){
        this.StockID=newStockID;
    }
    public void setItemName(String newItemName){
        this.ItemName=newItemName;
    }
    public void setAmount(int newAmount){
        this.Amount=newAmount;
    }
    public void setSupplierID(int newSupplierID){
        this.SupplierID=newSupplierID;
    }
    public void setLocation(String newLocation){
        this.Location=newLocation;
    }
    
    
    }
    

