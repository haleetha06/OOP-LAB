import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter filename to write: ");
            String fileName = scanner.nextLine();

            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter content to write (type 'exit' to finish):");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) break;
                writer.write(input + "\n");
            }

            writer.close();
            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        scanner.close();
    }
}

