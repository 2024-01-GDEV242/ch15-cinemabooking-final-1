
/**
 * Write a description of class Seat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seat {
    // instance variables - replace the example below with your own
    private int rowNum;
    private int colNum;
    private boolean taken = false;
    /**
     * Constructor for objects of class Seat
     */
    public Seat(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
    }
    public int getSeatRow() {
        return rowNum;
    }
    public int getSeatCol() {
        return colNum;
    }
    public boolean isBooked() {
        return taken;
    }
    public void bookSeat(Theater theater) {
        theater.seatsInUse++;
        taken = true;
    }
    public void removeBooking(Theater theater) {
        theater.seatsInUse++;
        taken = false;
    }
}
