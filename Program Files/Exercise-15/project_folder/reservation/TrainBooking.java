

package project_folder.reservation;

public class TrainBooking {
    static int sleeperSeats = 50;
    static int acSeats = 30;

    public static void bookTicket(String name, int seats, String travelClass) {
        int pricePerSeat;

        if (travelClass.equalsIgnoreCase("sleeper")) {
            pricePerSeat = 150;
            if (sleeperSeats >= seats) {
                sleeperSeats -= seats;
                System.out.println("Booking confirmed for: " + name);
                System.out.println("Class: Sleeper");
                System.out.println("Tickets: " + seats);
                System.out.println("Total Amount: ₹" + (pricePerSeat * seats));
                System.out.println("Remaining Sleeper Seats: " + sleeperSeats);
            } else {
                System.out.println("Not enough Sleeper seats available.");
            }
        } else if (travelClass.equalsIgnoreCase("ac")) {
            pricePerSeat = 300;
            if (acSeats >= seats) {
                acSeats -= seats;
                System.out.println("Booking confirmed for: " + name);
                System.out.println("Class: AC");
                System.out.println("Tickets: " + seats);
                System.out.println("Total Amount: ₹" + (pricePerSeat * seats));
                System.out.println("Remaining AC Seats: " + acSeats);
            } else {
                System.out.println("Not enough AC seats available.");
            }
        } else {
            System.out.println("Invalid class type entered.");
        }
    }
}
