import java.util.Scanner;
public class SalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble(), tax, netSalary;

        if (salary <= 30000) tax = salary * 0.05;
        else if (salary <= 50000) tax = salary * 0.10;
        else tax = salary * 0.20;

        netSalary = salary - tax;
        System.out.println("Gross Salary: $" + salary);
        System.out.println("Tax Deducted: $" + tax);
        System.out.println("Net Salary: $" + netSalary);
    }
}
