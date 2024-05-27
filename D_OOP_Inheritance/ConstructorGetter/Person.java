package D_OOP_Inheritance.ConstructorGetter;

public class Person {
    private String name;

    public Person(String name) {
        setName(name);  // Setter kullanımı
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Person Class'ı set metodu çalıştı");
        System.out.println("Person constructor: Name is " + getName());
    }

    public String getName() {
        return name;
    }
}

