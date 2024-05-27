package D_OOP_Inheritance.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount omerAccount = new BankAccount(12345,1000.00,"ömer can",
                "omercan@can.com", 123455);
//        omerAccount.setNumber(5);
//        omerAccount.setBalance(500);
//        omerAccount.setCustomerName("Ömer Can Söyü");
//        omerAccount.setCustomerEmail("omer@gmail.com");
//        omerAccount.setCustomerPhone(34567834);
        System.out.println("---------------------------------------------------");

        BankAccount ayseAccount = new BankAccount();

        ayseAccount.withdrawFunds(500);
        ayseAccount.depositingFunds(1240);

        System.out.println("---------------------------------------------------");

        BankAccount samad = new BankAccount("samad","samad@xyz.com",54323248);
        System.out.println("Hoş geldiniz numaraniz: " + samad.getNumber() + " bakiyeniz: " + samad.getBalance()+ "TL" +
                "'dir");
        samad.withdrawFunds(230);
        samad.depositingFunds(190);
    }
}
