package D_OOP_Inheritance;

public class NewClass {
    private String name;

    public NewClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewClass'{' name= " + name + " '}'";
    }
}
