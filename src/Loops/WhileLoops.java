package Loops;

import Classes.Point;

public class WhileLoops {
    /*
    One Arg: Boolean
    Block
     */
    public static void main(String[] args) {
        top:
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (i * k == 12) {
                    break top;
                }

                System.out.println("No break because i * k = " + i + " * " + k + " = " + i * k);
            }
        }
    }

}
