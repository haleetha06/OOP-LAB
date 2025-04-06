import java.util.Scanner;
class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void displayDetails(){
        System.out.print("The name is "+name+",  the age is "+age);
    }


}

class employee extends person{
    int employeeId;

    employee(String name,int age,int employeeId){
        super(name, age);
        this.employeeId=employeeId;
    }
    
    void displayDetails(){
        super.displayDetails();
        System.out.println(", the employee id is "+employeeId);
    }

}

class manager extends employee{
    String department;

    manager(String name,int age,int employeeId,String department){
        super(name, age, employeeId);
        this.department=department;

    }
    
    void displayDetails(){
        super.displayDetails();
        System.out.println(", the department is "+department);

}
}

public class multilevel_inheritance1{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter whether employee or manager:");
    String people=scan.nextLine();


    if(people.equalsIgnoreCase("employee")){
        System.out.println("enter employee name");
        String name=scan.nextLine();
        System.out.println("enter employee age");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("enter employee ID");
        int employeeId=scan.nextInt();
        scan.nextLine();
        employee obj1=new employee(name,age,employeeId);
        obj1.displayDetails();
    }
    else if(people.equalsIgnoreCase("manager")){
        System.out.println("enter manager name");
        String name=scan.nextLine();
        System.out.println("enter manager age");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("enter manager ID");
        int employeeId=scan.nextInt();
        scan.nextLine();
        System.out.println("enter manager department");
        String department=scan.nextLine();
        manager obj2=new manager(name,age,employeeId,department);
        obj2.displayDetails();
    }
    else{
        System.out.println("Invalid input. Please enter 'employee' or 'manager'.");
    }
    scan.close();

    }
}

