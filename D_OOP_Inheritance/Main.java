package D_OOP_Inheritance;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = List.of("elif", "emir", "cem", "nehir", "melike", "melek", "elif");

        System.out.println("Array -> size: " + nameList.size() + " ->" + nameList);

        TreeSet<String> treeSet = new TreeSet<>(nameList); //TreeSet -> size: 6 ->[cem, elif, emir, melek, melike, nehir]

        System.out.println("TreeSet -> size: " + treeSet.size() + " ->" + treeSet);

        HashSet<String> hashSet = new HashSet<>(nameList); //HashSet -> size: 6 ->[melek, nehir, cem, elif, melike,
        // emir]

        System.out.println("HashSet -> size: " + hashSet.size() + " ->" + hashSet);
    }
}
