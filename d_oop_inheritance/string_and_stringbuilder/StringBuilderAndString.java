package d_oop_inheritance.string_and_stringbuilder;

public class StringBuilderAndString {
    public static void main(String[] args) {
        String stringText = "Hello" + " World";
        stringText.concat(" and Goodbye"); //hafızada stringText değişkeninde tutulan değer değişmez. onun yerine
        // hafızada geçici yeni bir string nesnesi oluşturulur.
        // eğer stringText değerinin değişmesini istiyorsak atama operatörünü kullanmak gerekir.

        StringBuilder stringBuilder = new StringBuilder("Hello" + " World");
        stringBuilder.append(" and Goodbye"); //hafızada stringBuilder değişkenininde tutulan değeri değiştirir.

        printInformation(stringText);
        printInformation(stringBuilder);

        System.out.println("-----------------------------------------------------------------");

        StringBuilder emptyString = new StringBuilder();
        StringBuilder emptyString32 = new StringBuilder(32);

        printInformation(emptyString); //capacity -> 16
        printInformation(emptyString32); //capacity -> 32

        emptyString.append("a".repeat(17));
        emptyString32.append("a".repeat(17));

        printInformation(emptyString); //capacity -> 34
        printInformation(emptyString32); //capacity -> 32

        System.out.println("-----------------------------------------------------------------");
        StringBuilder stringBuilderPlus = new StringBuilder("Hello" + " World");
        stringBuilderPlus.append(" and Goodbye"); //stringBuilderPlus = Hello World and Goodbye
        stringBuilderPlus.deleteCharAt(16).insert(16,"g");
        System.out.println(stringBuilderPlus); //Hello World and goodbye
        stringBuilderPlus.replace(16,17,"G");
        System.out.println(stringBuilderPlus); //Hello World and Goodbye

        stringBuilderPlus.reverse().setLength(7); //ters çevirdik ve sadece 7 karaktere eşitledik. bu artık kalıcı
        // değeridir.
        System.out.println(stringBuilderPlus); //eybdooG -> stringBuilderPlus artık hafızada bu değeri tutar. kalan
        // kısımlar yok oldu.

    }


    public static void printInformation(String string){
        System.out.println("String: " + string);
        System.out.println("Length: " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String Builder: " + builder);
        System.out.println("Length: " + builder.length());
        System.out.println("Capacity: " + builder.capacity());
    }
}
