package f_java_list.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "orange", "bananas","eggs","milk"}; //String arrayi oluşturduk

        List<String> list = List.of(items); //String array'i String List'e dönüştürdük.

        System.out.println(list);
        System.out.println(list.getClass().getName()); //java.util.ImmutableCollections$ListN
        //list.add("yogurt"); //List.of(...) metodu immutable -değiştirilemez- bir liste döndürür. bundan dolayı artık
        // listemize eleman eklemeyez, çıkaramaz ve mevcut elemanları değiştiremeyiz. bu sebeple bu kod satırı
        // UnsupportedOperationException hatasına neden olur.

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of( "kola","tahin","pirinç")); //List.of() metodundan gelen listeyi ArrayList'e çevirdik.

        System.out.println(nextList);
        nextList.add("çikolata");
        System.out.println(nextList);

        groceries.addAll(nextList); //iki arraylist öğelerinin tamamını birleştirdik.
        System.out.println(groceries);

        System.out.println("Third item in ArrayList: " + groceries.get(2)); //indekse göre eleman çağırma

        if(groceries.contains("yogurt")){ //contains metodu liste içinde arama yapar ve boolean değer döndürür
            System.out.println("List contains yogurt");
        }

        groceries.add("yogurt");
        System.out.println("first yogurt index: " + groceries.indexOf("yogurt"));
        System.out.println("last yogurt index: " + groceries.lastIndexOf("yogurt"));

        System.out.println("-------------------------------------");

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt"); //liste başından itibaren eşleşen ilk elemanı siler
        System.out.println(groceries);

        groceries.removeAll(List.of("bananas","kola","çikolata"));//liste şeklinde belitilen elemanların tamamını
        // listeden kaldırır
        System.out.println(groceries);

        groceries.retainAll(List.of("eggs","ekmek","tahin","yogurt")); //retainAll yöntemi yalnızca listede
        // belirtilen elemanları listede tutar diğerleri yok olur. "ekmek" ögesi önceki listede bulunmadığı
        // için yeni listede de bulunmaz
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty: " + groceries.isEmpty());

        groceries.addAll(List.of("milk","ham","pickless","eggs"));
        groceries.addAll(Arrays.asList("apples","mustard","cheese","mustard"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder()); //sort(Comparator.naturalOrder()); metodu listede doğal sıralama
        // yaparak listeyi düzenler. String list ise alfabetik sıralar, number list ise küçükten büyüğe sıralar.
        // Comparator interfaces'i elemanların biribriyle karşılaştırılmasını sağlar.
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder()); //tersine doğal sıralama yapar. büyükten küçüğe ve Z-A'ya
        System.out.println(groceries);

        System.out.println("-------------------------grocerieArray-----------------------");

        var grocerieArray = groceries.toArray(new String[groceries.size()]); //ArrayList'i array'e dönüştürdük.
        // Listeler yerine dizileri kabul eden metotlarda list to array dönüşümü için kullanılabilir.
        System.out.println(Arrays.toString(grocerieArray));
    }
}
