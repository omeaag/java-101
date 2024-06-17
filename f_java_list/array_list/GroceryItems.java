package f_java_list.array_list;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type,int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}

public class GroceryItems {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple","PRODUCED",5);
        groceryArray[2] = "5 oranges"; //Object sınıfından bir array oluşturduğumuz için derleyici hatası da almadan
        // herhangi bir nesneyi array'e atayabiliyoruz çünkü Object sınıfı tüm classların atasıdır ondan. halbuki bu
        // yanlış bir kullanımdır. Bu yüzden array oluştururken Object tipinde değil hangi tipte eleman barındırmak
        // istiyorsak o tipten oluşturmalıyız.

        System.out.println("-------------------------------------------------");

        GroceryItem[] groceryArray2 = new GroceryItem[3];
        groceryArray2[0] = new GroceryItem("milk");
        groceryArray2[1] = new GroceryItem("apple","PRODUCED",5);
        //groceryArray2[2] = "5 oranges";  //artık arraye GroceryItem tipinden farklı bir tipte değer atayamayız
        // derleyici hatası verir. çünkü arrayi GroceryItem tipinde oluşturduk. Bu bize derleme zamanında tip
        // denetimi yapılmasını da sağlar ve çalışma zamanındaki oluşabilcek hataları(exception) önler.

        for (GroceryItem item: groceryArray2) {
            System.out.println(item);
        }

        System.out.println(Arrays.toString(groceryArray2));

        System.out.println("----------------------------------------");

        //ArrayList oluştururken tip belirtmezsek <> varsayılan olarak Object tipini kullanacaktır. Bu da yukarıda
        // Object sınıfı ile array oluşturma işleminde karşılaşılan hatalara sebebiyet verecektir.
        //ArrayList'e add() metodu ile listenin sonuna eleman ekleriz
        ArrayList groceryItemsList = new ArrayList();//Bu kullanım = ArrayList <Object> groceryItemsList = new
        // ArrayList<>();
        groceryItemsList.add(new GroceryItem("butter"));
        groceryItemsList.add(new GroceryItem("cake","PRODUCED",2));
        groceryItemsList.add("yoghurt");
        System.out.println(groceryItemsList);


        System.out.println("---------------------------------------------");
        //new ArrayList oluştururken elmas operatörü <> kullanmazsak derleme zamanı tip kontrolü yapılmaz.
        ArrayList<GroceryItem> groceryItemsList2 = new ArrayList<>();

        groceryItemsList2.add(new GroceryItem("cheese"));
        groceryItemsList2.add(new GroceryItem("orange","PRODUCED",2));
        groceryItemsList2.add(new GroceryItem("apples","PRODUCED",6));
        groceryItemsList2.add(0, new GroceryItem("milk")); // istediğimiz indekse nesnemizi ekleyebiliyoruz

        System.out.println(groceryItemsList2);

        groceryItemsList2.set(0, new GroceryItem("bread")); // set metodu belirli indeksteki nesnenin değerini
        // değiştirir.

        System.out.println(groceryItemsList2);


    }
}
