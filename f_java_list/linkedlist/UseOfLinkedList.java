package f_java_list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class UseOfLinkedList {
    public static void main(String[] args) {
//        LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();
        placeToVisit.add("İstanbul");
        placeToVisit.add(0,"Ankara");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
//        removeElements(placeToVisit);
//        gettingElements(placeToVisit);

//        printTravel(placeToVisit);
//        printTravel2(placeToVisit);
//        printTravel3(placeToVisit);
//        System.out.println("----------------------");
//        testIterator(placeToVisit);
        testListIterator(placeToVisit);



    }
    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Adana"); //listeinin başına eleman ekledik
        list.addLast("Erzurum"); //listeinin sonuna eleman ekledik

        //Queue metotları
        list.offer("Ardahan"); //listeinin sonuna eleman ekler
        list.offerFirst("İzmir");
        list.offerLast("Konya");

        //Stack metotları
        list.push("Antalya"); //listeinin başına eleman ekledik

    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(3);
        list.remove("Erzurum");
        String s1 = list.remove(); //listeinin başındaki elemanı kaldırır. ve kaldırdığı elemanı döndürür
        System.out.println(s1 + " is removed");
        System.out.println(list);

        String s2 = list.removeFirst(); //listeinin başındaki elemanı kaldırır ve döndürür
        System.out.println(s2 + " is removed");
        System.out.println(list);

        String s3 = list.removeLast(); //listeinin sonundaki elemanı kaldırır ve döndürür
        System.out.println(s3 + " is removed");
        System.out.println(list);

        //Queue - Dequeue poll metotları
        String p1 = list.poll(); //ilk elemanı kaldırır ve döndürür
        System.out.println(p1 + " is removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " is removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " is removed");

        list.push("Çanakkale");
        list.push("Diyarbakır");
        list.push("Van");

        System.out.println(list);

        String p4 = list.pop(); //ilk elemanı kaldırır ve döndürür
        System.out.println(p4 + " is removed");

        System.out.println(list);
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());
        System.out.println("Erzurum position = " + list.indexOf("Erzurum"));
        System.out.println("Ankara lastIndexOf position = " + list.lastIndexOf("Ankara"));

        //Queue ile eleman alma
        System.out.println("element() ile alınan eleman = " + list.element()); //ilk elemanı döndürür. Queue

        //Stack ile eleman alma
        System.out.println("peek() ile alınan eleman = " + list.peek()); //ilk elemanı döndürür. Stack
        System.out.println("peekFirst() ile alınan eleman = " + list.peekFirst()); //ilk eleman
        System.out.println("peekLast() ile alınan eleman = " + list.peekLast()); //son eleman

    }

    public static void printTravel(LinkedList<String> list) {
        System.out.println("Trip starts at = " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("---> From: " + list.get(i-1) + " to: " + list.get(i));
        }
        System.out.println("Trip ends at = " + list.getLast());
    }

    public static void printTravel2(LinkedList<String> list) {
        System.out.println("Trip starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        for (String city: list) {
            System.out.println("--> From: " + city + " to: " + previousTown);
            previousTown = city;
        }
        System.out.println("Trip ends at = " + list.getLast());
    }

    public static void printTravel3(LinkedList<String> list) {
        System.out.println("Trip starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1); //list iterator 1. indeksten başlar
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to: " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at = " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {
        var iter = list.iterator();
        while(iter.hasNext()){
//            System.out.println(iter.next());
            if(iter.next().equals("Ankara")){ //next() metodu nerede kullanılırsa kullanılsın iter'i ilerletir.
                iter.remove();
//                list.remove(); //listemiz üzerinde bir iterator işlem yapıyorsa ve doğrudan list.remove() ile
//                kaldırma işlemi yaparsak hata verir.
            }
        }
        System.out.println(list);
    }

    public static void testListIterator(LinkedList<String> list) {
        var iter = list.listIterator();
        while(iter.hasNext()){
            if(iter.next().equals("Ankara")){
                iter.add("Bolu"); //listIterator ile hem ileri ve geriye doğru gezebilir hem de listemizi manipüle
                // edebiliriz.
            }
        } //while içinde hasNext() kullandığımız için listenin sonuna vardık bundan sonra previous kullanıp geriden
        // başlayarak başa doğru gidebiliriz.
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
        System.out.println(list);
    }
}
//listIterator imleci her zaman elemanların arasında olur. üzerinde olmaz. mesela başlangıçta listenin başını
// göstermez. listen başındaki elemanın önünde durur. next() dersek: 1. elemanı döndürür ve 1. ve 2. elemanların
// arasına girer.
// bir daha next dersek: 2. elemanı döndürür ve 2. ve 3. elemanların arasına girer.
// previous dersek: 2. elemanı döndürür ve bir önceki konumu olan 1. ve 2. elemanların arasına girer.

//Özellik	        Iterator	            ListIterator
//Kullanım Alanı	Tüm koleksiyonlar	    Sadece List'ler
//İterasyon Yönü	Sadece ileri	        İleri ve geri
//Eleman Kaldırma	Evet (remove())	        Evet (remove())
//Eleman Ekleme	    Hayır	                Evet (add())
//Eleman Güncelleme	Hayır	                Evet (set())
//Başlangıç Konumu	Koleksiyonun başı	    Herhangi bir konum(default: başından)
//İndeks Bilgisi	Hayır	                Evet (nextIndex(), previousIndex())