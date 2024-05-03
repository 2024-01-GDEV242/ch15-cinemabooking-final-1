import java.util.*;


/**
 * Description of class CinemaBookingSystem below.
 *This will use the classes that are Ticket, Seat, Theater, makeMovie to manage/create a Cinema booking/Theater screening.
 * @author Alexei C, Jose T, Jacob R
 * @version (5/2/2024)
 */
public class CinemaBookingSystem {
    // instance variables - replace the example below with your own
    public ArrayList<Movie> movies = new ArrayList<Movie>();
    public ArrayList<Theater> theaters = new ArrayList<Theater>();
    /**
     * Creates the CinemaBookingSystem objects, by entering text inputs for certain parameters.
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
    /**
     * Adds a new movie to the list of current movie showings
     */
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    /**
     * Removes a movie from the list of current movie showings
     */
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
    /**
     * Will Add/Create a theater and adds it to the list of theaters
     */
    public void addTheater(Theater theater){
        theaters.add(theater);
    }
    /**
     * Will remove a theater and remove it from the current list of theaters
     */
    public void removeTheater(Theater theater){
        theaters.remove(theater);
    }
    /**
     * Will information if the movie/theater has been made/is true
     */
    public boolean hasMovie() {
        return true;
    }
}
