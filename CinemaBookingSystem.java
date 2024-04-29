import java.util.*;


/**
 * Write a description of class CinemaBookingSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaBookingSystem {
    // instance variables - replace the example below with your own
    public ArrayList<Movie> movies = new ArrayList<Movie>();
    public ArrayList<Theater> theaters = new ArrayList<Theater>();
    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem() {
        
    }
    public void buyTicket(String buyerName, int numOfTick, Movie movie, Theater theater) {
        ArrayList<Seat> seat = theater.getSeats();
        if(theater.isFull() == true) {
            System.out.println("Sorry! That theater is already full!");
        } else if(theater.seatsLeft() < numOfTick) { 
            System.out.println("Sorry! That theater can't fit everybody!");
        } else {
            for(int i = 0; i < numOfTick; i++) {
                if(seat.get(i).isBooked() == true) {
                    System.out.println("This seat is taken!/nFixing!!");
                    i++;
                    numOfTick++;
                } else {
                    Ticket ticket = new Ticket(buyerName, seat.get(i), movie, theater);
                    ticket.printTicket();
                }
            }
        }
    }
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
    public void addTheater(Theater theater){
        theaters.add(theater);
    }
    public void removeTheater(Theater theater){
        theaters.remove(theater);
    }
    public boolean hasMovie() {
        return true;
    }
}
