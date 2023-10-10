import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Movie information
        String movieName = "Avengers: Endgame";
        String[] showtimes = {"10:00 AM", "2:00 PM", "6:00 PM"};

        // Theater information
        String theaterName = "The Theater of the Decade";
        int totalSeats;
        totalSeats = 100;
        int availableSeats = totalSeats;

        // User interaction
        System.out.println("Welcome to " + theaterName);
        System.out.println("Movie: " + movieName);

        while (true) {
            System.out.println("\nAvailable Showtimes:");
            for (int i = 0; i < showtimes.length; i++) {
                System.out.println((i + 1) + ". " + showtimes[i]);
            }

            System.out.print("Select a showtime (1-" + showtimes.length + ") or 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit the program
            } else if (choice >= 1 && choice <= showtimes.length) {
                // Showtime selected
                int selectedShowtimeIndex = choice - 1;
                String selectedShowtime = showtimes[selectedShowtimeIndex];

                System.out.print("Enter the number of tickets to book: ");
                int numTickets = scanner.nextInt();

                if (numTickets > 0 && numTickets <= availableSeats) {
                    // Booking successful
                    System.out.println("Booking successful!");
                    System.out.println("Movie: " + movieName);
                    System.out.println("Showtime: " + selectedShowtime);
                    System.out.println("Tickets booked: " + numTickets);
                    availableSeats -= numTickets;
                } else {
                    // Invalid number of tickets
                    System.out.println("Invalid number of tickets. Please try again.");
                }
            } else {
                // Invalid showtime choice
                System.out.println("Invalid choice. Please select a valid showtime.");
            }
        }

        System.out.println("Thank you for using " + theaterName + ". Goodbye!");
    }
}
