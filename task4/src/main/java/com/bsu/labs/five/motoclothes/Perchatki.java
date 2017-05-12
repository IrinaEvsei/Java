package main.java.com.bsu.labs.five.motoclothes;


public class Perchatki extends MotoAmunition {

    private int sizeOfHands;

    public Perchatki(String name, int weight, int cost, int sizeOfHands) {
        super(name, weight, cost);
        this.sizeOfHands = sizeOfHands;
    }

    public int getSizeOfHands() {
        return sizeOfHands;
    }

    public void setSizeOfHands(int sizeOfHands) {
        this.sizeOfHands = sizeOfHands;
    }
}
