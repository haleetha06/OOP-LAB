import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename to count words: ");
        String fileName = scanner.nextLine();

        int wordCount = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                fileScanner.next();
                wordCount++;
            }

            fileScanner.close();
            System.out.println("Total words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        scanner.close();
    }
}
