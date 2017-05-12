package com.main.java.bsu.sixlab;

import com.main.java.bsu.sixlab.doctor.Neurosurgeon;
import com.main.java.bsu.sixlab.doctor.Surgeon;

/**
 * Created by irisha on 02.04.2017.
 */
public class Main {
    public static void main(String[] args){
        Surgeon a = new Surgeon("Ирина", 2015);
        a.name();
        a.experience();

        Neurosurgeon b = new Neurosurgeon("Алина", 2016);
        b.name();
        b.experience();
    }
}
