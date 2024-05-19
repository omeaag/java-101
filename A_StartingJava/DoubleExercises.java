package A_StartingJava;

public class DoubleExercises {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b) * 100.00d;
        System.out.println("My values total: " + c);
        double d = c % 40.00d;
        boolean e = (d == 0) ? true: false;
        System.out.println("result is: " + e);

        if(!e){
            System.out.println("kalan var");
        }

    }
}
