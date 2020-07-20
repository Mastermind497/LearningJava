package Introduction;

public class PrintsChar {
    public static void main(String[] args) {
        char letter1 = random();
        char letter2 = random();
        char letter3 = random();
        char letter4 = random();
        int number1 = random(0, 9);
        int number2 = random(0, 9);
        System.out.println("" + letter1 + letter2 + letter3 + "-" + number1 + number2 + letter4);
    }
    
    public static int random(int beginIndex, int endIndex) {
        return (int) (Math.random() * (endIndex - beginIndex + 1) + beginIndex);
    }
    
    public static char random() {
        int beginIndex = 'A';
        int endIndex = 'Z';
    
        return (char) random(beginIndex, endIndex);
    }
}