import java.util.Scanner;

class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks entered.");
        }
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }
}

public class encapsulation_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student marks: ");
        int m = sc.nextInt();
        s.setMarks(m);

        System.out.println("Grade: " + s.getGrade());
        sc.close();
    }
}

