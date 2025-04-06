import java.util.Scanner;

class Employee {
    private double salary;

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary.");
    }

    public double calculateBonus(String grade) {
        switch (grade.toUpperCase()) {
            case "A": return salary * 0.20;
            case "B": return salary * 0.10;
            default: return 0;
        }
    }
}

public class encapsulation_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter salary: Rs");
        double sal = sc.nextDouble();
        e.setSalary(sal);

        System.out.print("Enter performance grade (A/B): ");
        String grade = sc.next();

        double bonus = e.calculateBonus(grade);
        System.out.println("Bonus: Rs" + bonus);
        sc.close();
    }
}
