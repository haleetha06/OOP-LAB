import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0 to 4): ");
            int index = scanner.nextInt();

            System.out.println("Element at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        }

        scanner.close();
    }
}
