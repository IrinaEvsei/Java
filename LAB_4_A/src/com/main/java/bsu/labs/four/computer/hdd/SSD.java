package com.main.java.bsu.labs.four.computer.hdd;


public class SSD extends AbstractHardDisk {
    @Override
    public String getType() {
        return "SSD";
    }



    @Override
    public Long getSize() {
        return 20000L;
    }
}
