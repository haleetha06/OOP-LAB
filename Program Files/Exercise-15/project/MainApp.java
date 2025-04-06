package project;

import java.util.Scanner;
import project.gradesystem.GradeCalculator;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        double average = GradeCalculator.calculateAverage(marks);
        char grade = GradeCalculator.assignGrade(average);

        System.out.println("\n--- Grade Report ---");
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
