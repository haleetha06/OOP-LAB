class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

   
    void introduce() {
        super.introduce();
        System.out.println("My roll number is " + rollNumber + ".");
    }
}

public class single_inheritance2{
    public static void main(String[] args) {
        Student student = new Student("halitha", 19, 157);
        student.introduce();
    }
}