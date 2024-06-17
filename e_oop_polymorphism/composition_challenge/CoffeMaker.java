package e_oop_polymorphism.composition_challenge;

public class CoffeMaker {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("kahveniz hazır");
            hasWorkToDo = false;
        }
    }
}
