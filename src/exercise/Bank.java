package exercise;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for(Branch branch : branches) {
            if(branch.getName() == branchName)
                return branch;
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) != null)
            return false;
        Branch newBranch = new Branch(branchName);
        this.branches.add(newBranch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch customerBranch = findBranch(branchName);
        if(customerBranch == null)
            return false;
        return customerBranch.newCustomer(customerName, transaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch customerBranch = findBranch(branchName);
        if(customerBranch == null)
            return false;
        ArrayList<Customer> customerList = customerBranch.getCustomers();
        Customer _customer = null;
        for(Customer customer : customerList) {
            if(customer.getName() == customerName) {
                _customer = customer;
                break;
            }
        }

        if(_customer == null)
            return false;
        _customer.addTransaction(transaction);
        return true;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if(branch == null)
            return false;
        System.out.println("Customer details for branch " + branchName);
        ArrayList<Customer> customers = branch.getCustomers();
        for(int i=0; i<customers.size(); i++) {
            System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");
            if(printTransactions) {
                System.out.println("Transactions");
                int size = customers.get(i).getTransactions().size();
                for(int j=0; j<size; j++) {
                    System.out.println("[" + (j+1) + "]" + "  Amount " +
                            customers.get(i).getTransactions().get(j));
                }
            }
        }
        return true;
    }
}
