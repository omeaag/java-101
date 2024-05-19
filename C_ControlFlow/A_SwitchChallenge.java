package C_ControlFlow;

public class A_SwitchChallenge {
    public static void main(String[] args) {

        char karakter = 'Y';

        switch (karakter){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;

            default:
                System.out.println("BAD");
                break;
        }
    }
}
