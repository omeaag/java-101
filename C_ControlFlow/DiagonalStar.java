package C_ControlFlow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
            return;
        }

        for(int i = number; i>0; i--){
            System.out.println(" ");
            for(int j = number;j>0; j--){
                if(i==1 || i==number || j==1 || j==number || j==number-i+1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}