package Introduction;

import java.util.Scanner;

public class FindSecondCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type something in: ");

        String text = scan.nextLine();

        System.out.print("What Position?: ");

        int x = scan.nextInt();//3; //Position

        System.out.println(text.charAt(x - 1));
    }
}
