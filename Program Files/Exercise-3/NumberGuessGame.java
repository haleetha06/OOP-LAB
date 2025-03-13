import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1, guess, attempts = 0;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) System.out.println("Too high! Try again.");
            else if (guess < target) System.out.println("Too low! Try again.");

        } while (guess != target);

        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
    }
}
