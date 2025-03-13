import java.util.Scanner;
public class HotelBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, qty;
        double bill = 0;

        do {
            System.out.println("\nMenu:\n1. Pizza - $8\n2. Burger - $5\n3. Coffee - $3\n4. Exit & Pay");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter quantity: ");
                qty = sc.nextInt();
                switch (choice) {
                    case 1 -> bill += qty * 8;
                    case 2 -> bill += qty * 5;
                    case 3 -> bill += qty * 3;
                }
            } else if (choice != 4) System.out.println("Invalid choice!");

        } while (choice != 4);
        System.out.println("Total Bill: $" + bill);
    }
}
