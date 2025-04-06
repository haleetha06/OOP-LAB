package project_folder;

import java.util.Scanner;
import project_folder.reservation.TrainBooking;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Train Ticket Reservation");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of tickets to book: ");
        int tickets = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter class type (AC/Sleeper): ");
        String travelClass = sc.nextLine();

        TrainBooking.bookTicket(name, tickets, travelClass);

        sc.close();
    }
}
