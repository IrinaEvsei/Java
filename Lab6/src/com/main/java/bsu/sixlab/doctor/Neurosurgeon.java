package com.main.java.bsu.sixlab.doctor;

/**
 * Created by irisha on 02.04.2017.
 */
public class Neurosurgeon extends AbstractDoctor {

    @Override
    String getTypeOfDoctor() {
        return "Нейрохирург";
    }

    public Neurosurgeon(String name, int experience) {
        super(name, experience);
    }
}
