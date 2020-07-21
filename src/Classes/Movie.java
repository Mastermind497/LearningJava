package Classes;

public class Movie {
    /*
     1. Genre
     2. IMDB
     3. Rotten Tomatoes
     4. Title/Name
     5. Length
     */
    private String name;
    private double length;
    private int rottenTomatoes;
    private double imdb;
    private String genre;
    
    public Movie(String nameInput, double length, int rottenTomatoes, double imdb, String genre) {
        name = nameInput;
        this.length = length;
        this.rottenTomatoes = rottenTomatoes;
        this.imdb = imdb;
        this.genre = genre;
    }
}
