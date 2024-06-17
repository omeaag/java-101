package e_oop_polymorphism.composition_challenge;

public class Product {
    private boolean hasWorkToDo;

    public Product() {
        this.hasWorkToDo = false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
