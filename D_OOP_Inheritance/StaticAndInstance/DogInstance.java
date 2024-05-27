package D_OOP_Inheritance.StaticAndInstance;

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
