import java.util.Scanner;

public class NameLengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.trim().isEmpty()) {
                throw new NullPointerException();
            }

            System.out.println("Length of your name: " + name.length());

        } catch (NullPointerException e) {
            System.out.println("Error: Name cannot be empty.");
        }

        scanner.close();
    }
}
