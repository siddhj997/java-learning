import java.util.Scanner;

public class Calculator {

    public static void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        double result;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}