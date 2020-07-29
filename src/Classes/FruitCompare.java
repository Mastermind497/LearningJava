package Classes;

public class FruitCompare {
    public static void main(String[] args) {
        String george = new String("George McClain");

        char[] George = {'G', 'e', 'o', 'r', 'g', 'e', ' ', 'M', 'c', 'C', 'l', 'a', 'i', 'n', '\0'};

        String bob = george.substring(3, 6);
        bob.indexOf('M');
    }
}
