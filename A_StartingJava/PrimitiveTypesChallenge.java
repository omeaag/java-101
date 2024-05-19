package A_StartingJava;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte ByteNumber = 10;
        short ShortNumber = 200;
        int IntegerNumber = 2000;
        int SumOfThree = ByteNumber + ShortNumber + IntegerNumber;

        long LongNumber1 = 50000L + 10L * (ByteNumber + ShortNumber + IntegerNumber);
        long LongNumber = 50000 + (10 * SumOfThree); //int değeri oluşur ancak long tipinde değişkene atanırken
        // otomatik olarak dönüşütürülür. long - int için geçerlidir bu özellik.
        // yani L kullanmaya gerek yoktur long dönüşümü için.
        //Java’da, int tipindeki bir değer otomatik olarak long tipine dönüştürülür. Bu, genişletici tip dönüşümü olarak adlandırılır.
        // Bu nedenle, int tipindeki bir aritmetik işlem sonucu long tipinde bir değişkene atanabilir ve bu durumda hata vermez.
        //Yani, 50000 + (10 * SumOfThree) ifadesi int tipinde bir sonuç üretir. Ancak, bu sonuç long tipindeki LongNumber
        // değişkenine atanırken, otomatik olarak long tipine dönüştürülür. Bu nedenle, bu ifade hata vermez.
        //
        //Ancak, bu otomatik dönüşüm sadece daha geniş bir tipe (örneğin, int’ten long’a) dönüşüm yaparken geçerlidir.
        // Daha dar bir tipe (örneğin, long’dan int’e) dönüşüm yaparken, dönüşümü manuel olarak yapmanız gerekir. Aksi takdirde,
        // derleyici bir hata verir. Bu, veri kaybını önlemek için yapılan bir güvenlik önlemidir.

        int NewInteger = (int) LongNumber; // int - long için dönüşüm gereklidir

        short ShortTotal =(short) (1000 + 10 * (ByteNumber + ShortNumber + IntegerNumber)); //değişkenlerin aritmetik
        // işlemlerinde değer int türüne çevrilir. Bu yüzden tip ataması gerçekleştirilmelidir.

        short TotalShort = (short) (10 * ByteNumber);

        System.out.println(LongNumber);
        System.out.println(LongNumber1);

        byte ByteNumber5 = 10;
        short ShortNumber5 = 20;

        byte ByteNumber1 = (byte) ShortNumber5;
        short ShortNumber1 = ByteNumber5;

    }
}
