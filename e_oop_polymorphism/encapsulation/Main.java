package e_oop_polymorphism.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "omer";
//        player.health = 100;
//        player.weapon = "UZI";
//        player.extraHealth(10000);
//        player.health= 35788325;
//        player.weapon="sdşlgskşdg";
//        player.name="agubugugugbugu";
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("omer");
        System.out.println("health is " + enhancedPlayer.healthRemaining());
        enhancedPlayer.extraHealth(10000);
        System.out.println("health is " + enhancedPlayer.healthRemaining());

        EnhancedPlayer enhancedPlayer1 = new EnhancedPlayer("cabbar",200,"sword");
        System.out.println("health is " + enhancedPlayer1.healthRemaining());
    }
}
