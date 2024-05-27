package D_OOP_Inheritance.Customer;

public class Main {
    public static void main(String[] args) {
        Customer omer = new Customer();
        Customer buket = new Customer("buket","buket@xyz.com");
        Customer ece = new Customer("ece",3700.00,"ece@mece.com");

        System.out.println("---------------------------------------------------------");

        System.out.println("Hoşgeldin " + omer.getCustomerName()+
                ", kredi limitiniz: " + omer.getCreditLimit() +
                "TL'dir. Sistemde kayıtlı email adresiniz: "+ omer.getCustomerEmail());

        System.out.println("Hoşgeldin " + buket.getCustomerName()+
                ", kredi limitiniz: " + buket.getCreditLimit() +
                "TL'dir. Sistemde kayıtlı email adresiniz: "+ buket.getCustomerEmail());

        System.out.println("Hoşgeldin " + ece.getCustomerName()+
                ", kredi limitiniz: " + ece.getCreditLimit() +
                "TL'dir. Sistemde kayıtlı email adresiniz: "+ ece.getCustomerEmail());
    }
}
