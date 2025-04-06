import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
    
    abstract String getEmployeeType();
    
    abstract int getSalaryAmount();
}

class FullTimeEmployee extends Employee {
    int monthlySalary;

    FullTimeEmployee(String name, int salary) {
        super(name);
        this.monthlySalary = salary;
    }

    void calculateSalary() {
        System.out.println( name + "'s Monthly Salary: Rs " + monthlySalary);
    }
    
    String getEmployeeType() {
        return "Full-Time";
    }

    int getSalaryAmount() {
        return monthlySalary;
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
        int weeklySalary = hourlyRate * hoursWorked;
        System.out.println( name + "'s Weekly Salary: Rs " + weeklySalary);
    }
    
    String getEmployeeType() {
        return "Part-Time";
    }

    int getSalaryAmount() {
        return hourlyRate * hoursWorked;
    }
}

public class abstract_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Calculate Salary for All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    String ftName = sc.nextLine();
                    System.out.print("Enter Monthly Salary: Rs ");
                    int salary = sc.nextInt();
                    employees.add(new FullTimeEmployee(ftName, salary));
                    System.out.println(" Full-Time Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter Employee Name: ");
                    String ptName = sc.nextLine();
                    System.out.print("Enter Hourly Rate: Rs ");
                    int rate = sc.nextInt();
                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();
                    employees.add(new PartTimeEmployee(ptName, rate, hours));
                    System.out.println(" Part-Time Employee Added!");
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println(" No employees available.");
                    } else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee emp : employees) {
                            System.out.println(emp.name + " (" + emp.getEmployeeType() + ") " );
                        }
                    }
                    break;

                case 4:
                    if (employees.isEmpty()) {
                        System.out.println("No employees to calculate salary.");
                    } else {
                        System.out.println("\n--- Salary Details ---");
                        for (Employee emp : employees) {
                            emp.calculateSalary();
                        }
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println(" Exiting Employee Management System. Thank you!");
                    break;

                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        }
        
        sc.close();
    }
}
