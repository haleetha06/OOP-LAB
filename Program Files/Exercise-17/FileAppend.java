import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter filename to append: ");
            String fileName = scanner.nextLine();

            FileWriter writer = new FileWriter(fileName, true); // true for append mode
            System.out.println("Enter text to append (type 'exit' to stop):");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) break;
                writer.write(input + "\n");
            }

            writer.close();
            System.out.println("Content appended successfully.");

        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }

        scanner.close();
    }
}
