package Loops;

import java.util.Scanner;

public class PasswordProtected {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the Password: ");
        String attempt = reader.nextLine();

        String realPass = "apple";

        while (!attempt.equals(realPass)) {
            System.out.println("Wrong Password, Try Again.");
            System.out.print("What is the Password: ");
            attempt = reader.nextLine();
        }

        System.out.println("NICE JOB! CONGRATS");

    }
}
