package c_control_flow;

public class B_SwitchChallenge {
    public static void main(String[] args) {
        int numberOfDay = 7;
        printDayOfWeek(numberOfDay);
        printDayOfWeek1(numberOfDay);
    }
    public static void printDayOfWeek(int dayNumber){
        String dayOfTheWeek = switch (dayNumber){
            case 0 -> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> {
                String badResponse = dayNumber + " is not between 0 and 6";
                yield badResponse;
            }
        };

        System.out.println(dayOfTheWeek);
    }
    public static void printDayOfWeek1(int dayNumber){
        String dayOfWeek = "Invalid Day";
        if(dayNumber == 0) dayOfWeek = "sunday";
        else if (dayNumber == 1) dayOfWeek = "monday";
        else if (dayNumber == 2) dayOfWeek = "tuesday";
        else if (dayNumber == 3) dayOfWeek = "wednesday";
        else if (dayNumber == 4) dayOfWeek = "thursday";
        else if (dayNumber == 5) dayOfWeek = "friday";
        else if (dayNumber == 6) dayOfWeek = "saturday";

        System.out.println(dayOfWeek);
    }
}
