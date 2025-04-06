import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class package_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter marks in English: ");
        int english = scanner.nextInt();

        double average = (math + science + english) / 3.0;

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + df.format(average));
        System.out.println("Generated on: " + LocalDate.now());

        scanner.close();
    }
}