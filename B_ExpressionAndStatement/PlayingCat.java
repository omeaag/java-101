package B_ExpressionAndStatement;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,30));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if((temperature < 25 || temperature > 35) && !summer){
            return false;
        } else return temperature >= 25 && temperature <= 45;
    }
}
