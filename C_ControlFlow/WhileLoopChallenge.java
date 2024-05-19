package C_ControlFlow;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int sayi = 4;
        int finishNumber = 20;

        int oddCount = 0;
        int evenCount = 0;

        while (sayi <= finishNumber){
            sayi++;

            if(!isEvenNumber(sayi)){
               oddCount++;
               continue;
            }
            System.out.println("Even number " + sayi);
            evenCount++;
            if(evenCount==5) break;
        }
        System.out.println("odd count: " + oddCount);
        System.out.println("even count: " + evenCount);
    }
    public static boolean isEvenNumber(int number){
        return number%2 == 0;
    }
}
