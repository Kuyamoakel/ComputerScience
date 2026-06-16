import java.util.ArrayList;
import java.util.Scanner;

class Cinema {
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    void addMovie(Movie movie) {
        movies.add(movie);
    }

    void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    void addCostumer(Customer customer) {
        customers.add(customer);
    }

    void addBooking(Booking booking) {
        bookings.add(booking);
    }

    Movie getMovie(int index) {
        return movies.get(index);
    }

    void viewAllMovies() {
        System.out.println("\n===== LIST OF MOVIES =====");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + ". " + movies.get(i));
            System.out.println();
        }
    }

    void viewBookingTickets() {
        System.out.println("===== LSIT OF BOOKINGS =====");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + ". " + bookings.get(i));
            System.out.println();
        }
    }
}

class Movie {
    String name;
    String genre;
    int ticketPrice;
    int availableSeats;

    Movie(String name, String genre, int ticketPrice, int availableSeats) {
        this.name = name;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    void displayDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Movie Name: " + name +
                "\nGenre: " + genre +
                "\nTicket Price: " + ticketPrice +
                "\nAvaiable Seats: " + availableSeats;
    }
}

class Customer {
    String name;
    String customerId;

    Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name +
                "\nCustomer ID: " + customerId;
    }
}

class Booking {
    String bookingId;
    int numberOfTickets;
    String bookingDate;
    Customer customer;
    Movie movie;

    Booking(String bookingId, int numberOfTickets, String bookingDate, Customer customer, Movie movie) {
        this.bookingId = bookingId;
        this.numberOfTickets = numberOfTickets;
        this.bookingDate = bookingDate;
        this.customer = customer;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                "\nMovie: " + movie.name +
                "\nCustomer: " + customer.name +
                "\nBookingDate: " + bookingDate +
                "\nNumber Of Tickets: " + numberOfTickets;
    }
}

class Manager {
    String name;

    Manager(String name) {
        this.name = name;
    }

    void addMovie(Cinema cinema, Movie movie) {
        cinema.addMovie(movie);
    }

    void removeMovie(Cinema cinema, Movie movie) {
        cinema.removeMovie(movie);
    }

}

public class CinemaSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cinema cinema = new Cinema();
        Movie movie;
        Booking book;
        Customer customer;

        while (true) {
            System.out.print("[1] View Movies\n[2] Add Movie\n[3] Book Tickets\n[4] View Bookings\n[5] Exit\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1 -> {cinema.viewAllMovies();}
                case 2 -> {
                    System.out.println("==== ADD MOVIE ====");
                    System.out.print("Movie Name: ");
                    String movieName = in.nextLine();

                    System.out.print("Genre: ");
                    String movieGenre = in.nextLine();

                    System.out.print("Ticket Price: ");
                    int movieTicketPrice = in.nextInt();

                    System.out.print("Available Sets: ");
                    int movieAvailableSet = in.nextInt();

                    movie = new Movie(movieName, movieGenre, movieTicketPrice, movieAvailableSet);

                    cinema.addMovie(movie);
                }
                case 3 -> {
                    System.out.println("==== BOOK TICKETS ====");
                    System.out.print("Booking ID: ");
                    String bookingID = in.nextLine();

                    System.out.print("Number Of Tickets: ");
                    int numberOfTickets = in.nextInt();
                    in.nextLine();

                    System.out.print("Booking Date (ex. 6/16/2026): ");
                    String bookingDate = in.nextLine();

                    System.out.print("Customer Name: ");
                    String customerName = in.nextLine();

                    System.out.print("Customer ID: ");
                    String customerID = in.nextLine();

                    cinema.viewAllMovies();

                    System.out.print("\nEnter Movie Number: ");
                    int movieNumber = in.nextInt();
                    
                    customer = new Customer(customerName, customerID);
                    book = new Booking(bookingID, numberOfTickets, bookingDate, customer, cinema.getMovie(movieNumber - 1));
                    cinema.addBooking(book);
                }
                case 4 -> {
                    book.viewBookingDetails();
                }
                default -> {}
            }
        }
    } 
}