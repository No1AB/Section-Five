import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("Choose a number to count by:");
        int no1 = scan.nextInt();
        System.out.print("Pick a number to count from:");
        int no2 = scan.nextInt();
        System.out.print("Pick a number to count to:");
        int no3 = scan.nextInt();
       // See detailed instructions on Learn the Part.

        for (int i = no2; i <= no3; i += no1) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
