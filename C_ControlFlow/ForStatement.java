package C_ControlFlow;

public class ForStatement {

    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10; rate += 0.25){
            double interestAmount = calculateInterest(100.00, rate);
            if (interestAmount > 8.5){ //döngüyü sınırlandırmak için break kullanılabilir.
                break;
            }
            System.out.println("$100 at " + rate + "% interest = $" + interestAmount );
        }
    }
    public static double calculateInterest(double amount, double rate){
        return amount * (rate / 100);
    }
}
