package C_ControlFlow;

public class ForStatementChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for(int loopVariable = 1; loopVariable <= 1000; loopVariable++){
            if(loopVariable%3 == 0 && loopVariable%5 ==0){
                System.out.println(loopVariable + " is can divide both 3 and 5");
                sum += loopVariable;
                count ++;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("total sum value is " + sum);
    }
}
