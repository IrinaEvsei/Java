package com.main.java.bsu.labs.four.computer.hdd;


public abstract class AbstractHardDisk implements HardDisk {


    @Override
    public void printSize() {
        System.out.println(getType() + " has size " + getSize());
    }

}
