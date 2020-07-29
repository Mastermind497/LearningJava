package Conditionals;

public class AdvancedConditionals {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        if (a && !(b || a)) {
            System.out.println("Raining and Thunder");
        }
    }
}
