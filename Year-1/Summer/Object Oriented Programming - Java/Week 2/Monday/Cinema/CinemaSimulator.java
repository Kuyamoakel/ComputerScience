import java.util.ArrayList;
import java.util.Scanner;

class Cinema {
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    void addMovie(Movie movie) {
        movies.add(movie);
    }

    void addCostumer(Customer customer) {
        customers.add(customer);
    }

    void addBooking(Booking booking) {
        bookings.add(booking);
    }

    void viewAllMovies() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + ". " + movies.get(i).name);
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
}

public class CinemaSimulator {
    public static void main(String[] args) {

    }
}