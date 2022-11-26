package src.main;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        final String USERNAME = "Admin";
        final String PASSWORD = "Swordfish";
        ArrayList<Sale> sales = new ArrayList<>();
        int nextSaleID = 0;
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
                    System.out.print(USERNAME + "please enter your password: ");
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
                                System.out.printf("1: Enter Stock %n2: View Stock %n3: Dispatch Stock %n4: Shift Stock %n5: Exit %n");
                                choice = in.nextInt();
                                switch (choice){
                                    case 1: //Enter Stock
                                        //Dummy code, to be replaced
                                        System.out.println("Stock entered");
                                        break;
                                    case 2: //View Stock
                                        //Dummy code, to be replaced
                                        System.out.println("Stock shown");
                                        break;
                                    case 3: //Dispatch Stock
                                        //Dummy code, to be replaced
                                        System.out.println("Stock Dispatched");
                                        break;
                                    case 4: //Shift Stock
                                        //Dummy code, to be replaced
                                        System.out.println("Stock Shifted");
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
                                int sChoice = in.nextInt();
                                switch (sChoice){
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

    //Manage Sales
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
