package src.main;

public class Purchase {
    private int purchaseID;
    private int supplierID;
    private int itemID;
    private double totalPrice;
    private String purchaseDate;
    private String paymentDate;
    public Purchase (){
        purchaseID=0;
        supplierID=0;
        itemID=0;
        totalPrice=0.0;
        purchaseDate="01.01.2001";
        paymentDate="01.01.2001";
    }

    public Purchase (int purchaseID, int supplierID, int itemID, double totalPrice, String purchaseDate, String paymentDate){
        this.purchaseID = purchaseID;
        this.supplierID = supplierID;
        this.itemID = itemID;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
        this.paymentDate = paymentDate;
    }

    public int getPurchaseID(){
        return purchaseID;
    }
    public int getSupplierID(){
        return supplierID;
    }
    public int getItemID(){
        return itemID;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public String getPurchaseDate(){
        return purchaseDate;
    }
    public String getPaymentDate(){
        return paymentDate;
    }
    public void setPurchaseID(int PurchaseID){
        this.purchaseID = PurchaseID;
    }
    public void setSupplierID(int SupplierID){
        this.supplierID = SupplierID;
    }
    public void setItemID(int ItemID){
        this.itemID = ItemID;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    public void setPaymentDate(String paymentDate){
        this.paymentDate = paymentDate;
    }
}
