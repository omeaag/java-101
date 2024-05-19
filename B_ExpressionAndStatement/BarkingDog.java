package B_ExpressionAndStatement;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if(barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
    }
    public static boolean shouldWakeUp1 (boolean barking, int hourOfDay){

        if(!barking || hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        return hourOfDay < 8 || hourOfDay == 23;
    }



    public static boolean shouldWakeUp2(boolean barking, int hourOfDay) {
            return barking && hourOfDay >= 0 && (hourOfDay < 8 || hourOfDay == 23);
        }


    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp1(true,8));
        System.out.println(shouldWakeUp2(true,8));

    }
//boolean değer döndürmek için ternary operatör kullanma. if-else blokları kullanmak tavsiye edilir.

}
