package Classes;

public class PlayRPS {
    public static void main(String[] args) {
        RPS one = new RPS("One");
        RPS two = new RPS("Two");

        System.out.println(RPS.fight(one, two));
    }
}
