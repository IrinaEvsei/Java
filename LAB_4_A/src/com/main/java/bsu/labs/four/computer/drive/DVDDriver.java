package com.main.java.bsu.labs.four.computer.drive;

public class DVDDriver implements DiskDriver {

    @Override
    public void read() {
       System.out.println("Read from DVD driver");
    }

    @Override
    public void write() {
        System.out.println("Write to DRV driver");
    }
}
