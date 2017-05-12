package main.java.com.bsu.labs.five.motoclothes;


public class MotoAmunition implements Amunition{

    private String name;
    private int weight;
    private int cost;

    public MotoAmunition(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString(){
        return getName();
    }
}
