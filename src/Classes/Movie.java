package Classes;

public class Movie {
    /*
     1. Genre
     2. IMDB
     3. Rotten Tomatoes
     4. Title/Name
     5. Length
     */
    
    //Instance Variables
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
    
    public Movie(String nameInput, double length, int rottenTomatoes, String genre) {
        name = nameInput;
        this.length = length;
        this.rottenTomatoes = rottenTomatoes;
        this.imdb = -1;
        this.genre = genre;
    }
    
    public Movie(String name, double length, double imdb, String genre) {
        this(name, length, -1, imdb, genre);
    }
    
    public Movie(String name, double length, String genre) {
        this(name, length, -1, genre);
    }
    
    public Movie() {
        this(null, 0, null);
    }
    
    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setRottenTomatoes(int rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }
    
    public void setImdb(double imdb) {
        this.imdb = imdb;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getLength() {
        return length;
    }
    
    public int getRottenTomatoes() {
        return rottenTomatoes;
    }
    
    public double getImdb() {
        return imdb;
    }
    
    public String getGenre() {
        return genre;
    }
}
