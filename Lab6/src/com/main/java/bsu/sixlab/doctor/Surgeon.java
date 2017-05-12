package com.main.java.bsu.sixlab.doctor;

/**
 * Created by irisha on 02.04.2017.
 */
public class Surgeon extends AbstractDoctor {

    public Surgeon(String name, int experience) {
        super(name, experience);
    }

    @Override
    String getTypeOfDoctor() {
        return "Хирург";
    }
}
