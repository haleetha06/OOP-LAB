import java.util.Scanner;

interface Result {
    void calculateResult();
}

class UGStudent implements Result {
    int marks;

    UGStudent(int m) {
        marks = m;
    }

    public void calculateResult() {
        if (marks >= 40)
            System.out.println(" UG Student Passed.");
        else
            System.out.println(" UG Student Failed.");
    }
}

class PGStudent implements Result {
    int marks;

    PGStudent(int m) {
        marks = m;
    }

    public void calculateResult() {
        if (marks >= 50)
            System.out.println(" PG Student Passed.");
        else
            System.out.println(" PG Student Failed.");
    }
}

public class interface_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.println("\n--- Student Result System ---");
            System.out.println("1. Check UG Student Result");
            System.out.println("2. Check PG Student Result");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter student's marks: ");
                int marks = sc.nextInt();

                Result student;
                if (choice == 1) {
                    student = new UGStudent(marks);
                } else {
                    student = new PGStudent(marks);
                }

                student.calculateResult();
            } else if (choice == 3) {
                continueChecking = false;
                System.out.println(" Exiting Student Result System. Thank you!");
            } else {
                System.out.println(" Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
