package src.test;
import src.main.Customer;

import java.util.ArrayList;

public class CustomerTester {
    public static void main(String[] args) {
      //  int id;
        Customer nadine = new Customer();
        nadine.setCustomerID(1);
        System.out.println(nadine.getCustomerID());
        //String name;
        nadine.setName("Nancy Sample");
        System.out.println(nadine.getName());
        nadine.setAddress("123 Mall st., City ST, 98765");
        //String address;
        nadine.getAddress();
        System.out.println(nadine.getAddress());
        //String phoneNo;
        nadine.setPhoneNo("678-123-4567");
        System.out.println(nadine.getPhoneNo());
        nadine.setEmail("nancy@twkjr.com");
        System.out.println(nadine.getEmail());
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(nadine);

        System.out.println(customers.get(0).getCustomerID());

        if (customers.size() > 0) {
            int i = 0;
            System.out.println("Index  Customer ID    Name                           Address                                  Phone Number   E-Mail");
            for (Customer s:customers) {
                System.out.printf("%5d      %07d    %-30s %-40s %-10s   %-40s%n",i,s.getCustomerID(),s.getName(),s.getAddress(),s.getPhoneNo(),s.getEmail());
                i++;
            }
        }
        else {
            System.out.println("This list is empty.");
        }
    }
}

