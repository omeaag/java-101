package C_ControlFlow;

public class SwitchStatement {

    public static void main(String[] args) {
// int sayi = 2;
// if(sayi == 1){
//     System.out.println("sayi değeri 1");
// } else if (sayi == 2) {
//     System.out.println("sayi değeri 2");
// }else{
//     System.out.println("sayi 1 veya 2 değil");
// }


        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("sayı değeri 1");
            case 2 -> System.out.println("sayı değeri 2");
            case 3, 4, 5 -> {
                System.out.println("sayı değeri 3, 4 veya 5");
                System.out.println("sayı değeri: " + switchValue);
            }
            default -> System.out.println("sayı 1, 2, 3, 4 veya 5 değil");
        }

        switch (switchValue){
            case 1:
                System.out.println("sayı değeri 1");
                break;
            case 2:
                System.out.println("sayı değeri 2");
                break;
            case 3: case 4: case 5:
                System.out.println("sayı değeri 3, 4 veya 5");
                System.out.println("sayı değeri: " + switchValue);
                break;
            default:
                System.out.println("sayı 1, 2, 3, 4 veya 5 değil");
                break;
        }
        // switch kullanabileceğimiz veri tipleri şunlardır:
        // byte, short, int, char
        // Byte, Short, Integer, Character
        // String, enum
        String month = "february";
        System.out.println(getQuarter(month));
    }


    public static String getQuarter(String month){
        return switch (month) {
            case "january", "february", "march" -> { yield "1st";}
            case "april", "may", "june" -> "2st";
            case "july", "august", "september" -> "3st";
            case "october", "november", "december" -> "4st";
            default -> {
                String badResponse = month + " is bad";
                yield  badResponse; //yield ifadesi modern Switch kullanımı içinde süslü parantez içinde işlem
                // yapıldıktan sonra return yerine değer döndürmeyi sağlar. değer döndürüleceği zaman return
                // kullanılmaz.
            }
        };
//            switch (month){
//                case "january":
//                case "february":
//                case "march":
//                    return "1st";
//                case "april":
//                case "may":
//                case "june":
//                    return "2nd";
//                case "july":
//                case "august":
//                case "september":
//                    return "3rd";
//                case "october":
//                case "november":
//                case "december":
//                    return "4th";
//            }
//            String badResponse = month + " is bad months";
//            return badResponse;

    }
}
