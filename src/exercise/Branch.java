package exercise;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        for(Customer customer : customers) {
            if(customer.getName() == name)
                return customer;
        }
        return null;
    }

    public boolean newCustomer(String name, double transaction) {
        if(findCustomer(name) != null){
            return false;
        }
        Customer customer = new Customer(name, transaction);
        this.customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        if(findCustomer(name) == null)
            return false;
        for(Customer customer : customers) {
            if(customer.getName() == name) {
                customer.addTransaction(transaction);
            }
        }
        return true;
    }
}
