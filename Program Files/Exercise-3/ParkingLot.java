import java.util.Scanner;
public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double totalCharge = 0;

        while (true) {
            System.out.println("\n1. Car - $10\n2. Bike - $5\n3. Truck - $15\n4. Exit");
            System.out.print("Enter vehicle type: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> totalCharge += 10;
                case 2 -> totalCharge += 5;
                case 3 -> totalCharge += 15;
                case 4 -> {
                    System.out.println("Total Parking Charge: $" + totalCharge);
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}