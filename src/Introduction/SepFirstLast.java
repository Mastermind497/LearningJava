package Introduction;

import java.util.Scanner;

public class SepFirstLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type your First and Last Name in: "); // First <space> Last
        String name = scan.nextLine(); // Bob Bobson

        System.out.println(seperateFirstAndLastNameString(name));
    }
    
    public static void seperateFirstAndLastName(String name) {
        System.out.println(seperateFirstAndLastNameString(name));
    }
    
    public static String seperateFirstAndLastNameString(String name) {
        int spaceIndex = name.indexOf(' ');
    
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);
    
        return (lastName + ", " + firstName);
    }
}
