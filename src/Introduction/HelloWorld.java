package Introduction;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.print("Type something for me to copy: ");

        boolean equals = "Test".equalsIgnoreCase("test");
        System.out.println(equals);
    }

    public static double fahrenheitToCelsius(double fTemp) {
        double celsius = (((fTemp - 32) * 5) / 9);
        return celsius;
    }
}