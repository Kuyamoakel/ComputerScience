import java.util.ArrayList;
import java.util.Scanner;

class Cinema {
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
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
        return "Movie Name: " + name +
               "\nCustomerId: " + customerId;
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
               "\nNumber Of Tickets: " + numberOfTickets +
               "\nBookingDate: " + bookingDate +
               "\nCustomer: " + customer +
               "\nMovie: " + movie;
    }
}

class Manager {
    String name;
}

public class CinemaSimulator {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Avingir", "Action", 50, 100);
        Customer c1 = new Customer("Alfred", "Ak1123");
        Booking b1 = new Booking("Ak111", 5, "6/15/2026", c1, movie1);

        System.out.println(movie1);
        System.out.println();

        System.out.println(c1);
        System.out.println();
        
        System.out.println(b1);


    }
}