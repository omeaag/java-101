package A_StartingJava;

public class FloatAndDouble {
    public static void main(String[] args) {

        int sayi = 5;

        float sayi1 = 5;
        sayi1 = 5f;

        double sayi2 = 5;

        //float sayi3 = 5.25; //java'da default ondalıklı veri tipi double'dır. o yüzden float tipindeki
        // değişkene bu şekilde direkt ondalıklı sayı atanmaz hata verir.

        float sayi4 = (float) 5.25;
        float sayi5 = 5.25f;
        //-------------------------------------

        int sayi6 = 5 / 2;//sayi6 = 2 olur.
        float sayi7 = 5f / 2f; //sayi7 = 2.5
        double sayi8 = 5d / 2d; //sayi8 = 2.5

        int IntNumber = 5 / 3; //IntNumber = 1 olur
        float FloatNumber = 5f / 3f; //FloatNumber = 1.6666666 olur
        double DoubleNumber = 5d / 3d; //DoubleNumber = 1.6666666666666667 olur
        //double veri tipi aritmetik işlemlerde float tipine göre daha hassas değer saklar.

        double pounds = 200d;

        double kilograms = (pounds * 0.45359237d);

        System.out.println(kilograms);

        //---------------------------------

        double pi = 3.1415927d;
        double anothernumber = 3_000_000.4_567_670d; //anothernumber = 3000000.456767 olur

    }
}
