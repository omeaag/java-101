package a_starting_java;

public class StringClass {

    public static void main(String[] args) {

        String myString = "Merhaba";
        int myInt = 45;
        int numb = 64;

        String total = myString + myInt + numb; //total = Merhaba4564 olur.
        System.out.println(total);
        // String değer ile başka herhangi bir tipteki değer toplanmak isterse sonuç string olarak birleşimi olacaktır.

        // Java’da Stringlerin değişmezliği (String immutability), bir kez oluşturulan bir String nesnesinin değerinin
        // değiştirilemeyeceği anlamına gelir. Yani, bir String nesnesi oluşturduğunuzda, bu nesnenin değeri bellekte sabit kalır.
        // yani şu demektir: biz bir string değeri taşıyan bir değişken oluşturduk ve bu string değeri üzerinde
        // değişiklikler yaptığımızda bu değişiklik orijinal string üzerinde olmuyor. hafızada yeni bir string
        // yaratıyoruz bu string değeri değişiklik yaptığımız string değerinin son halidir ve değişkenimiz artık bu
        // stringin adresini referans gösterir. ilk string değeri ise başka bir değişkenle tutuluyor ve hafızadan
        // zamanla siliniyor. garbage collector.
        // İşte bir örnek:
        //String str1 = "Merhaba";
        //str1 = str1 + ", Dünya!";

        // Bu kodda, str1 adlı bir String nesnesi oluşturduk ve “Merhaba” değerini atadık.
        // Daha sonra str1’i “Merhaba, Dünya!” değerine dönüştürdük. Ancak, aslında ne oldu?
        // Java’da Stringler değişmez olduğu için, str1’in değerini değiştiremiyoruz.
        // Bunun yerine, “Merhaba, Dünya!” değerine sahip yeni bir String nesnesi oluşturulur ve str1 bu yeni nesneye yönlendirilir.
        // İlk “Merhaba” değerine sahip String nesnesi artık kullanılmadığı için Java’nın Garbage Collector tarafından temizlenebilir.
    }
}
