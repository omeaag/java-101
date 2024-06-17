package f_java_list.array_list;

import java.util.*;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> grocerieList = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(grocerieList);
                case 2 -> removeItems(grocerieList);
                default -> flag = false;
            }
            grocerieList.sort(Comparator.naturalOrder());
            System.out.println(grocerieList);
        }
    }

    public static void addItems(ArrayList<String> groceries) {
        System.out.println("Enter items to add to the list: ");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String item : items) {
            String trimmed = item.trim();
            if(!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    public static void removeItems(ArrayList<String> groceries) {
        System.out.println("Enter items to remove to the list: ");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
    }

    public static void printActions(){

            String textBlock = """
                    Available actions:
                    
                    0 - to shutdown
                    
                    1 - to add item(s) to list (comma delimited list)
                    
                    2 - to remove any items (comma delimited list)
                    
                    Enter a number for which action you want to do:""";

            System.out.println(textBlock + " ");
        }

}
