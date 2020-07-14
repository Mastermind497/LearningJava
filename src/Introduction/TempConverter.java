package Introduction;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What Fahrenheit Temperature do you want to convert?: ");
        double toConvert = reader.nextDouble();

        double celsius = ((toConvert - 32) * 5) / 9;

        System.out.println("Your new temperature is " + celsius + " Degrees Celsius!");
    }
}
