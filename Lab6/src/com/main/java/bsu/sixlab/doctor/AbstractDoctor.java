package com.main.java.bsu.sixlab.doctor;

/**
 * Created by irisha on 04.04.2017.
 */
public abstract class AbstractDoctor {

    String name;
    int experience;

    abstract String getTypeOfDoctor();

    public AbstractDoctor(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    public void name() {
        System.out.printf(getTypeOfDoctor()+ " " + name + ".");
    }

    public void experience() {
        System.out.printf(" Стаж работы "+ experience + "\n");
    }
}
