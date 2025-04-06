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

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    
    double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

   
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class hybrid_inheritance1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(4);
        Cylinder cylinder = new Cylinder(7, 10);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Surface Area of Cylinder: " + cylinder.area());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
    }
}