import java.util.Scanner;

abstract class Vehicle {
    String brand;
    int model;

    
    Vehicle(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    
    abstract void startEngine();
    abstract double fuelEfficiency(double mpg);

    
    void display() {
        System.out.println("This is a vehicle.");
    }
}


class Car extends Vehicle {
    int passengerCapacity;
    double mpg;

    
    Car(String brand, int model, int passengerCapacity) {
        super(brand, model);
        this.passengerCapacity = passengerCapacity;
    }

    
    void startEngine() {
        System.out.println("The car is starting...");
    }

    
    double fuelEfficiency(double mpg) {
        this.mpg = mpg;
        return mpg;
    }

    
    void display() {
        startEngine();
        System.out.println("Brand: " + brand + ", Model: " + model + ", Passenger Capacity: " + passengerCapacity+", the car has a fuel efficiency of " + mpg + " MPG.");
    }
}


class Truck extends Vehicle {
    double cargoCapacity; 
    double mpg;

    
    Truck(String brand, int model, double cargoCapacity) {
        super(brand, model);
        this.cargoCapacity = cargoCapacity;
    }

    
    void startEngine() {
        System.out.println("The truck is starting...");
    }

    
    double fuelEfficiency(double mpg) {
        this.mpg = mpg;
        return mpg;
    }

    
    void display() {
        startEngine();
        System.out.println();
        System.out.println("Brand: " + brand + ", Model: " + model + ", Cargo Capacity: " + cargoCapacity + " tons"+", the truck has a fuel efficiency of " + mpg + " MPG.");
    }
}


class abstract_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter car or truck");
        String vehicleType=scan.nextLine();

        if(vehicleType.equalsIgnoreCase("car")){
            System.out.println("Enter car brand:");
            String carBrand = scan.nextLine();
            System.out.println("Enter car model year:");
            int carModel = scan.nextInt();
            System.out.println("Enter passenger capacity:");
            int passengerCapacity = scan.nextInt();
            Car car = new Car(carBrand, carModel, passengerCapacity);
            car.fuelEfficiency(30.0); 
            car.display();
        }
        else if(vehicleType.equalsIgnoreCase("truck")){
        System.out.println("\nEnter truck brand:");
        String truckBrand = scan.nextLine();
        System.out.println("Enter truck model year:");
        int truckModel = scan.nextInt();
        System.out.println("Enter cargo capacity (in tons):");
        double cargoCapacity = scan.nextDouble();
        Truck truck = new Truck(truckBrand, truckModel, cargoCapacity);
        truck.fuelEfficiency(15.0); 
        truck.display();
        }
        else{
            System.out.println("Invalid input. Please enter 'car' or 'truck'.");
        }
        scan.close();
    }
}