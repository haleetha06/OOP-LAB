import java.util.Scanner;

class TicketBooking {

    
    void bookTicket(String movie) {
        System.out.println("Movie: " + movie);
        System.out.println("1 ticket booked.");
    }


    void bookTicket(String movie, int numTickets) {
        System.out.println("Movie: " + movie);
        System.out.println(numTickets + " tickets booked.");
    }

    
    void bookTicket(String movie, int numTickets, String seatType) {
        System.out.println("Movie: " + movie);
        System.out.println(numTickets + " tickets booked in " + seatType + " class.");
    }

    
    void bookTicket(String movie, int numTickets, String seatType, double discount) {
        double pricePerTicket = seatType.equalsIgnoreCase("VIP") ? 500 : 300;
        double totalPrice = numTickets * pricePerTicket;
        double finalPrice = totalPrice - (totalPrice * (discount / 100));

        System.out.println("Movie: " + movie);
        System.out.println(numTickets + " tickets booked in " + seatType + " class.");
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Final Price After Discount: $" + finalPrice);
    }
}

public class method_overloading1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketBooking booking = new TicketBooking();

        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();

        System.out.println("Choose booking option:");
        System.out.println("1. Book 1 ticket");
        System.out.println("2. Book multiple tickets");
        System.out.println("3. Book with seat type (VIP/Regular)");
        System.out.println("4. Book with seat type & discount");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                booking.bookTicket(movie);
                break;

            case 2:
                System.out.print("Enter number of tickets: ");
                int numTickets = scanner.nextInt();
                booking.bookTicket(movie, numTickets);
                break;

            case 3:
                System.out.print("Enter number of tickets: ");
                numTickets = scanner.nextInt();
                System.out.print("Enter seat type (VIP/Regular): ");
                scanner.nextLine();  
                String seatType = scanner.nextLine();
                booking.bookTicket(movie, numTickets, seatType);
                break;

            case 4:
                System.out.print("Enter number of tickets: ");
                numTickets = scanner.nextInt();
                System.out.print("Enter seat type (VIP/Regular): ");
                scanner.nextLine();  
                seatType = scanner.nextLine();
                System.out.print("Enter discount percentage: ");
                double discount = scanner.nextDouble();
                booking.bookTicket(movie, numTickets, seatType, discount);
                break;

            default:
                System.out.println("Invalid option! Please try again.");
        }

        scanner.close();
    }
}
