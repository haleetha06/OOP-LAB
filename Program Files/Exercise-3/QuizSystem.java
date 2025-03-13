import java.util.Scanner;
public class QuizSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0, choice;
        
        do {
            System.out.println("\nWhat is the capital of France?");
            System.out.println("1. Berlin  2. Madrid  3. Paris  4. Rome");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is Paris.");
            }

            System.out.print("Do you want to play again? (1. Yes / 2. No): ");
        } while (sc.nextInt() == 1);

        System.out.println("Final Score: " + score);
    }
}
