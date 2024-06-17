package e_oop_polymorphism.composition_challenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("bulaşıklar yıkandı");
            hasWorkToDo = false;
        }
    }
}
