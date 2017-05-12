package main.java.com.bsu.labs.five.motoclothes;

public class Shlem extends MotoAmunition {

    private int sizeOfHead;

    public Shlem(String name, int weight, int cost, int sizeOfHead) {
        super(name, weight, cost);
        this.sizeOfHead = sizeOfHead;
    }

    public int getSizeOfHead() {
        return sizeOfHead;
    }

    public void setSizeOfHead(int sizeOfHead) {
        this.sizeOfHead = sizeOfHead;
    }
}
