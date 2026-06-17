
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

    Movie getMovie(int index) {
        return movies.get(index);
    }

    void bookTicket(Booking booking) {
        bookings.add(booking);
    }

    void viewAllMovies() {
        if (movies.size() == 0) {
            System.out.println("NO MOVIES AVAILABLE YET!");
            return;
        }

        System.out.println("\n===== LIST OF MOVIES =====");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + ". " + movies.get(i));
            System.out.println();
        }
    }

    void viewBookingTickets() {
        if (bookings.size() == 0) {
            System.out.println("NO BOOKING YET!");
            return;
        }

        System.out.println("\n===== LSIT OF BOOKINGS =====");
        for (int i = 0; i < bookings.size(); i++) {
            System.out.println(i + 1 + ". " + bookings.get(i));
            System.out.println();
        }
    }
}

class Movie {
    private String name;
    private String genre;
    private int ticketPrice;
    private int availableSeats;

    Movie(String name, String genre, int ticketPrice, int availableSeats) {
        this.name = name;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    void displayDetails() {
        System.out.println(this);
    }

    boolean reserveSeats(int tickets) {
        if (tickets > availableSeats) {
            return false;
        } else {
            availableSeats -= tickets;
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getAvailableSeats() {
        return availableSeats;
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
    private static int customerCounter = 333;
    private String name;
    private String customerId;

    Customer(String name) {
        this.name = name;
        this.customerId = "CS22" + customerCounter++;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name +
                "\nCustomer ID: " + customerId;
    }
}

class Booking {
    private static int bookingCounter = 33;
    private String bookingId;
    private int numberOfTickets;
    private String bookingDate;
    private Customer customer;
    private Movie movie;

    Booking(int numberOfTickets, String bookingDate, Customer customer, Movie movie) {
        this.bookingId = "BK23" + bookingCounter++;
        this.numberOfTickets = numberOfTickets;
        this.bookingDate = bookingDate;
        this.customer = customer;
        this.movie = movie;
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                "\nMovie: " + movie.getName() +
                "\nCustomer: " + customer.getName() +
                "\nBookingDate: " + bookingDate +
                "\nNumber Of Tickets: " + numberOfTickets;
    }
}

class Manager {
    private String name;

    Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
            System.out.println("\n===== AKERU'S MOVIE =====");
            System.out
                    .print("[1] View Movies\n[2] Add Movie\n[3] Book Tickets\n[4] View Bookings\n[5] Exit\nChoices: ");
            int menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1 -> {
                    cinema.viewAllMovies();
                }
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
                    
                    System.out.println("MOVIE SUCCESFULLY ADDED!");
                }
                case 3 -> {
                    System.out.println("==== BOOK TICKETS ====");

                    System.out.print("Customer Name: ");
                    String customerName = in.nextLine();

                    System.out.print("Number Of Tickets: ");
                    int numberOfTickets = in.nextInt();
                    in.nextLine();

                    System.out.print("Booking Date (ex. 6/16/2026): ");
                    String bookingDate = in.nextLine();


                    cinema.viewAllMovies();

                    System.out.print("\nEnter Movie Number: ");
                    int movieNumber = in.nextInt();

                    if (movieNumber < 1 || movieNumber > cinema.movies.size()) {
                        System.out.println("Invalid Movie Number!");
                        break;
                    }

                    customer = new Customer(customerName);
                    Movie selectedMovie = cinema.getMovie(movieNumber - 1);

                    
                    if (selectedMovie.reserveSeats(numberOfTickets)) {
                        book = new Booking(numberOfTickets, bookingDate, customer, selectedMovie);
                        cinema.bookTicket(book);

                        System.out.println("SUCCESFULLY BOOK!");
                    }
                    else {
                        System.out.println("FAILED BOOKING!");
                    }

                }
                case 4 -> {
                    cinema.viewBookingTickets();
                }
                default -> {
                }
            }
        }
    }
}