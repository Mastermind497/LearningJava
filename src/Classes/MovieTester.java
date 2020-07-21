package Classes;

import java.util.Scanner;

public class MovieTester {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String movieName = reader.nextLine();
        Movie catchMeIfYouCan = new Movie(movieName, 1.9, 98, 1.8, "Magic");
    }
}
