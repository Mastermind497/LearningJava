package Classes;

public class MovieTester {
    public static void main(String[] args) {
        Movie catchMeIfYouCan = new Movie("Catch Me If You Can", 1.9, 98, 1.8, "Magic");
        System.out.println(catchMeIfYouCan.getLength());
        catchMeIfYouCan.setLength(1.5);
    
        System.out.println(catchMeIfYouCan.getLength());
    }
}
