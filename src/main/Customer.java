/*

 Customer class
 This JAVA Class is a class in a project.
 This part is contributed by Wafaa Mohamedahmed to the project.
 Project is a KWTjr Inc. Stock management system.
*/
package src.main;
public class Customer {
 int customerID;
 private String name;
 private String address;
 private String phoneNo;
 private String email;

 public Customer() {
  customerID = 0;
  name = "N/A";
  address = "";
  phoneNo = "";
  email = "";
 }
 public Customer(int customerID, String name, String address, String phoneNo, String email) {
  this.customerID = customerID;
  this.name = name;
  this.address = address;
  this.phoneNo = phoneNo;
  this.email = email;
 }
 public void setCustomerID(int customerID) {
  this.customerID = customerID;
 }
 public int getCustomerID() {
  return customerID;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getName() {
  return name;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getAddress() {
  return address;
 }

 public void setPhoneNo(String phoneNo) {
  this.phoneNo = phoneNo;
 }

 public String getPhoneNo() {
  return phoneNo;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getEmail() {
  return email;
 }
}
