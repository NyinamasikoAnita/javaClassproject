// Write a Java program to create a class called "Movie" with
// attributes for title, director, actors, and reviews,
// and methods for adding and retrieving reviews.

public class Movie {
    private String title;
    private String Director;
    private String Actors;
    private String Reviews;


    //    constructor
    public Movie(String title, String director, String actors, String reviews) {
        this.title = title;
        Director = director;
        Actors = actors;
        Reviews = reviews;
    }

//GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getReviews() {
        return Reviews;
    }

    public void setReviews(String reviews) {
        Reviews = reviews;
    }

//    METHOD FOR ADDING A REVIEW
}
