package D_OOP_Inheritance.StringComparisonMethods;

public class StringManipulationMethods {
    public static void main(String[] args) {

        String birthDate = "13/03/2009";
        int startingIndex = birthDate.indexOf("2009");

        System.out.println("------------------------------------------------------------");

        System.out.println("birthDate starting index: " + startingIndex);
        System.out.println("birthDate: " + birthDate.substring(startingIndex));

        System.out.println("Month:" + birthDate.substring(3,5));
        System.out.println("Day:" + birthDate.substring(0,2));

        System.out.println("------------------------------------------------------------");

        String newDate = String.join("/","18","12","2000"); //18/12/2000
        System.out.println(newDate);

        System.out.println("------------------------------------------------------------");

        System.out.println(newDate.replace("/","-")); //18-12-2000 - newDate değişkenine atama yapmadığımız için
        // newDate değeri hafızada hala "18/12/2000" şeklindedir.
        System.out.println(newDate); //-> 18/12/2000

        System.out.println("------------------------------------------------------------");

        newDate = newDate.replace("/","-");
        System.out.println(newDate); // newDate'e atama yaparak replace ettiğimiz için hafızada "18-12-2000"
        // şeklinde değiştirildi.

        System.out.println(newDate.replaceFirst("-","/"));
        System.out.println(newDate.replaceAll("-","///"));

        System.out.println("------------------------------------------------------------");

        String text = "Mail adresim: omer_01_can@hotmail.com";
        System.out.println(text); //Mail adresim: omer_01_can@hotmail.com
        String replacedText = text.replaceAll("(\\w+)\\_(\\w+)_(\\w+)@hotmail.com","$3$1_$2@hotmail.com");
        //replace all bu tür karmaşık değiştirmeler için kolaylık sağlar. regex(regular expression) kulanarak karmaşık
        // değişimlerde avantaj sağlar.
        System.out.println(replacedText); //Mail adresim: canomer_01@hotmail.com

        System.out.println("------------------------------------------------------------");

        String helloWorld = "Hello World";
        System.out.println(helloWorld);
        helloWorld = helloWorld.replaceAll("\\bWorld\\b","Java Champion"); //büyük küçük harf duayrlıdır. replace ile
        // de yapılabilirdi.
        System.out.println(helloWorld);
        //replace ve replaceAll metotları arasındaki fark: replaceAll regex ifadeleri kullanarak daha karmaşık
        // değiştirme işlemlerini yapmayı sağlar.

        System.out.println("------------------------------------------------------------");

        System.out.println("OMR\n".repeat(4));
        System.out.println("-".repeat(60));
        System.out.println("OMR\n".repeat(4).indent(4));//başına 4 boşluk karakteri koyduk
        System.out.println("-".repeat(60));
        System.out.println("     OMR\n".repeat(4).indent(-3)); //baştaki beş boşluk karakterinin 3ünü sildik.

    }
}
