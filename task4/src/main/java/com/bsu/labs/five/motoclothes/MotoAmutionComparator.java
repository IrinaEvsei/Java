package main.java.com.bsu.labs.five.motoclothes;

import java.util.Comparator;


public class MotoAmutionComparator implements Comparator<Amunition> {

    @Override
    public int compare(Amunition o1, Amunition o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
