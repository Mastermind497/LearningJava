package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] listOfNums = new int[3];

        Scanner reader = new Scanner(System.in);
        System.out.println(Arrays.toString(listOfNums));

        for (int i = 0; i < listOfNums.length; i++) {
            System.out.print("What is the element at " + i + "? ");
            listOfNums[i] = reader.nextInt();
        }

        System.out.println(Arrays.toString(listOfNums));
    }
}
