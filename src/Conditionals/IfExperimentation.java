package Conditionals;

import java.util.Scanner;

public class IfExperimentation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give me an int: ");
        int input = reader.nextInt();

        switch (input) {
            case 0:
            case 2:
                System.out.println("Today it's raining");
                return;
            case 1:
                System.out.println("Today is a bad day");
                return;

            case 3:
                System.out.println("The Movie was Good");
                return;
            default:
                System.out.println("Fun");
                return;
        }

//        if (raining) {
//            //Take an Umbrella
//            if (thunder) {
//                System.out.println("Stay Inside");
//            }
//            else {
//                System.out.println("Get Umbrella");
//            }
//        }
//        else {
//            if (sunny) {
//                System.out.println("Wear a Hat");
//            }
//            else {
//                System.out.println("Do Whatever");
//            }
//        }
//        if (raining) {
//            System.out.println("It's Raining");
//        }
//        else {
//            System.out.println("It's Sunny");
//        }
    }
}
