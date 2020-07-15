package Introduction;

public class MathMax {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 30);
        System.out.println(a);
    }

    public static int random(int start, int end) {
        return (int) ((Math.random() * (end + 1 - start)) + start);
    }
}
