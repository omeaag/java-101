package B_ExpressionAndStatement;

public class PositiveNegativeNumber {
    public static void checkNumber(int number){
        String state;

        if(number > 0){
            state = "positive";
        }
        else if(number < 0){
            state = "negative";
        }
        else{
            state = "zero";
        }
        System.out.println(state);

    }
    public static void checkNumber1(int number){
        String result = (number > 0) ? "positive" : (number < 0 ? "negative" : "zero");
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkNumber(3);
        checkNumber1(3);
    }
}
