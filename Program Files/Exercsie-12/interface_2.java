import java.util.Scanner;

interface Shape {
    double area();
   
    default void printArea() {
        
    }
}

class Circle implements Shape {
    private double radius;
   
    public Circle(double radius) {
        this.radius = radius;
    }
   
   
    public double area() {
        return Math.PI * radius * radius;
    }
   
   
    public void printArea() {
        System.out.println("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + area());
    }
}

class Rectangle implements Shape {
    private double length, width;
   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
   
   
    public double area() {
        return length * width;
    }

    
    public void printArea() {
        System.out.println("Enter the length and width of the rectangle: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextDouble();
        width = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + area());
    }
}

public class interface_2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5); 
        Shape rect = new Rectangle(4, 6); 
       
        circle.printArea(); 
        rect.printArea();  
    }
}
