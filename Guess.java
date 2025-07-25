import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.println("I chose a number between 1 and 5. Try to guess it: ");
       System.out.println("Enter a no. between 1 - 5:");
           
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
       
        while (number != (4) ) {
            System.out.println("Nope, try again.");
           number = scan.nextInt();
        }
       
        System.out.println("Well Done!");

        scan.close();
    }

}
