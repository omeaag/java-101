package b_expression_and_statement;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));


    }

    public static String getDurationString(int seconds){
        if(seconds < 0) {
            return "Invalid Seconds Value";
        }

        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainderMinutes = minutes % 60;

            return hours + "h " + remainderMinutes + "m " + seconds + "s";
        }

        return "Invalid minutes or seconds value";
        
    }
}
