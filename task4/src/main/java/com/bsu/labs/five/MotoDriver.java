package main.java.com.bsu.labs.five;

import main.java.com.bsu.labs.five.motoclothes.Amunition;

import java.util.ArrayList;
import java.util.List;

public class MotoDriver {
    private String name;
    private List<Amunition> clothes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Amunition> getClothes() {
        return clothes;
    }

    public void setClothes(List<Amunition> clothes) {
        this.clothes = clothes;
    }

    public String toString(){
        return "Я мотоциклист " + getName() + " " + clothes.toString();
    }
}
