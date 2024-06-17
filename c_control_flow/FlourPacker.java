package c_control_flow;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(3,5,12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if(bigCount<0 || smallCount<0){
//            return false;
//        }
//        int sum = 0;
//
//        while(bigCount != 0){
//            if(sum + 5 > goal){
//                break;
//            }
//            sum += 5;
//            bigCount--;
//        }
//        while(smallCount != 0){
//            if(sum + 1 > goal){
//                break;
//            }
//            sum += 1;
//            smallCount--;
//        }
//        return sum == goal;
// -----------------------------------------------
//        if(bigCount<0 || smallCount<0){
//            return false;
//        }
//        while(goal>=5 && bigCount>0){
//            goal -= 5;
//            bigCount--;
//        }
//        while(goal>0 && smallCount>0){
//            goal -= 1;
//            smallCount--;
//        }
//        return goal == 0;

//------------------------------------------------
//        if(bigCount<0 || smallCount<0){
//            return false;
//        }
//        while(goal>=5 && bigCount>0){
//            goal -= 5;
//            bigCount--;
//        }
//        return goal <= smallCount;
//------------------------------------------------
//        if(goal >= 0){
//            if(bigCount*5 + smallCount >= goal){ //arz ve talep doğruluğu
//                return goal%5 <= smallCount;
//            }
//        }
//        return false;
//------------------------------------------------
//        return goal>=0 && bigCount*5 + smallCount >= goal && goal%5 <= smallCount;
//------------------------------------------------
//        if (goal < 0) {
//            return false;
//        }
//        int smallNeeded = goal/5 <= bigCount ? goal%5 : goal - bigCount*5;
//        return smallNeeded <= smallCount;
//--------------------------------------------------
//        if(goal >= 0){
//            int bigUsed = Math.min(bigCount, goal/5);
//            int smallUsed = Math.min(smallCount, goal - (bigUsed*5));
//            return (bigUsed*5 + smallUsed) == goal;
//        }
//        return false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return goal == 0 || canPack(bigCount-1, smallCount, goal-5) || canPack(0,
                smallCount-1, goal-1);
    }
}
