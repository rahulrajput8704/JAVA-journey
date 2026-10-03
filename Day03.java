import java.util.Scanner;

public class Day3_InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Simple Input Output
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        // 2. Sum of two numbers
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);

        // 3. Condition check - Even/Odd
        System.out.print("Enter a number to check even/odd: ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        input.close();
    }
}