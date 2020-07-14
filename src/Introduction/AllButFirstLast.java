package Introduction;

import java.util.Scanner;

public class AllButFirstLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type something in: ");
        String text = scan.nextLine();

        System.out.println(text.substring((2) - 1, text.length() - 1));
    }
}
