package D_OOP_Inheritance.Inheritance;

public class Main extends Object {
    public static void main(String[] args) {
        Animal shark = new Animal("shark", "büyük",400);
        doAnimalStuff(shark,"fast");

        Dog cobankopegi = new Dog("golden",13);
        doAnimalStuff(cobankopegi,"slow");

        Dog pitbull = new Dog("pitbull", 36,"kısa","solid");
        doAnimalStuff(pitbull,"very fast");

        Student omer = new Student("ömer");



    }

    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }

}
