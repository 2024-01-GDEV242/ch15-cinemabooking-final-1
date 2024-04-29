import java.util.*;
/**
 * Write a description of class Theater here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public void printSeats() {
        int i = seats.size()-1;
        while(i >= 0){
            System.out.println("The Seat Number is: "+seats.get(i).getSeatRow() + ", "+seats.get(i).getSeatCol() );
            i--;
        }
    }
    public String getTheaterName() {
        return theaterName;
    }
    public ArrayList<Seat> getSeats() {
        return seats;
    }
    public int getTotal() {
        return totalSeats;
    }
    public int seatsLeft() {
        return totalSeats - seatsInUse;
    }
    public boolean isFull() {
        if(totalSeats == seatsInUse) {
            full = true;
        }
        return full;
    }
}
