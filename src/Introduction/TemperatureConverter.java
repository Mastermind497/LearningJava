package Introduction;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What Temperature do you want to convert to Celsius (From Fahrenheit)? ");

        double f = scan.nextDouble();

        double c = (((f - 32) * 5) / 9);

        System.out.println("The Celsius Temperature is: " + c);
    }
}
