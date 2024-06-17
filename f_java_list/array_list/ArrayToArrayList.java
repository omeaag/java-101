package f_java_list.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        System.out.println("Array: " + Arrays.toString(originalArray)); //Array: [First, Second, Third]
        System.out.println("List:  " + originalList);                   //List:  [First, Second, Third]
        originalList.set(0,"one");
        System.out.println("Array: " + Arrays.toString(originalArray)); //Array: [one, Second, Third]
        System.out.println("List:  " + originalList);                   //List:  [one, Second, Third]

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray)); //Array: [Second, Third, one]
        System.out.println("List:  " + originalList);                   //Array: [Second, Third, one]


        var listOne = List.of("Sunday", "Monday", "Tuesday", "Wednesday");
//        listOne.set(0,"pazartesi");//immutable list
        System.out.println(listOne);


        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday"};
        List<String> list = List.of(days);
//        list.remove(0);//immutable list
//        list.set(0,"pazt");//immutable list
        System.out.println(list);

        //ArrayList to Array
        ArrayList<String> newList = new ArrayList<>(List.of("one", "two", "three"));
        String[] newArray = newList.toArray(new String[0]); //burada (new String[0]) oluşturduğumuz dizinin boyutu
        // listenin boyutundan azdır ancak yine de listedeki elemanlar kadar bir array oluşturacaktır. toArray.

        System.out.println(Arrays.toString(newArray));//[one, two, three]
    }
}
