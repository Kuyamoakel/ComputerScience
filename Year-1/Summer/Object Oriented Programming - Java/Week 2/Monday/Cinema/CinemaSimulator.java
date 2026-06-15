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

    void viewAllMovies() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + ". " + movies.get(i).name);
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

    void viewBookingDetails() {
        System.out.println(this);
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
        Cinema cinema = new Cinema();
        Movie movie1 = new Movie("Avingir", "Action", 150, 50);
        Customer cos1 = new Customer("Akel", "AK12");
        Booking book1 = new Booking("AK12", 5, "6/16/26", cos1, movie1);

        cinema.addMovie(movie1);
        cinema.addCostumer(cos1);
        cinema.addBooking(book1);
        cinema.viewAllMovies();
    }
}