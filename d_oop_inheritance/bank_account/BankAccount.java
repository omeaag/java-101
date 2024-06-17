package d_oop_inheritance.bank_account;

public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public BankAccount(){
        this(43567,1000.00,"default name",
                "xyz@email.com",000000);
        System.out.println("no arguments constructor çalıştı.");
    }

    public BankAccount(int number, double balance, String name, String email, int phone){
        System.out.println("parametreli contructor çalıştı.");

        this.number = number;
        this.balance = balance;
        this.customerName = name;
        this.customerEmail = email;
        this.customerPhone = phone;
    }

    public BankAccount(String customerName, String customerEmail, int customerPhone) {
        this(888888,500, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositingFunds(double amount){
        if(amount<=0){
            System.out.println("Lütfen geçerli bir miktar giriniz.");
            return;
        }
        balance += amount;
        System.out.println("Hesabınıza " + amount + "TL para yatırma işlemi başarıyla gerçekleşmiştir. " +
                "Güncel bakiyeniz "+ getBalance() + "TL");
    }
    public void withdrawFunds(double amount){
        if(amount<=0){
            System.out.println("Lütfen geçerli bir miktar giriniz.");
            return;
        }
        if(balance-amount<0){
            System.out.println("Hesap bakiyeniz yetersiz.");
            return;
        }

        balance -= amount;
        System.out.println("Hesabınızdan " + amount + "TL nakit çekim işlemi gerçekleşmiştir. " +
                "Güncel bakiyeniz "+ getBalance() + "TL");

    }
}
