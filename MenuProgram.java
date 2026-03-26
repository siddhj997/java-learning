import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Hello");
            System.out.println("2. Calculator");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            if (choice == 1) {
                HelloWorld.run();   // 👈 calls another file
            } else if (choice == 2) {
                Calculator.run();  // 👈 calls another file
            } else if (choice == 3) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}