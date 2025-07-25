import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Hello");
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("run:" + i);
            for (int j = 0; j < 3; j++)
            System.out.println(j);
            scanner.nextLine();
        }
    }
}
