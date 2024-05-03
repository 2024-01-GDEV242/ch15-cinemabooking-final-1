
/**
 * The objects that are in this class represent the seats that are given for a theater showing.
 *
 * @author Alexei C, Jose T, Jacob R
 * @version (5/2/2024)
 */
public class Seat {
    // instance variables - replace the example below with your own
    private int rowNum;
    private int colNum;
    private boolean taken = false;
    /**
     * Constructor for objects of class Seat
     * @param the row element for the row number
     * @param the column element for the column number
     */
    public Seat(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
    }
    /**
     * Returns the seat row, which is the made row number for the row that is created.
     * @return The seat row number
     */
    public int getSeatRow() {
        return rowNum;
    }
    /**
     * Returns the seat column, which is the made seat column for the column that is created
     * @return The seat column number
     */
    public int getSeatCol() {
        return colNum;
    }
    /**
     * Will return if the seat is unavailable
     * @return with message saying that the current seat is closed/taken
     */
    public boolean isBooked() {
        return taken;
    }
    /**
     * Will tell/search for the availabilty of the seat
     */
    public void bookSeat(Theater theater) {
        theater.seatsInUse++;
        taken = true;
    }
    /**
     * Remove's the booking of a seat, if the person decides to cancel the ticket.
     */
    public void removeBooking(Theater theater) {
        theater.seatsInUse++;
        taken = false;
    }
}
