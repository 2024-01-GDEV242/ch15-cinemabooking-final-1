/**
 *The objects that are in this Ticket Class represent the tickets that are being created for the theaters showing.
 * @author Alexei C, Jose T, Jacob R
 * @version (5/2/2024)
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
     * Has the ojects for creating the seat,buyers name, seatrow/column and name of movie/theater.
     */
    public Ticket(String whoBought, Seat seat, Movie movie, Theater theater) {
        seat.bookSeat(theater);
        buyerName = whoBought;
        seatRow = seat.getSeatRow();
        seatColumn = seat.getSeatCol();
        movieName = movie.getMovieName();
        theaterName = theater.getTheaterName();
    }
    /**
     * Will print out the buyers ticket with the information about the price, theater name/seatRow and Column as well of 
     * the movie name
     */
    public void printTicket() {
        System.out.println(
            "Ticket Holder: "+buyerName+
            "\nFor a price of: $12.00 USD"+
            "\nIn Theater: "+theaterName+
            "\nAt Seat: "+seatRow+" "+seatColumn+
            "\nWatching: "+movieName);
    }
}
