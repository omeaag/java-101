package b_expression_and_statement;

public class MethodChallenge {
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println( playerName +" managed to get into position "+ playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500) {
            position = 2;
        }
        else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static void main(String[] args) {
        displayHighScorePosition("daniel", calculateHighScorePosition(1500));
        displayHighScorePosition("mert", calculateHighScorePosition(1000));
        displayHighScorePosition("seda", calculateHighScorePosition(500));
        displayHighScorePosition("hande", calculateHighScorePosition(100));
        displayHighScorePosition("eren", calculateHighScorePosition(25));
    }
}
