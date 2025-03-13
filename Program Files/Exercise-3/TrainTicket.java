import java.util.Scanner;
public class TrainTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Train Type:\n1. AC First Class ($100)\n2. Sleeper ($50)\n3. General ($20)");
        int choice = sc.nextInt();
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        double cost = switch (choice) {
            case 1 -> tickets * 100;
            case 2 -> tickets * 50;
            case 3 -> tickets * 20;
            default -> 0;
        };
        if (cost == 0) System.out.println("Invalid choice!");
        else System.out.println("Total Cost: $" + cost);
    }
}
