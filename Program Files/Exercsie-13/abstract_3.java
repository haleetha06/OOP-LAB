import java.util.Scanner;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    int monthlySalary;

    FullTimeEmployee(String name, int salary) {
        super(name);
        this.monthlySalary = salary;
    }

    void calculateSalary() {
        System.out.println(name + "'s Monthly Salary: Rs " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hourlyRate, hoursWorked;

    PartTimeEmployee(String name, int rate, int hours) {
        super(name);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    void calculateSalary() {
        System.out.println(name + "'s Weekly Salary: Rs " + (hourlyRate * hoursWorked));
    }
}

public class abstract_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("\n--- Employee Salary System ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            if (choice == 1) {
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Monthly Salary: Rs ");
                int salary = sc.nextInt();
                Employee emp = new FullTimeEmployee(name, salary);
                emp.calculateSalary();
            } else if (choice == 2) {
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Hourly Rate: Rs ");
                int rate = sc.nextInt();
                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();
                Employee emp = new PartTimeEmployee(name, rate, hours);
                emp.calculateSalary();
            } else if (choice == 3) {
                continueInput = false;
                System.out.println(" Exiting Employee Salary System. Thank you!");
            } else {
                System.out.println(" Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
