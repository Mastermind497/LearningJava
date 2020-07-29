package Classes;

public class RPS {

    private static final String ROCK     = "R"; //0
    private static final String SCISSORS = "S"; //1
    private static final String PAPER    = "P"; //2

    private String strategy;
    private final String name;

    public RPS(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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


}
