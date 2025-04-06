import java.util.Scanner;

class FoodOrder {

    
    void orderFood(String item) {
        System.out.println("Order placed: " + item);
        System.out.println("Total cost: $10");
    }

    
    void orderFood(String item, int quantity) {
        int cost = 10 * quantity;
        System.out.println("Order placed: " + quantity + " x " + item);
        System.out.println("Total cost: $" + cost);
    }

    
    void orderFood(String item, int quantity, String instructions) {
        int cost = 10 * quantity;
        System.out.println("Order placed: " + quantity + " x " + item);
        System.out.println("Special instructions: " + instructions);
        System.out.println("Total cost: $" + cost);
    }

   
    void orderFood(String item, int quantity, String instructions, double discount) {
        int cost = 10 * quantity;
        double finalCost = cost - (cost * (discount / 100));
        System.out.println("Order placed: " + quantity + " x " + item);
        System.out.println("Special instructions: " + instructions);
        System.out.println("Total cost before discount: $" + cost);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Final cost: $" + finalCost);
    }
}

public class method_overloading2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        System.out.print("Enter food item: ");
        String item = scanner.nextLine();

        System.out.println("Choose ordering option:");
        System.out.println("1. Order 1 item");
        System.out.println("2. Order multiple items");
        System.out.println("3. Order with special instructions");
        System.out.println("4. Order with special instructions & discount");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                order.orderFood(item);
                break;

            case 2:
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                order.orderFood(item, quantity);
                break;

            case 3:
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter special instructions: ");
                String instructions = scanner.nextLine();
                order.orderFood(item, quantity, instructions);
                break;

            case 4:
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter special instructions: ");
                instructions = scanner.nextLine();
                System.out.print("Enter discount percentage: ");
                double discount = scanner.nextDouble();
                order.orderFood(item, quantity, instructions, discount);
                break;

            default:
                System.out.println("Invalid option! Please try again.");
        }

        scanner.close();
    }
}
