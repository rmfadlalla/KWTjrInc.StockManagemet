package src.main;

public class Sale {
    private int saleID;
    private int customerID;
    private int itemID;
    private int quantity;
    private double saleAmount;
    private String date;

    public Sale(){
        saleID = 0;
        customerID = 0;
        itemID = 0;
        quantity = 0;
        saleAmount = 0;
        date = "01.01.2001";
    }
    public Sale(int saleID, int customerID, int itemID, int quantity, double saleAmount, String date) {
        this.saleID = saleID;
        this.customerID = customerID;
        this.itemID = itemID;
        this.quantity = quantity;
        this.saleAmount = saleAmount;
        this.date = date;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}
