import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String input = scan.nextLine();

        for (int i = 0; i < 100; i++)
        System.out.println(i + ") " + input);

        
        // See Learn the Part for the instructions.
        
    }
}
