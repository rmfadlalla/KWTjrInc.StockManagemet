package src.main;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        final String USERNAME = "Admin";
        final String PASSWORD = "Swordfish";
        ArrayList<Sale> sales = new ArrayList<>();
        int nextSaleID = 0;
        ArrayList<Stock> stock = new ArrayList<>();
        int nextStockID = 0;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        //Login
        while (!done) {
            System.out.println("Welcome to the KWT Jr. Inventory Management System!");
            System.out.println("Please login to continue, or press \"Q\" to quit.");
            System.out.print("Please enter your Username: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                done = true;
            }
            else {
                while (!input.equals(USERNAME)){
                    System.out.println("Error: Invalid Username, please try again");
                    System.out.print("Please enter your Username: ");
                    input = in.next();
                }
                System.out.print("Hello, " + USERNAME + ", please enter your password: ");
                input = in.next();
                while (!input.equals(PASSWORD)){
                    System.out.println("Error: Invalid Password, please try again");
                    System.out.print(USERNAME + ", please enter your password: ");
                    input = in.next();
                }
                //Main Menu
                do {
                    System.out.println("Welcome, " + USERNAME);
                    System.out.printf("What would you like to do? %n1: View / Manage Stock %n2: View / Manage Purchases %n3: View / Manage Suppliers %n4: View / Manage Sales %n5: View / Manage Customers %n6: Exit %n");
                    int choice = in.nextInt();
                    switch (choice) {
                        case 1: //Manage stock
                            boolean stockDone = false;
                            do {
                                System.out.println("View / Manage Stock");
                                int stockIndex;
                                System.out.printf("1: Enter New Stock %n2: View Stock %n3: Dispatch Stock %n4: Shift Stock %n5: Exit %n");
                                int stockChoice = in.nextInt();
                                switch (stockChoice){
                                    case 1: //Enter New Stock
                                        //Dummy code, to be replaced
                                        System.out.println("Enter Stock");
                                        Stock newStock = newStock(nextStockID);
                                        stock.add(newStock);
                                        System.out.println("Stock entered");
                                        nextStockID++;
                                        break;
                                    case 2: //View Stock
                                        printStock(stock);
                                        break;
                                    case 3: //Dispatch Stock
                                        if (stock.size() > 0){
                                            printStock(stock);
                                            stockIndex = chkStockIndex(stock);
                                            int dipatchAmount = dispatchStock(stock.get(stockIndex));
                                            stock.get(stockIndex).dispatchStock(dipatchAmount);
                                            System.out.println("Stock Dispatched");
                                        }
                                        else {
                                            System.out.println("There is no stock");
                                        }
                                        break;
                                    case 4: //Shift Stock
                                        //Dummy code, to be replaced
                                        if (stock.size() > 0){
                                            printStock(stock);
                                            stockIndex = chkStockIndex(stock);
                                            String newLoc = shiftStock();
                                            stock.get(stockIndex).setLocation(newLoc);
                                            System.out.println("Stock Shifted");
                                        }
                                        else {
                                            System.out.println("There is no stock");
                                        }
                                        break;
                                    case 5: //Exit
                                        System.out.println("Returning to Main Menu...");
                                        stockDone = true;
                                        break;
                                    default:
                                        System.out.println("Error: Invalid Choice, please try again");
                                }
                            }
                            while (!stockDone);
                            break;
                        case 2: //Manage Purchases
                            boolean purchasesDone = false;
                            do {
                                System.out.println("View / Manage Purchases");
                            }
                            while (!purchasesDone);
                            break;
                        case 3: //Manage Suppliers
                            boolean suppliersDone = false;
                            do {
                                System.out.println("View / Manage Suppliers");
                            }
                            while (!suppliersDone);
                            break;
                        case 4: //Manage Sales
                            boolean salesDone = false;
                            do {
                                System.out.println("View / Manage Sales");
                                System.out.printf("1: Enter Sales%n2: View Sales%n3: Edit Sales%n4: Delete Sales%n5: Exit%n");
                                int saleChoice = in.nextInt();
                                switch (saleChoice){
                                    case 1: //Enter Sale
                                        Sale newSale = newSale(nextSaleID);
                                        sales.add(newSale);
                                        System.out.println("Sale added!");
                                        nextSaleID++;
                                        break;
                                    case 2: //View Sales
                                        System.out.println("View Sales");
                                        printSales(sales);
                                        break;
                                    case 3: //Edit Sale
                                        if (sales.size() > 0) {
                                            //code here
                                            int e;
                                            Sale s;
                                            printSales(sales);
                                            System.out.print("Input the index of the sale you want to edit: ");
                                            e = in.nextInt();
                                            s = newSale(nextSaleID);
                                            sales.set(e, s);
                                        }
                                        else {
                                            System.out.println("There are no sales to edit");
                                        }
                                        break;
                                    case 4: //Delete Sale
                                        if (sales.size() > 0) {
                                            int r;
                                            printSales(sales);
                                            System.out.print("Input the index of the sale you want to delete: ");
                                            r = in.nextInt();
                                            sales.remove(r);
                                        }
                                        else {
                                            System.out.println("There are no sales to edit");
                                        }
                                        break;
                                    case 5: //Exit
                                        System.out.println("Returning to Main Menu...");
                                        salesDone = true;
                                        break;
                                    default:
                                        System.out.println("Error: Invalid option, please try again");
                                        break;
                                }
                            }
                            while (!salesDone);
                            break;
                        case 5: //Manage Customers
                            boolean customersDone = false;
                            do {
                                System.out.println("View / Manage Customers");
                            }
                            while (!customersDone);
                        case 6: //Quit
                            done = true;
                            break;
                        default: System.out.println("Invalid Choice, please try again");
                    }
                }
                while (!done);
            }
        }

    }

    //Manage Stock
    //Enter Stock
    public static Stock newStock(int nextStockID){
        Scanner in = new Scanner(System.in);
        boolean ready = false;
        String iName;
        int amount;
        int supID;
        String loc;
        do{
            System.out.print("Enter the Item Name: ");
            iName = in.next();
            System.out.print("Enter the Amount: ");
            amount = in.nextInt();
            System.out.print("Enter the ID Number of the Supplier: ");
            supID = in.nextInt();
            System.out.print("Enter the Location of the stock: ");
            loc = in.nextLine();
            System.out.println("Info entered");
            System.out.printf("Is this correct?%nItem Name: %s %nAmount:  %9d %nSupplier ID: %09d %nLocation:   %s %n(Y/N)%n", iName,amount,supID,loc);
            String input = in.next();
            if (input.equalsIgnoreCase("y")) {
                ready = true;
            }
        }
        while (!ready);
        Stock s = new Stock(nextStockID, iName, amount, supID, loc);
        return s;
    }

    //view all stock
    public static void printStock(ArrayList<Stock> stock){
        if (stock.size() > 0) {
            int i = 0;
            System.out.println("Index  Stock ID    Item Name                      Amount   Supplier ID    Location");
            for (Stock s:stock) {
                System.out.printf("%05d  %09d   %-20.20s   %9d          %09d    %8.8s %n(Y/N)%n", i, s.getStockID(), s.getItemName(), s.getAmount(), s.getSupplierID(), s.getLocation());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
    }

    //check Stock index
    public static int chkStockIndex(ArrayList<Stock> stock){
        int stockEditChoice;
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the index number of the stock to be modified: ");
            stockEditChoice = in.nextInt();
            if (!(stockEditChoice < 0) && !(stockEditChoice > stock.size())){
                valid = true;
            }
            else {
                System.out.println("Error: Invalid Input, please try again");
            }
        }
        while (!valid);
        return stockEditChoice;
    }

    //Dispatch stock
    public static int dispatchStock(Stock s){
        Scanner in = new Scanner(System.in);
        int dispatch;
        boolean valid = false;
        do{
            System.out.print("Enter the number of units to be dispatched: ");
            dispatch = in.nextInt();
            if (!(dispatch > s.getAmount())){
                valid = true;
            }
            else {
                System.out.println("Error: Insufficient Stock, please try again");
            }
        }
        while (!valid);
        return dispatch;
    }

    //Shift Stock
    public static String shiftStock(){
        Scanner in = new Scanner(System.in);
        String newLoc;
        boolean valid = false;
        do{
            System.out.print("Enter the new location of the stock: ");
            newLoc = in.nextLine();
            System.out.println("Is this the right location?");
            System.out.println(newLoc + " (Y/N)");
            String input = in.next();
            if (input.equalsIgnoreCase("Y")){
                valid = true;
            }
        }
        while(!valid);
        return newLoc;
    }

    //Manage Sales
    //get input for a sale
    public static Sale newSale(int nextSaleID){
        Scanner in = new Scanner(System.in);
        boolean ready = false;
        int cID ;
        int iID;
        int quant;
        double price;
        String day;
        do {
            System.out.println("Enter Sale");
            System.out.print("Enter the Customer ID (If not given, enter \"0\"): ");
            cID = in.nextInt();
            System.out.print("Enter the ID of the item purchased: ");
            iID = in.nextInt();
            System.out.print("Enter the quantity of the item purchased: ");
            quant = in.nextInt();
            System.out.print("Enter the total price of the sale: ");
            price = in.nextDouble();
            System.out.print("Enter the date of the sale (MM.DD.YYYY): ");
            day = in.next();
            System.out.println("Info entered");
            System.out.printf("Is this correct?%nCustomer ID:     %07d %nItem ID:       %09d %nQuantity:      %9d %nSale total: $      %5.2f %nDate:         %s %n(Y/N)%n", cID,iID,quant,price,day);
            String input = in.next();
            if (input.equalsIgnoreCase("y")){
                ready = true;
            }
        }
        while (!ready);
        Sale s = new Sale(nextSaleID, cID, iID, quant, price, day);
        return s;
    }

    //print all sales
    public static void printSales(ArrayList<Sale> sales){
        if (sales.size() > 0) {
            int i = 0;
            System.out.println("Index  Sale ID    Customer ID    Item ID    Quantity   Sale Amount    Date");
            for (Sale s:sales) {
                System.out.printf("%5d  %07d    %09d      %09d %9d         %.2f     %s %n",i,s.getSaleID(),s.getCustomerID(),s.getItemID(),s.getQuantity(),s.getSaleAmount(),s.getDate());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
    }
}
