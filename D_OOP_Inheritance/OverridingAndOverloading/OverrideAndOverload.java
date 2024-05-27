package D_OOP_Inheritance.OverridingAndOverloading;

public class OverrideAndOverload {

}

class DogOverload{
    public void bark(){
        System.out.println("Hav!");
    }

    public void bark(int number){ //overload metodu farklı imza ile tanımladık
        for(int i = 0; i<number;i++){
            System.out.println("Hav!");
        }
    }
}

class DogOverride{
    public void bark(){
        System.out.println("Hav!");
    }
}

class GoldenDog extends DogOverride {
    @Override
    public void bark() { //override için aynız imza gereklidir.
        System.out.println("Woof! Woof! Woof!");
    }
}
