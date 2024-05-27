package D_OOP_Inheritance.ConstructorGetter;

public class Employee extends Person{
    private String position;

    public Employee(String name, String position) {
        super(name);  // Person constructor'ı setName'i çağırır
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    @Override
    public String getName(){
        return super.getName() + ", position = (" + position+")";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("Employee Class'ı set metodu çalıştı. name = " + name + " position = " + position);
    }
}
