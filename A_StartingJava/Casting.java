package A_StartingJava;

public class Casting {
    public static void main(String[] args) {

        int MyIntegerValue = Integer.MIN_VALUE;
        byte MyByteValue = Byte.MIN_VALUE;
        short MyShortValue = Short.MIN_VALUE;

        int NewIntegerValue = (MyIntegerValue / 2);
        byte NewByteValue1 = (-128 / 2);
        //byte NewByteValue = (MyByteValue / 2);
        //short NewShortValue = (MyShortValue / 2);

//Java’da, byte ve short türündeki değişkenlerle aritmetik işlemler yaparken, sonuçlar otomatik olarak int türüne dönüştürülür.
// Bu nedenle, bir byte veya short değişkenine bir aritmetik işlem sonucunu doğrudan atamak hatalıdır.
// Örneğin, MyByteValue / 2 ve MyShortValue / 2 işlemlerinin sonuçları int türünde olacaktır.
// Bu sonuçları doğrudan byte ve short türündeki değişkenlere atamak hata verecektir.

        //bu şekilde atama yapılmalıdır:

        byte NewByteValue3 = (byte) (MyByteValue / 2);
        short NewShortValue4 = (short) (MyShortValue / 2);

    }
}
