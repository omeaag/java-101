package f_java_list.autoboxing_and_unboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {

        //boxing
        Integer boxedInt = Integer.valueOf(15); //manuel boxing işlemi. int -> Integer

        //Autoboxing
        Integer boxedInteger = 15; //bu şekilde oluşturursak java arka planda otomatik halleder(Autoboxing)


        //Unboxing
        int unboxedInt = boxedInt.intValue(); //manuel unboxing. intValue metodu gereksizdir. boxedInt değişkeni bir
        // Integer örneği tutar. bu değişkeni ilkel veri tipi olan int türünden bir değişkenle eşleştirirsek JVM arka
        // planda boxedInt örneği içerisindeki int veriye unboxing işlemi yaparak bunu unboxedInt değğişkenine aktarır.

        //Autounboxing
        int unboxedInteger = boxedInteger; //boxedInteger Integer class örneği tutar ve otomatik unboxing yapılır.

        System.out.println(unboxedInt);
        System.out.println(unboxedInteger);

        Double autoboxing = getLiteralDoublePrimitive(); //primitive to object -> autoboxing
        double unboxing = getDoubleObject(); // object to primitive -> unboxing

        System.out.println(autoboxing);
        System.out.println(unboxing);

        //-------------------------------------------------------

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 20; //JVM 20 değerini array'e aktarmadan önce autoboxing yapıp Integer sınıfına sarmalar.
        System.out.println(Arrays.toString(wrapperArray));//[20, null, null, null, null]
        System.out.println(wrapperArray[0].getClass().getName()); //java.lang.Integer

        var ourList1 = getList(1,3,4,6,8);
        System.out.println(ourList1);

        var ourList2 = List.of(1, 3, 4, 6, 8); //listeye eklenen ilkel int tipindeki her eleman Integer sınıfına
        // sarmalanıp listeye eklenir. listenin her ögesi aslında bir Integer nesnesidir.
        System.out.println(ourList2.get(2).getClass().getName()); //java.lang.Integer
        System.out.println(ourList2.getClass().getName()); //java.util.ImmutableCollections$ListN



    }


    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : varargs){
            list.add(i);
        }
        return list;
    }

    public static Double getDoubleObject(){
        return Double.valueOf(120.00);
    }

    public static double getLiteralDoublePrimitive(){
        return 120.00;
    }

    public Integer getInteger(int i){
        return i; //yöntem parametresi olan int i'ye autoboxing yapılıp Integer sınıfına sarmalanır çünkü yöntemin
        // dönüş tipi Integer'dır.
    }

    public int getInteger(Integer i){
        return i; //parametre olan Integer i nesnesinin içinden int değeri alınıp (unboxing) döndürülür.
    }
}
