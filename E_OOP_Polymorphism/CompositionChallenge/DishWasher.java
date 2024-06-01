package E_OOP_Polymorphism.CompositionChallenge;

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
