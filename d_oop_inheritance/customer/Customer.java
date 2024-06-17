package d_oop_inheritance.customer;

public class Customer {

    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public Customer(){
        this("default","default@default.com");
        System.out.println("Boş constructor ile  oluşturulan default customer.");
    }

    public Customer(String customerName, String email){
        this(customerName,1000.00,email);
        System.out.println("isim ve email parametrelerini içeren constructor ile oluşturulan customer.");
    }

    public Customer(String customerName, double creditLimit, String customerEmail){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;

        System.out.println("Tüm parametreleri içeren constructor ile oluşturulan customer.");
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }


}
