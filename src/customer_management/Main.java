package customer_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create a customer class
        //create a runner class that will add a new customer,
        // update the existing customer;
        // delete an existing customer;
        //show all customers.


        List<Customer> customers = generateCustomers();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to customer management platform");

        while (true) {

            System.out.println("add | update | delete | delete all | info | quit ");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("add")) {

                System.out.print("First name of the customer is: ");
                String firstName = scanner.nextLine();

                System.out.print("Last name of the customer is: ");
                String lastName = scanner.nextLine();

                System.out.print("Address of the customer is: ");
                String address = scanner.nextLine();

                System.out.print("SSN of the customer: ");
                String ssn = scanner.nextLine();

                Customer newCustomer = new Customer(lastName, firstName, address, ssn);


                if (customers.isEmpty()) {
                    customers.add(newCustomer);
                    System.out.println("Customer added successfully");
                    continue;
                }
                boolean exists = false;
                for (int i = 0; i < customers.size(); i++) {

                    Customer customer = customers.get(i);

                    if (customer.getSsn().equalsIgnoreCase(newCustomer.getSsn())) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    customers.add(newCustomer);
                    System.out.println("Customer added successfully");
                } else {
                    System.out.println("Customer already exists");
                    break;

                }
            } else if (option.equalsIgnoreCase("info")) {
                if (customers.isEmpty()) {
                    System.out.println("No customers yet");
                    continue;
                }
                for (int i = 0; i < customers.size(); i++) {
                    System.out.println((i + 1) + ". " + customers.get(i));

                }


            } else if (option.equalsIgnoreCase("delete")) {
                System.out.print("Please enter ssn of the customer you would like to delete: ");
                String ssnNumber = scanner.nextLine();
                Customer customerToDelete = null;
                for (int i = 0; i < customers.size(); i++) {
                    if (ssnNumber.equalsIgnoreCase(customers.get(i).getSsn())) {
                        customerToDelete = customers.get(i);
                        break;
                    }

                }
                if (customerToDelete != null) {
                    customers.remove(customerToDelete);
                    System.out.println("Customer with SSN " + ssnNumber + " deleted successfully!");
                } else {
                    System.out.println("Customer with SSN " + ssnNumber + " does not exist");
                }
            } else if (option.equalsIgnoreCase("update")) {
                System.out.print("Please enter ssn of the customer you would like to delete: ");
                String ssnNumber = scanner.nextLine();
                Customer customerToUpdate = null;
                for (int i = 0; i < customers.size(); i++) {
                    if (ssnNumber.equalsIgnoreCase(customers.get(i).getSsn())) {
                        customerToUpdate = customers.get(i);
                        break;
                    }
                }
                if (customerToUpdate != null) {
                    System.out.print("New First Name: ");
                    String newFirstName = scanner.nextLine();
                    customerToUpdate.setFirstName(newFirstName);

                    System.out.print("New Last Name: ");
                    String newLastName = scanner.nextLine();
                    customerToUpdate.setLastName(newLastName);

                    System.out.print("New Address: ");
                    String newAddress = scanner.nextLine();
                    customerToUpdate.setAddress(newAddress);

                    System.out.println(" Successfully updated customer SSN " + ssnNumber);
                    System.out.println(customerToUpdate);

                } else {
                    System.out.println("Invalid option");
                }
            }
            else if( option.equalsIgnoreCase("quit")){
                System.out.println("Have a nice day!");
                break;
            }
            else if(option.equalsIgnoreCase("delete all")){
                customers.clear();
                System.out.println("Delete all customers");
            }
            else{
                System.out.println("Invalid option");
            }


        }
    }
    public static List <Customer> generateCustomers(){
        List <Customer> customer = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            customer.add(new Customer("Jack", "Smith", "123 main street", ("123456"+i)));
        }
        return customer;
    }
    }
