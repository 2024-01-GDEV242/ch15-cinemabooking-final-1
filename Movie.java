
/**
 * The objects that are in the class movie represent the movie that are being created and being used in 
 * the CinemaBookingSystem class
 *
 * @author Alexei C, Jose T, Jacob R
 * @version (5/2/2024)
 */
public class Movie {
    private String movieName;
    private String movieRD; //RD = ReleaseDate
    private double runTime;
    /**
     * Constructor for objects of class Movie
     * Made to create the name/date of the movie with a specific time already made for the movie
     */
    public Movie() {
        movieName = "Name";
        movieRD = "Date";
        runTime = 2.5; //in hours
    }
    
    public Movie(String movieName, String movieDate, double movieTime) {
        this.movieName = movieName;
        movieRD = movieDate;
        runTime = movieTime; //in hours
    }
    /**
     * Will get the movies name
     * @return will return the movies name 
     */
    public String getMovieName() {
        return movieName;
    }
    /**
     * Will get the movie's date of showing
     * @return will return the movies date
     */
    public String getMovieDate() {
        return movieRD;
    }
    /**
     * Will get the run time of the movie 
     * @return will return the movies run time 
     */
    public double getRunTime() {
        return runTime;
    }
    /**
     * Will change the movies date and if needed be able to change the movies date
     */
    public void changeDate(String movieDate) {
        movieRD = movieDate;
    }
    /**
     * Will change the movies name if needed/changing the name of the movie entirely
     */
    public void changeName(String movieName) {
        this.movieName = movieName;
    }
    /**
     * Will change the movies time if needed of the prolonge movies said run time of airing
     */
    public void changeTime(double movieTime) {
        runTime = movieTime;
    }
}
