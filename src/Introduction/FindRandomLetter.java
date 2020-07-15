package Introduction;

import java.util.Scanner;

public class FindRandomLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give us a sentence? ");
        String text = scanner.nextLine();

        int randomIndex = (int) (Math.random() * (text.length()));

        System.out.println(text.charAt(randomIndex));
    }
}
