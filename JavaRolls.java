import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        System.out.println("Let's play Rolling Java. Hit Return to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println("If you roll a 4, nothing happens.");
        System.out.println("Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Hit Return to roll:");
        
        int diceRoll = rollDice();
        int score = 0;

        while (true) {
            scan.nextLine();
            diceRoll = rollDice();
           System.out.println("You rolled a: " + diceRoll);
           if (diceRoll == 6) {
            System.out.println("End of game");
            System.out.println("Your score: " + score);
            break;
        } else if (diceRoll == 4) {
            System.out.println("Zero points. Keep rolling.");
        } else 
        System.out.println("One point. Keep rolling.");
        score ++;
            }  
               
            if (score >= 3) {
                System.out.println("Wow, that's lucky. You win!");
            } else {
                System.out.println("Tough luck, you lose :(");
            }
            scan.close();
    } 
  public static int rollDice() {
    return (int) (Math.random()* 6) +1;
  }

  
  
}
