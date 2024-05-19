package A_StartingJava;

public class Operators {
    public static void main(String[] args) {

        char karakter1 = 'A';
        char karakter2 = 'B';

        System.out.println(karakter1 + karakter2); // 131 çıktı değeri verir. çünkü toplama operatörü char türündeki
        // karakterlerin unicode sayı karşılıklarını toplar.

        //------------------------------------
        int result = 10;
        result -= 5.5; //sorunsuz çalışır. result = 4 olur.
        //result = result - 5.5; //hata verir.
        System.out.println(result);

        // Java’da bileşik atama operatörleri (+=, -=, *=, /=, vb.) işlemi gerçekleştirdikten sonra sonucu
        // otomatik olarak sol taraftaki değişkenin türüne dönüştürür.
        // Yani, result -= 5.5; ifadesi, result = (int)(result - 5.5); ifadesine eşdeğerdir.
        //
        // Ancak, result = result - 5.5; ifadesinde, (result - 5.5) işlemi bir double değer döndürür ve bu değeri
        // int türündeki result değişkenine atamaya çalıştığınızda hata alırsınız.
        // Çünkü bu durumda otomatik tür dönüştürme yapılmaz.
        //
        // Bu nedenle, Java’da da result = result - 5.5; ifadesi hata verirken, result -= 5.5; ifadesi hata vermez.
        // Bu, Java dilinin tasarımına bağlı bir durumdur.
        // Bu tür otomatik dönüştürmeler, bazen beklenmeyen sonuçlara yol açabilir, bu yüzden dikkatli olmak önemlidir.
        // Özellikle de ondalık değerlerin tam sayılara dönüştürülmesi sırasında ondalık kısmın kaybolacağını unutmayın.
        // Bu nedenle, bu tür dönüşümleri yaparken dikkatli olmak önemlidir.

        int number = 50;
        //if(number = 50){ //if ifade kısmında beklenen değer booleandır. ama burada int olduğu için hatalı olur.
            System.out.println("number value is 50");


        boolean isCar = false;
        if(isCar = true){ //burada boolean olduğu için çalışır. ama atama yerine equals to
            System.out.println("yes it's car");
        }

        String car = "Volkswagen";

        boolean isDomestic = car == "Volkswagen" ? false : true; //Ternary operator
        boolean isDomestic1 = (car != "Volkswagen"); //ternary operator ile aynı işlemi yapar

        System.out.println(isDomestic);
        System.out.println(isDomestic1);

        //Karşılaştırma operatörü (!=), iki operandın eşit olup olmadığını kontrol eder.
        // Eğer iki operand birbirine eşit değilse, operatör true değerini döndürür.
        // Eğer iki operand birbirine eşitse, operatör false değerini döndürür.
    }
}
