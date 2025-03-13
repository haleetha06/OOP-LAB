import java.util.Scanner;
public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fare = 0;
        int distance;

        System.out.print("Enter distance traveled (km): ");
        distance = sc.nextInt();

        while (distance > 0) {
            fare += (distance > 5) ? 10 : 5;
            distance--;
        }
        System.out.println("Total Fare: $" + fare);
    }
}
