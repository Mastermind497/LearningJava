package Classes;

public class RPS {

    private static final String ROCK     = "Rock"; //0
    private static final String SCISSORS = "Scissors"; //1
    private static final String PAPER    = "Paper"; //2

    private String strategy;
    private final String name;

    public RPS(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public void randomizeStrategy() {
        int randomNum = random();
        switch (randomNum) {
            case 0:
                strategy = ROCK;
                return;
            case 1:
                strategy = SCISSORS;
                return;
            case 2:
                strategy = PAPER;
                return;
        }
    }

    private int random() {
        return (int)(Math.random() * 3);
    }

    public boolean beats(RPS b) {
        if (this.getStrategy().equals(ROCK)) {
            if (b.getStrategy().equals(PAPER)) {
                return false;
            } else {
                return true;
            }
        } else if (this.getStrategy().equals(PAPER)) {
            if (b.getStrategy().equals(ROCK)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (b.getStrategy().equals(PAPER)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String fight(RPS a, RPS b) {
        a.randomizeStrategy();
        b.randomizeStrategy();

        if (a.getStrategy().equals(b.getStrategy())) {
            return fight(a, b);
        } else if (a.beats(b)) {
            return (a.getName() + " beat " + b.getName() + " because " + a.getStrategy() + " beats " + b.getStrategy());
        }
        else {
            return (b.getName() + " beat " + a.getName() + " because " + b.getStrategy() + " beats " + a.getStrategy());
        }
    }

}
