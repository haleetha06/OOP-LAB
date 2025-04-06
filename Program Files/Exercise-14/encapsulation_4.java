import java.util.Scanner;

class Admission {
    private int age;

    public void setAge(int age) {
        if (age >= 17 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("Not eligible for admission.");
        }
    }

    public boolean isEligible() {
        return age >= 17 && age <= 25;
    }
}

public class encapsulation_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admission a = new Admission();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        a.setAge(age);

        if (a.isEligible())
            System.out.println("You are eligible for admission!");
        else
            System.out.println("Sorry, you are not eligible.");
        sc.close();
    }
}
