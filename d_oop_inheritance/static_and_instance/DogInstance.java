package d_oop_inheritance.static_and_instance;

public class DogInstance {

    private String name;

    public DogInstance(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }

    public void barkWithName(){
        System.out.println(name + " barking");
    }
}
