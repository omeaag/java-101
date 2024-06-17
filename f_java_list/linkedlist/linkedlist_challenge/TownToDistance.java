package f_java_list.linkedlist.linkedlist_challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s --> (%d)", name, distance);
    }
}

public class TownToDistance {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Place> list = new LinkedList<>();
        addPlace(list,new Place("Konya",340));
        addPlace(list,new Place("Diyarbakır",524));
        addPlace(list,new Place("Mersin",90));
        addPlace(list,new Place("İzmir",900));
        addPlace(list,new Place("Bursa",817));
        addPlace(list,new Place("Erzincan",740));
        addPlace(list,new Place("Iğdır",1060));
        list.addFirst(new Place("Adana",0));

        addPlace(list,new Place("erzincan",740));
        addPlace(list,new Place("erzincan",123));
        addPlace(list,new Place("Erzincan",740));


        menuOptions(list);

    }
    public static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)){
            System.out.println("benzer öğe var(contains): " + place);
            return;
        }
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("benzer öge var(equalsIgnoreCase): " + place);
                return;
            }
        }

        int matchIndex = 0;
        for(var listPlace: list){
            if(place.distance()<listPlace.distance()){
                list.add(matchIndex,place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
    }

    public static void printActions() {
        String text = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit:
                """;

        System.out.println(text + " ");
    }

    public static void menuOptions(LinkedList<Place> list) {
        ListIterator<Place> itr = list.listIterator();
        printActions();

        boolean quitLoop = false;
        boolean flag = true;
        while(!quitLoop){
            System.out.print("Enter Value: ");
            String input = sc.nextLine().toUpperCase().substring(0,1);

            switch (input){
                case "F":
                    System.out.println("User wants to go forward");
                    System.out.println(itr.next());
                    break;

                case "B":
                    System.out.println("User wants to go backwards");
                    System.out.println(itr.previous());
                    break;

                case "M":
                    printActions();
                    break;

                case "L":
                    System.out.println(list);
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }
    }
}
