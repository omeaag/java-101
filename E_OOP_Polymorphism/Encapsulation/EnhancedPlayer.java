package E_OOP_Polymorphism.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"pistol");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health < 0 ? 1: (health>100) ? 100 :  health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0) {
            System.out.println("player dead");
        }
    }

    public void extraHealth(int extraHealth) {
        health += extraHealth;
        if(health>100){
            System.out.println("player restored to 100%" + health);
            health = 100;
        }
    }

    public int healthRemaining(){
        return health;
    }

}
