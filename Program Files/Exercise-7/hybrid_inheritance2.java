import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class CollegeStudent extends Student {
    String collegeName;

    CollegeStudent(String name, int age, int rollNumber, String collegeName) {
        super(name, age, rollNumber);
        this.collegeName = collegeName;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("College Name: " + collegeName);
    }
}

public class hybrid_inheritance2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("student or employee?");
        String person=scan.nextLine();
    if(person.equalsIgnoreCase("student")){
         CollegeStudent collegeStudent = new CollegeStudent("Haleetha", 19, 157, "Amrita Vishwa Vidyapeetham");
         System.out.println("College Student Details:");
         collegeStudent.displayDetails();
        }
    else if(person.equalsIgnoreCase("employee")){
         Employee employee = new Employee("Abu", 50, 807);
         System.out.println("Employee Details:");
         employee.displayDetails();
        }
    else{
        System.out.println("invalid input. Please enter 'employee' or 'student'.");
    }
        scan.close();
    }
}