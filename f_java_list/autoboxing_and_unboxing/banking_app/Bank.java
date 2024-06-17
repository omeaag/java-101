package f_java_list.autoboxing_and_unboxing.banking_app;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        for(Branch b: branches){
            if(b.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        branches.add(new Branch(branchName));
        return true;
    }
    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName,transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            ArrayList<Customer> clist = branch.getCustomers();
            int customerIndex = 1;
            System.out.println("Customer details for branch " + branch.getName());
            for(Customer c : clist){
                System.out.printf("Customer: %s[%d]\n",c.getName(),customerIndex);
                customerIndex++;
                if(printTransactions){
                    int tIndex = 1;
                    System.out.println("Transactions");
                    for (Double aDouble : c.getTransactions()) {
                        System.out.printf("[%d] Amount %.2f\n", tIndex, aDouble);
                        tIndex++;
                    }
                }
            }
            return true;
        }
        return false;
    }



    private Branch findBranch(String branchName){
        for(Branch b : branches){
            if(b.getName().equalsIgnoreCase(branchName)){
                return b;
            }
        }
        return null;
    }

}
