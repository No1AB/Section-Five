public class WhileLoopExamples {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TODO: Write a while loop that simulates rolling a dice until a 6 is rolled

        int diceRoll = 999; //value here is moot/ Solely just to create the variable
        while (diceRoll != 6) {
            diceRoll = rollDice();

        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TODO: Write a while loop that generates random numbers between 1 and 100 until a number greater than 90 is generated

        int randomNumber = 0;
        while (randomNumber < 90) {
            randomNumber = generateRandomNumber();

        }

        // Example 3: Keep doubling a random number until it's greater than 1000
        // TODO: Write a while loop that keeps doubling the 'number' variable until it's greater than 1000

        int thousand = generateRandomNumber();
        while (thousand < 1000) {
         thousand = thousand * 2;

            System.out.println(thousand);
        }
        
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
