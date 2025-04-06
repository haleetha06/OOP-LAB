import java.util.Scanner;

class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    
    double calculateSalary() {
        return monthlySalary;
    }

    void details(){
        System.out.println("Employee details: ");
        System.out.print("Name:"+name+"\n"+"Employee Id:"+employeeId+"\n"+"Salary:"+calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void details(){
        System.out.println("Employee details: ");
        System.out.print("Name:"+name+"\n"+"Employee Id:"+employeeId+"\n"+"Salary:"+calculateSalary());
    }
}

public class hierarchical_inheritance2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("fullTime or partTime employee? ");
        String employee=scan.nextLine();
    if(employee.equalsIgnoreCase("fullTime")){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Haliths", 157, 5000.0);
        fullTimeEmployee.details();
        }
    
    else if(employee.equalsIgnoreCase("partTime")){
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jyothirmai", 007, 20.0, 80);
        partTimeEmployee.details();
        }
    else{
        System.out.println("Invalid input. Please enter 'rectangle' or 'cuboid'.");
    }    
       
   scan.close();
        }
}