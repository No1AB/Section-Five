public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
     
        int dice1 = rollDice();
        int dice2 = rollDice();
        System.out.println("\nDice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("\nDice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }

        System.out.println("\nYou rolled doubles! Great Success!!!.");
    }


    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}





