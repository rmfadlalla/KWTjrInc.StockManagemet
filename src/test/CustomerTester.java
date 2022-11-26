package src.test;
import src.main.Customer;

public class CustomerTester {
    public static void main(String[] args) {
      //  int id;
        Customer nadine = new Customer();
        nadine.setCustomerID(1);
        System.out.println(nadine.getCustomerID());
        //String name;
        nadine.setName("Nancy Sample");
        System.out.println(nadine.getName());
        //String address;
        nadine.getAddress();
        System.out.println(nadine.getAddress());
        //String phoneNo;
        nadine.setPhoneNo("678-123-4567");
        System.out.println(nadine.getPhoneNo());
        nadine.setEmail("nancy@twkjr.com");
        System.out.println(nadine.getEmail());

    }
}

