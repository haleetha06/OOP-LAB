import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Age must be a number.");
        }

        scanner.close();
    }
}
