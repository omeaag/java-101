package D_OOP_Inheritance.StringComparisonMethods;

public class StringComparison {
    public static void main(String[] args) {

        String helloWorld = "Hello World";
        String helloWorldLower = helloWorld.toLowerCase();

        System.out.println("Hello World - hello world <-> equals: "+helloWorld.equals(helloWorldLower)); //false -
        // harflerin büyük küçüklüğü de
        // aynı olamlıdır
        System.out.println("Hello World - hello world <-> equalsIgnoreCase: "+helloWorld.equalsIgnoreCase(helloWorldLower));
        //true - harflerin büyük küçük olmasını
        // ihmal ederek karşılaştırma yapar.
        System.out.println("--------------------------------------------------");
        System.out.println("Hello World - startsWith <-> hello: " + helloWorld.startsWith("hello")); //false
        System.out.println("Hello World - startsWith <-> Hello: " +helloWorld.startsWith("Hello")); //true
        System.out.println("--------------------------------------------------");
        System.out.println("Hello World - endsWith <-> World: " +helloWorld.endsWith("World")); // true
        System.out.println("Hello World - endsWith <-> world: " +helloWorld.endsWith("world")); // false
        System.out.println("-------------------------------------------------");
        System.out.println("Hello World - contains <-> world: " +helloWorld.contains("world")); // false
        System.out.println("Hello World - contains <-> World: " +helloWorld.contains("World")); // true
        System.out.println("-------------------------------------------------");
        System.out.println("Hello World - contentEquals <-> Hello World: " +helloWorld.contentEquals("Hello World")); // true
        System.out.println("Hello World - contentEquals <-> hello world: " +helloWorld.contentEquals("hello world")); // false
        //contentEquals sadece string ögeleri karşılaştırmaz. bu yönüyle equals'tan farklıdır.






    }
}
