package D_OOP_Inheritance.DistancePointsChallenge;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(4,6);
        Point second = new Point(2,8);

        Point1 first1 = new Point1 (4,6);
        Point1 second1 = new Point1 (2,8);

        System.out.println(first.distance());
        System.out.println(first.distance(3,5));
        System.out.println(first.distance(second));
        System.out.println("------------------------------------------------------");
        System.out.println(first1.distance());
        System.out.println(first1.distance(3,5));
        System.out.println(first1.distance(second1));

    }
}
