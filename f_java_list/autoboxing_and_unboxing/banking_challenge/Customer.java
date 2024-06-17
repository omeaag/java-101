package f_java_list.autoboxing_and_unboxing.banking_challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name, ArrayList<Double> transactionList) {
        this.name = name;
        this.transactionList = transactionList;
    }

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactionList.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }
    public double getBalance(){
        double balance = 0;
        for (Double transaction : transactionList) {
            balance += transaction;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactionList=" + transactionList +
                '}';
    }
}
