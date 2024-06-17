package f_java_list.autoboxing_and_unboxing.banking_challenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("ING");
        bank.addNewCustomer("Omer Can",500.0);
        System.out.println(bank);
        bank.addTransaction("Omer Can",-100.0);
        bank.addTransaction("omer can",500.0);
        bank.addTransaction("omer can",-340.0);
        bank.printStatement("Omer Can");

        bank.addNewCustomer("daniel g",100.0);
        bank.addTransaction("daniel g",25.00);
        bank.addTransaction("daniel g",64.00);
        bank.printStatement("daniel g");

    }
}
