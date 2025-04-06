import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class package_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter word to search: ");
        String wordToFind = scanner.nextLine();

        boolean found = false;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                if (word.equalsIgnoreCase(wordToFind)) {
                    found = true;
                    break;
                }
            }

            fileScanner.close();

            if (found) {
                System.out.println("The word \"" + wordToFind + "\" was found in the file.");
            } else {
                System.out.println("The word \"" + wordToFind + "\" was NOT found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        scanner.close();
    }
}