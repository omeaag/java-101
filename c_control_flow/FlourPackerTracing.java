package c_control_flow;

public class FlourPackerTracing {
    public static void main(String[] args) {
        System.out.println(canPack(3,5,12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return goal == 0 || canPack(bigCount-1, smallCount, goal-5) || canPack(0,
                smallCount-1, goal-1);
    }
}
