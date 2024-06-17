package c_control_flow;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
        //Bu durumda, && (ve) operatörü || (veya) operatöründen daha önceliklidir.
    }

    public static int getDaysInMonth(int month, int year){

        if(month < 1 || month >12){
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

//        return switch(month){
//            case 2:
//                yield isLeapYear(year) ? 29 : 28;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                yield 30;
//
//            default:
//                yield 31;
//        };
//        return switch(month){
//            case 2:
//                yield isLeapYear(year) ? 29 : 28;
//            case 4,6,9,11:
//                yield 30;
//            default:
//                yield 31;
//        };
        return switch(month){
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4,6,9,11 -> 30;
            default -> 31;
        };
    }
}
