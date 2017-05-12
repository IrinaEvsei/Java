package main.java.com.bsu.labs.five.motoclothes;

public class Costume extends MotoAmunition {

    private int heights;

    public Costume(String name, int weight, int cost, int heights) {
        super(name, weight, cost);
        this.heights = heights;
    }

    public int getHeights() {
        return heights;
    }

    public void setHeights(int heights) {
        this.heights = heights;
    }
}
