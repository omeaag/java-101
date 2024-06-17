package d_oop_inheritance.static_and_instance;

public class Main{
    public static void main(String[] args) {

        System.out.println("----------------------STATIC VARIABLE AND METHODS------------------------");
        //static alanlar class üzerinde oluşturulan tüm nesneler için ortak değerde olur.
        DogStatic max = new DogStatic("max");
        DogStatic birthy = new DogStatic("birthy");

        max.printName(); //birthy
        birthy.printName(); //birthy
        DogStatic.bark(); //static metotların sınıf ismi ile çağrılması önerilir.

        System.out.println("----------------------INSTANCE VARIABLE AND METHODS------------------------");
        //instance variable'lar oluşturulan her nesne için hafızada farklı alanları temsil ederler,yani her nesne
        // için özeldir. oluşturuldukları nesnelerin durumunu temsil ederler.
        DogInstance mery = new DogInstance("mery");
        DogInstance nex = new DogInstance("nex");

        mery.printName(); //mery
        nex.printName(); //nex
        mery.barkWithName(); //mery barking
        nex.barkWithName(); //nex barking


        printHello(); //zaten Main classı içinde oluşturulan bir statik metot old. için Main.printHello(); yazmaya
        // gerek yoktur. çünkü zaten Main içindeyiz.
        Main sybye = new Main();
        sybye.sayBy();
    }

    public static void printHello(){
        System.out.println("hellooo");
    }

    public void sayBy(){
        System.out.println("byebyeee");
    }
}
