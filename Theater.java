import java.util.*;
/**
 * The objects that are in this class represent the theaters that are being created
 *
 * @author Alexei C, Jose T, Jacob R
 * @version (5/2/2024)
 */
public class Theater {
    // instance variables - replace the example below with your own
    public String theaterName;
    private int totalSeats;
    public int seatsInUse;
    public boolean full;
    ArrayList<Seat> seats = new ArrayList<Seat>();
    /**
     * Constructor for objects of class Theater
     * Will construct a theater with name/rows and columns
     */
    public Theater(String theaterName, int rows, int columns) {
        this.theaterName = theaterName;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                Seat seat = new Seat(i+1, j+1);
                seats.add(seat);
                totalSeats++;
            }
        }
    }
    /**
     * Is printing out the seats number available to the customer
     */
    public void printSeats() {
        int i = seats.size()-1;
        while(i >= 0){
            System.out.println("The Seat Number is: "+seats.get(i).getSeatRow() + ", "+seats.get(i).getSeatCol() );
            i--;
        }
    }
    /**
     * Is getting the theaters name
     * @return is returning the name of the theater
     */
    public String getTheaterName() {
        return theaterName;
    }
    /**
     * Is getting the ArrayList of seats from the theater
     * @return is returning the seats from the list
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }
    /**
     * Is collecting the total number of seats
     * @return is returning the grand total of seats
     */
    public int getTotal() {
        return totalSeats;
    }
    /**
     * is fethching the number of seats left 
     * @return is returning the number of seats that are left from the number that are in use
     */
    public int seatsLeft() {
        return totalSeats - seatsInUse;
    }
    /**
     * Will display if all the seats that are available are completly in use/full
     * @return is returning full if the totalSeats are = to seatsInUse
     */
    public boolean isFull() {
        if(totalSeats == seatsInUse) {
            full = true;
        }
        return full;
    }
}
