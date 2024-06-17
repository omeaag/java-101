package f_java_list.autoboxing_and_unboxing.banking_challenge;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customerList = new ArrayList<>(5000);

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", customerList=" + customerList +
                '}';
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customerList.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }
    public void addTransaction(String name, double transactionAmount){
        var customer = getCustomer(name);
        if(customer != null){
            customer.getTransactionList().add(transactionAmount);
            return;
        }
    }
    private Customer getCustomer(String customerName){
        for(var customer: customerList){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) doesn't exist %n", customerName);
        return null;
    }
    public void printStatement(String name){
        var customer = getCustomer(name);
        if(customer == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Transactions: ");
        for(double d : customer.getTransactionList()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit": "credit");
        }
        System.out.println("-".repeat(30));
        System.out.printf("Total balance: $%.2f%n", customer.getBalance());

    }

}
