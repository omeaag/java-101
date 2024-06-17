package f_java_list.enum_class;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.WED;
        var weeks = DayOfTheWeek.values();
        for(int i = 0; i<10;i++){
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal = %d\n", weekDay.name(), weekDay.ordinal());
//            if(weekDay == DayOfTheWeek.WED){
//                System.out.println("Middle of the week!");
//            }
            switchDaysOfTheWeek(weekDay);
        }

        for(Topping topping : Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDaysOfTheWeek(DayOfTheWeek weekDay){
        int weekDayInt = weekDay.ordinal() + 1;
        switch(weekDay){
            case WED -> System.out.println("Wednesday is day " + weekDayInt);
            case SAT -> System.out.println("Saturday is day " + weekDayInt);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is day " + weekDayInt);
        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInt];
    }


}
