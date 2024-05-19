package C_ControlFlow;

public class GreatestCommonDivider {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(36,9));
        System.out.println(Math.sqrt(6));
    }
    public static int getGreatestCommonDivisor(int first, int second){

//        if(first < 10 || second<10){
//            return -1;
//        }

        //int gcd = 0;
        // for(int i = 1; i<=first;i++){
        //     if(first%i == 0 && second%i == 0){
        //             gcd = i;
        //     }
        // }
        // return gcd;

        // while (first != second) {
        //     if (first > second) {
        //         first -= second;
        //     } else {
        //         second -= first;
        //     }
        // }
        // return first;

//        while (second != 0) {
//            int temp = second;
//            second = first % second;
//            first = temp;
//        }
//        return first;
        if (second == 0) {
            return first;
        } else {
            return getGreatestCommonDivisor(second, first%second);
        }
    }
}
