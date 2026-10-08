import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    // Parameterized constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculate total amount
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculate discount
    double calculateDiscount() {
        double total = calculateTotal();

        if (numberOfTickets >= 5) {
            return total * 0.10;
        } else {
            return 0.0;
        }
    }

    // Calculate final amount
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Display booking bill
    void displayBill() {
        System.out.println("\n----- Cinema Ticket Booking Bill -----");
        System.out.println("Movie Name       : " + movieName);
        System.out.printf("Ticket Price     : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount     : %.2f%n", calculateTotal());
        System.out.printf("Discount         : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount     : %.2f%n", calculateFinalAmount());
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        // Creating MovieTicket object
        MovieTicket ticket = new MovieTicket(
                movieName,
                ticketPrice,
                numberOfTickets);

        // Display complete bill
        ticket.displayBill();

        sc.close();
    }
}