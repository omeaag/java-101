package D_OOP_Inheritance.TextBlock;

public class TextBlock {
    public static void main(String[] args) {
        String text = "Örnek liste oluşturalım: \n" +
                "\t\u2022 Birinci satır\n"+
                "\t\t\u2022 İkinci satır";

        System.out.println(text);

        String ornek = """
                Örnek Listemizi Text Block ile oluşturalım:
                    \u2022 Birinci satır
                        \u2022 İkinci satır""";

        System.out.println(ornek);

        int age = 25;
        System.out.printf("Yaşınız = %d\n",age);

        int dogumYili = 2024-age;
        System.out.printf("Doğum yılınız = %d, Yaşınız = %d",dogumYili,age);
    }
}
