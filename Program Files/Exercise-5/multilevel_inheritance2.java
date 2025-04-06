import java.util.Scanner;

class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    double area() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    double height;

    Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

   
    double area() {
        return 2 * (length * width + width * height + height * length);
    }
}

public class multilevel_inheritance2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the shape (rectangle or cuboid):");
        String shape = scan.nextLine();

        if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter length of the rectangle:");
            double length = scan.nextDouble();
            System.out.println("Enter width of the rectangle:");
            double width = scan.nextDouble();

            Rectangle obj1 = new Rectangle(length, width);
            System.out.println("The area of the rectangle is " + obj1.area());
        } else if (shape.equalsIgnoreCase("cuboid")) {
            System.out.println("Enter length of the cuboid:");
            double length = scan.nextDouble();
            System.out.println("Enter width of the cuboid:");
            double width = scan.nextDouble();
            System.out.println("Enter height of the cuboid:");
            double height = scan.nextDouble();

            Cuboid obj2 = new Cuboid(length, width, height);
            System.out.println("The total surface area of the cuboid is " + obj2.area());
        } else {
            System.out.println("Invalid input. Please enter 'rectangle' or 'cuboid'.");
        }

        scan.close();
    }
}