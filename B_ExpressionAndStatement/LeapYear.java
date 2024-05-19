package B_ExpressionAndStatement;

public class LeapYear {
    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9999){
            return false;
        }

        if(year % 4 == 0 && year % 100 != 0){
            return true;
        }

        if(year % 100 == 0 && year % 400 == 0){
            return true;
        }

        return false;

    }

    public static boolean isLeapYear1(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
        //Bu durumda, && (ve) operatörü || (veya) operatöründen daha önceliklidir.
    }

    public static boolean isLeapYear2(int year) {
        return year >= 1 && year <= 9999 && (year%4 == 0 && year%100 != 0 || year%400 == 0);
    }
}
