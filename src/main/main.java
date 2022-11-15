package src.main;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        final String USERNAME = "Admin";
        final String PASSWORD = "Swordfish";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("Welcome to the KWT Jr. Inventory Management System!");
            System.out.println("Please login to continue, or press \"Q\" to quit.");
            System.out.print("Please enter your Username: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                done = true;
            }
            else {
                System.out.println("");
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
                            boolean purchacesDone = false;
                            do {
                                System.out.println("View / Manage Purchases");
                            }
                            while (!purchacesDone);
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
}
