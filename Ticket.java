/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private String buyerName;
    private double price;
    private String movieName;
    private String theaterName;
    private int seatRow;
    private int seatColumn;
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String whoBought, Seat seat, Movie movie, Theater theater) {
        seat.bookSeat(theater);
        buyerName = whoBought;
        seatRow = seat.getSeatRow();
        seatColumn = seat.getSeatCol();
        movieName = movie.getMovieName();
        theaterName = theater.getTheaterName();
    }
    public void printTicket() {
        System.out.println(
            "Ticket Holder: "+buyerName+
            "\nFor a price of: $12.00 USD"+
            "\nIn Theater: "+theaterName+
            "\nAt Seat: "+seatRow+" "+seatColumn+
            "\nWatching: "+movieName);
    }
}
