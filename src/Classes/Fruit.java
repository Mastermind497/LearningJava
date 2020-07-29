package Classes;

public class Fruit {
    /*
     1. String type
     2. Contains seeds (yes/no)
     3. Price
     4. GMO/Non-GMO
     5. Ripeness
     6. Weight
     */

    private String type;
    private boolean seedless;
    private double price;
    private boolean gmo;
    private int ripeness;
    private double weight;

    public Fruit(String type, boolean seedless, double price, boolean gmo, int ripeness, double weight) {
        this.type = type;
        this.seedless = seedless;
        this.price = price;
        this.gmo = gmo;

        if (ripeness > 10) {
            this.ripeness = 10;
        }
        else {
            this.ripeness = Math.max(1, ripeness);
        }

        this.weight = weight;
    }

    public Fruit(String type, boolean seedless, double price, int ripeness, double weight) {
        this.type = type;
        this.seedless = seedless;
        this.price = price;
        this.ripeness = ripeness;
        this.weight = weight;
        this.gmo = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGmo() {
        return gmo;
    }

    public void setGmo(boolean gmo) {
        this.gmo = gmo;
    }

    public int getRipeness() {
        return ripeness;
    }

    public void setRipeness(int ripeness) {
        this.ripeness = ripeness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return type + ", Weight = " + weight + ", Ripeness = " + ripeness;
    }

    public static void main(String[] args) {
        System.out.println(new Fruit("Apple", true, 4, true, 10, 3.5));
    }


}
