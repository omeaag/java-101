package E_OOP_Polymorphism.Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0) {
            System.out.println("player dead");
        }
    }

    public void extraHealth(int extraHealth) {
        health += extraHealth;
        if(health>100){
            System.out.println("player restored to 100%");
            health = 100;
        }
    }

    public int healthRemaining(){
        return health;
    }
}
