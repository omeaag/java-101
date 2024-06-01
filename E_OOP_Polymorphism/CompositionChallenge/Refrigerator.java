package E_OOP_Polymorphism.CompositionChallenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("sütünüz hazır");
            hasWorkToDo = false;
        }
    }
}
