package src.main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String USERNAME = "Admin";
        final String PASSWORD = "Swordfish";
        ArrayList<Stock> stock = new ArrayList<>();
        int nextStockID = 0;
        ArrayList<Purchase> purchases = new ArrayList<>();
        int nextPurchaseID = 0;
        ArrayList<Supplier> suppliers = new ArrayList<>();
        int nextSupplierID = 0;
        ArrayList<Sale> sales = new ArrayList<>();
        int nextSaleID = 0;
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        int nextCustomerID = 1;
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
                                        System.out.println("Enter Stock");
                                        Stock newStock = newStock(nextStockID);
                                        stock.add(newStock);
                                        System.out.println("Stock entered");
                                        nextStockID++;
                                        break;
                                    case 2: //View Stock
                                        System.out.println("View Stock");
                                        printStock(stock);
                                        break;
                                    case 3: //Dispatch Stock
                                        System.out.println("Dispatch Stock");
                                        if (stock.size() > 0){
                                            printStock(stock);
                                            stockIndex = chkStockIndex(stock);
                                            int dispatchAmount = dispatchStock(stock.get(stockIndex));
                                            stock.get(stockIndex).dispatchStock(dispatchAmount);
                                            System.out.println("Stock Dispatched");
                                        }
                                        else {
                                            System.out.println("There is no stock");
                                        }
                                        break;
                                    case 4: //Shift Stock
                                        System.out.println("Shift Stock");
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
                                int purchaseIndex;
                                System.out.println("View / Manage Purchases");
                                System.out.printf("1: Enter Purchases%n2: View Purchases%n3: Edit Purchases%n4: Delete Purchases%n5: Exit%n");
                                int purchasesChoice = in.nextInt();
                                switch (purchasesChoice){
                                    case 1: //Add Purchase
                                        System.out.println("Add Purchase");
                                        purchases.add(newPurchase(nextPurchaseID));
                                        nextPurchaseID++;
                                        System.out.println("Purchase Added!");
                                        break;
                                    case 2: //View Purchases
                                        System.out.println("View Purchases");
                                        printPurchases(purchases);
                                        break;
                                    case 3: //Edit Purchase
                                        System.out.println("Edit Purchase");
                                        printPurchases(purchases);
                                        purchaseIndex = chkPurchaseIndex(purchases);
                                        purchases.set(purchaseIndex, newPurchase(purchases.get(purchaseIndex).getPurchaseID()));
                                        System.out.println("Purchase Edited!");
                                        break;
                                    case 4: //Delete Purchase
                                        System.out.println("Delete Purchase");
                                        printPurchases(purchases);
                                        purchaseIndex = chkPurchaseIndex(purchases);
                                        purchases.remove(purchaseIndex);
                                        break;
                                    case 5: //Exit
                                        System.out.println("Returning to Main Menu...");
                                        purchasesDone = true;
                                        break;
                                    default:
                                        System.out.println("Error: Invalid option, please try again");
                                        break;
                                }
                            }
                            while (!purchasesDone);
                            break;

                        case 3: //Manage Suppliers
                            boolean suppliersDone = false;
                            do {
                                int supplierIndex;
                                System.out.println("View / Manage Suppliers");
                                System.out.printf("1: Enter Suppliers%n2: View Suppliers%n3: Edit Suppliers%n4: Delete Suppliers%n5: Exit%n");
                                int suppliersChoice = in.nextInt();
                                switch (suppliersChoice){
                                    case 1: //Add Supplier
                                        System.out.println("Add Supplier");
                                        suppliers.add(newSupplier(nextSupplierID));
                                        nextSupplierID++;
                                        System.out.println("Supplier Added!");
                                        break;
                                    case 2: //View Suppliers
                                        System.out.println("View Suppliers");
                                        printSuppliers(suppliers);
                                        break;
                                    case 3: //Edit Supplier
                                        System.out.println("Edit Supplier");
                                        printSuppliers(suppliers);
                                        supplierIndex = chkSupplierIndex(suppliers);
                                        suppliers.set(supplierIndex,newSupplier(suppliers.get(supplierIndex).getSupplierID()));
                                        System.out.println("Supplier Edited!");
                                        break;
                                    case 4: //Delete Supplier
                                        System.out.println("Delete Supplier");
                                        printSuppliers(suppliers);
                                        supplierIndex = chkSupplierIndex(suppliers);
                                        suppliers.remove(supplierIndex);
                                        break;
                                    case 5:
                                        System.out.println("Returning to Main Menu...");
                                        suppliersDone = true;
                                        break;
                                    default:
                                        System.out.println("Error: Invalid option, please try again");
                                        break;
                                }
                            }
                            while (!suppliersDone);
                            break;

                        case 4: //Manage Sales
                            boolean salesDone = false;
                            do {
                                int saleIndex;
                                System.out.println("View / Manage Sales");
                                System.out.printf("1: Enter Sales%n2: View Sales%n3: Edit Sales%n4: Delete Sales%n5: Exit%n");
                                int saleChoice = in.nextInt();
                                switch (saleChoice){
                                    case 1: //Enter Sale
                                        System.out.println("Add Sale");
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
                                        System.out.println("Edit Sale");
                                        if (sales.size() > 0) {
                                            Sale s;
                                            printSales(sales);
                                            saleIndex = chkSalesIndex(sales);
                                            s = newSale(sales.get(saleIndex).getSaleID());
                                            sales.set(saleIndex, s);
                                            System.out.println("Entry Edited");
                                        }
                                        else {
                                            System.out.println("There are no sales to edit");
                                        }
                                        break;
                                    case 4: //Delete Sale
                                        if (sales.size() > 0) {
                                            System.out.println("Delete Sale");
                                            saleIndex = chkSalesIndex(sales);
                                            sales.remove(saleIndex);
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
                                int customerChoice;
                                int customerIndex;
                                System.out.println("View / Manage Customers");
                                System.out.printf("1: Add Customers%n2: View Customers%n3: Edit Customers%n4: Delete Customers%n5: Exit%n");
                                customerChoice = in.nextInt();
                                switch (customerChoice){
                                    case 1: //Add Customer
                                        System.out.println("Add Customer");
                                        Customer newCustomer = newCustomer(nextCustomerID);
                                        customers.add(newCustomer);
                                        System.out.println("Customer Added!");
                                        nextCustomerID++;
                                        break;
                                    case 2: //View Customers
                                        System.out.println("View Customers");
                                        printCustomers(customers);
                                        break;
                                    case 3: //Edit Customers
                                        System.out.println("Edit Customers");
                                        if (customers.size()>0){
                                            printCustomers(customers);
                                            customerIndex = chkCustomerIndex(customers);
                                            Customer c = newCustomer(customers.get(customerIndex).getCustomerID());
                                            customers.set(customerIndex, c);
                                            System.out.println("Entry Edited");
                                        }
                                        else {
                                            System.out.println("There are no customers");
                                        }
                                        break;
                                    case 4: //Delete Customers
                                        System.out.println("Delete Customers");
                                        if (customers.size()>0){
                                            printCustomers(customers);
                                            customerIndex = chkCustomerIndex(customers);
                                            customers.remove(customerIndex);
                                        }
                                        else {
                                            System.out.println("There are no customers");
                                        }
                                        break;
                                    case 5: //Exit
                                        System.out.println("Returning to Main Menu...");
                                        customersDone = true;
                                        break;
                                    default:
                                        System.out.println("Error: Invalid option, please try again");
                                }
                            }
                            while (!customersDone);
                            break;
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
            iName = in.nextLine();
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
        return new Stock(nextStockID, iName, amount, supID, loc);
    }

    //view all stock
    public static void printStock(ArrayList<Stock> stock){
        if (stock.size() > 0) {
            int i = 0;
            System.out.println("Index  Stock ID    Item Name              Amount      Supplier ID    Location");
            for (Stock s:stock) {
                System.out.printf("%05d  %09d   %-20.20s   %9d     %09d    %8.8s %n", i, s.getStockID(), s.getItemName(), s.getAmount(), s.getSupplierID(), s.getLocation());
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
        boolean confirm = false;
        String check;
        do {
            do {
                System.out.print("Enter the index number of the stock to be modified: ");
                stockEditChoice = in.nextInt();
                if (!(stockEditChoice < 0) && (stockEditChoice < stock.size())){
                    valid = true;
                }
                else {
                    System.out.println("Error: Invalid Input, please try again");
                }
            }
            while (!valid);
            System.out.println("Is this the correct entry?");
            System.out.println("Index  Stock ID    Item Name              Amount      Supplier ID    Location");
            System.out.printf("%05d  %09d   %-20.20s   %9d     %09d    %8.8s %n", stockEditChoice, stock.get(stockEditChoice).getStockID(), stock.get(stockEditChoice).getItemName(), stock.get(stockEditChoice).getAmount(), stock.get(stockEditChoice).getSupplierID(), stock.get(stockEditChoice).getLocation());
            System.out.println("(Y/N)");
            check = in.next();
            if (check.equalsIgnoreCase("Y")){
                confirm = true;
            }
        }
        while (!confirm);
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
            System.out.printf("Is this correct?%nCustomer ID:     %07d %nItem ID:       %09d %nQuantity:      %9d %nSale total: $%11.2f %nDate:         %s %n(Y/N)%n", cID,iID,quant,price,day);
            String input = in.next();
            if (input.equalsIgnoreCase("y")){
                ready = true;
            }
        }
        while (!ready);
        return new Sale(nextSaleID, cID, iID, quant, price, day);
    }

    //print all sales
    public static void printSales(ArrayList<Sale> sales){
        if (sales.size() > 0) {
            int i = 0;
            System.out.println("Index  Sale ID      Customer ID    Item ID    Quantity   Sale Amount    Date");
            for (Sale s:sales) {
                System.out.printf("%05d  %09d    %09d      %09d %9d         %.2f    %s %n",i,s.getSaleID(),s.getCustomerID(),s.getItemID(),s.getQuantity(),s.getSaleAmount(),s.getDate());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
    }

    //check sales index
    public static int chkSalesIndex(ArrayList<Sale> sales){
        int salesEditChoice;
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        boolean confirm = false;
        String check;
        do {
            do {
                System.out.print("Enter the index number of the sale to be modified: ");
                salesEditChoice = in.nextInt();
                if (!(salesEditChoice < 0) && (salesEditChoice < sales.size())){
                    valid = true;
                }
                else {
                    System.out.println("Error: Invalid Input, please try again");
                }
            }
            while (!valid);
            System.out.println("Is this the correct entry?");
            System.out.println("Index  Sale ID      Customer ID    Item ID    Quantity   Sale Amount    Date");
            System.out.printf("%05d  %09d    %09d      %09d %9d         %.2f    %s %n",salesEditChoice,sales.get(salesEditChoice).getSaleID(),sales.get(salesEditChoice).getCustomerID(),sales.get(salesEditChoice).getItemID(),sales.get(salesEditChoice).getQuantity(),sales.get(salesEditChoice).getSaleAmount(),sales.get(salesEditChoice).getDate());
            System.out.println("(Y/N)");
            check = in.next();
            if (check.equalsIgnoreCase("Y")){
                confirm = true;
            }
        }
        while (!confirm);
        return salesEditChoice;
    }



    //Purchases
    //New Purchase
    public static Purchase newPurchase(int nextPurchaseID){
        Scanner in = new Scanner(System.in);
        boolean ready = false;
        int sID, iID;
        double price;
        String purchaseD, paymentD;
        do{
            System.out.print("Enter the Supplier ID: ");
            sID = in.nextInt();
            System.out.print("Enter the Item ID: ");
            iID = in.nextInt();
            System.out.print("Enter the total price of the purchase: ");
            price = in.nextDouble();
            System.out.print("Enter the date of the purchase (MM.DD.YYYY): ");
            purchaseD = in.next();
            System.out.print("Enter the date the purchase was paid for (MM.DD.YYYY): ");
            paymentD = in.next();
            System.out.println("Info Entered");
            System.out.printf("Is this correct? %nSupplier ID:    %09d %nItem ID:        %09d %nTotal Price:    %6.2f %nPurchase Date: %s %nPayment Date:  %s %n(Y/N)", sID, iID, price, purchaseD, paymentD);
            String input = in.next();
            if (input.equalsIgnoreCase("Y")){
                ready = true;
            }
        }
        while (!ready);
        return new Purchase(nextPurchaseID, sID, iID, price, purchaseD, paymentD);
    }

    //List All Purchases
    public static void printPurchases(ArrayList<Purchase> purchases){
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
    }

    //Check Purchase Index
    public static int chkPurchaseIndex(ArrayList<Purchase> purchases) {
        int editChoice;
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        boolean confirm = false;
        String check;
        do {
            do {
                System.out.print("Enter the index number of the Purchase to be modified: ");
                editChoice = in.nextInt();
                if (!(editChoice < 0) && (editChoice < purchases.size())){
                    valid = true;
                }
                else {
                    System.out.println("Error: Invalid Input, please try again");
                }
            }
            while (!valid);
            System.out.println("Is this the correct entry?");
            //print info here
            System.out.printf("Purchase ID:    %09d %nSupplier ID:    %09d %nItem ID:        %09d %nTotal Price:       %6.2f %nPurchase Date: %s %nPayment Date:  %s %n",purchases.get(editChoice).getPurchaseID() , purchases.get(editChoice).getSupplierID(), purchases.get(editChoice).getItemID(), purchases.get(editChoice).getTotalPrice(), purchases.get(editChoice).getPurchaseDate(), purchases.get(editChoice).getPaymentDate());
            System.out.println("(Y/N)");
            check = in.next();
            if (check.equalsIgnoreCase("Y")){
                confirm = true;
            }
        }
        while (!confirm);
        return editChoice;
    }



    //Suppliers
    //New Supplier
    public static Supplier newSupplier(int nextSupplierID){
        Scanner in = new Scanner(System.in);
        boolean ready = false;
        String sName, addr, email, phoneNo;
        do {
            System.out.print("Enter the Name of the Supplier: ");
            sName = in.next();
            System.out.print("Enter the Address of the Supplier: ");
            addr = in.next();
            System.out.print("Enter the E-mail of the Supplier: ");
            email = in.next();
            System.out.print("Enter the Phone Number of the Supplier: ");
            phoneNo = in.next();
            System.out.printf("Is this correct? %nName:       %-30s %nAddress:    %-55s %nE-mail:     %-30s %nPhone No.:  %-12s %n(Y/N) %n", sName,addr,email,phoneNo);
            String input = in.next();
            if (input.equalsIgnoreCase("y")){
                ready = true;
            }
        }
        while (!ready);
        return new Supplier(nextSupplierID, sName, addr, email, phoneNo);
    }

    //List All Suppliers
    public static void printSuppliers(ArrayList<Supplier> suppliers){
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
    }

    //Check Supplier Index
    public static int chkSupplierIndex(ArrayList<Supplier> suppliers){
        int editChoice;
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        boolean confirm = false;
        String check;
        do {
            do {
                System.out.print("Enter the index number of the Supplier to be modified: ");
                editChoice = in.nextInt();
                if (!(editChoice < 0) && (editChoice < suppliers.size())){
                    valid = true;
                }
                else {
                    System.out.println("Error: Invalid Input, please try again");
                }
            }
            while (!valid);
            System.out.println("Is this the correct entry?");
            //Print info here
            System.out.printf("Index:      %09d %nName:       %-30s %nAddress:    %-55s %nE-mail:     %-30s %nPhone No.:  %-12s %n(Y/N) %n", suppliers.get(editChoice).getSupplierID(), suppliers.get(editChoice).getSupplierName(),suppliers.get(editChoice).getAddress(),suppliers.get(editChoice).getEmail(),suppliers.get(editChoice).getPhoneNumber());
            check = in.next();
            if (check.equalsIgnoreCase("Y")){
                confirm = true;
            }
        }
        while (!confirm);
        return editChoice;
    }


    //Manage Customers
    //New Customer
    public static Customer newCustomer(int nextCustomerID) {
        Scanner in = new Scanner(System.in);
        boolean ready = false;
        String n;
        String addr;
        String phoneNo;
        String email;
        do{
            System.out.print("Enter the customer's Name: ");
            n = in.nextLine();
            System.out.print("Enter the customer's address: ");
            addr = in.nextLine();
            System.out.print("Enter the customer's Phone Number: ");
            phoneNo = in.next();
            System.out.print("Enter the customer's E-Mail Address: ");
            email = in.next();
            System.out.println("Info Entered");
            System.out.printf("Is this correct?%nName: %s%nAddress: %s%nPhone Number: %s%nEmail Address: %s%n (Y/N)%n",n,addr,phoneNo,email);
            String input = in.next();
            if (input.equalsIgnoreCase("Y")){
                ready = true;
            }
        }
        while (!ready);
        return new Customer(nextCustomerID,n,addr,phoneNo,email);
    }

    //list all customers
    public static void printCustomers(ArrayList<Customer> customers){
        if (customers.size() > 0) {
            int i = 0;
            System.out.println("Index  Customer ID    Name                           Address                                                 Phone Number   E-Mail");
            for (Customer s:customers) {
                System.out.printf("%5d      %07d    %-30s %-55s %-10s   %-40s%n",i,s.getCustomerID(),s.getName(),s.getAddress(),s.getPhoneNo(),s.getEmail());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
    }

    //check index of customer
    public static int chkCustomerIndex(ArrayList<Customer> customers){
        int customerEditChoice;
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        boolean confirm = false;
        String check;
        do {
            do {
                System.out.print("Enter the index number of the Customer to be modified: ");
                customerEditChoice = in.nextInt();
                if (customerEditChoice == 0){
                    System.out.println("This is the default customer. It cannot be modified.");
                }
                else if (!(customerEditChoice < 0) && (customerEditChoice < customers.size())){
                    valid = true;
                }
                else {
                    System.out.println("Error: Invalid Input, please try again");
                }
            }
            while (!valid);
            System.out.println("Is this the correct entry?");
            System.out.println("Index  Customer ID    Name                           Address                                  Phone Number   E-Mail");
            System.out.printf("%5d      %07d    %-30s %-40s %-10s   %-40s%n", customerEditChoice,customers.get(customerEditChoice).getCustomerID(),customers.get(customerEditChoice).getName(),customers.get(customerEditChoice).getAddress(),customers.get(customerEditChoice).getPhoneNo(),customers.get(customerEditChoice).getEmail());
            System.out.println("(Y/N)");
            check = in.next();
            if (check.equalsIgnoreCase("Y")){
                confirm = true;
            }
        }
        while (!confirm);
        return customerEditChoice;
    }
}
