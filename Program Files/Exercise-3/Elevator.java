import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentFloor = 1, targetFloor;
        
        do {
            System.out.print("Enter floor (1-10) or 0 to exit: ");
            targetFloor = sc.nextInt();

            if (targetFloor > 0 && targetFloor <= 10) {
                System.out.println("Moving from Floor " + currentFloor + " to " + targetFloor);
                currentFloor = targetFloor;
            } else if (targetFloor != 0) {
                System.out.println("Invalid Floor!");
            }
        } while (targetFloor != 0);

        System.out.println("Elevator stopped.");
    }
}
