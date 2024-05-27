package D_OOP_Inheritance.StaticAndInstance;

public class DogStatic {
    private static String name;

    public DogStatic(String name) {
        DogStatic.name = name;  //static alanlara Class ismiyle erişebiliyoruz.
    }

    public void printName(){
        System.out.println("name = " + name);
    }

    public static void bark(){
        System.out.println("dogs barking");
    }
}

