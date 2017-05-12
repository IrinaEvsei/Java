package com.main.java.bsu.labs.four.computer.drive;


public class CDDriver implements DiskDriver {

    @Override
    public void read() {
       System.out.println("Read from CD driver");
    }

    @Override
    public void write() {
        System.out.println("Write to CD driver");
    }
}
