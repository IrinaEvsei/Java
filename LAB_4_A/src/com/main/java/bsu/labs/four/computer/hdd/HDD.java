package com.main.java.bsu.labs.four.computer.hdd;


public class HDD extends AbstractHardDisk {
    @Override
    public String getType() {
        return "HDD";
    }



    @Override
    public Long getSize() {
        return 20000L;
    }
}
