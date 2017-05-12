package com.main.java.bsu.labs.four.computer;

import com.main.java.bsu.labs.four.computer.antivirus.AntiVirus;
import com.main.java.bsu.labs.four.computer.cpu.Processor;
import com.main.java.bsu.labs.four.computer.hdd.HardDisk;
import com.main.java.bsu.labs.four.computer.ram.RAM;
import com.main.java.bsu.labs.four.computer.drive.DiskDriver;

public class Computer{

    private String computerName;;
    private Processor processor;
    private DiskDriver diskDriver;
    private HardDisk hardDisk;
    private RAM ram;
    private AntiVirus antiVirus;

    public Computer(String computerName, Processor processor, DiskDriver diskDriver, HardDisk hardDisk, RAM ram, AntiVirus antiVirus) {
        this.computerName = computerName;
        this.processor = processor;
        this.diskDriver = diskDriver;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.antiVirus = antiVirus;
    }


    public boolean powerOn(){
        System.out.println(getComputerName() + " power ON" );
        return true;
    }

    public boolean powerOff(){
        System.out.println(getComputerName() + " power OFF" );
        return false;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public DiskDriver getDiskDriver() {
        return diskDriver;
    }

    public void setDiskDriver(DiskDriver diskDriver) {
        this.diskDriver = diskDriver;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public AntiVirus getAntiVirus() {
        return antiVirus;
    }

    public void setAntiVirus(AntiVirus antiVirus) {
        this.antiVirus = antiVirus;
    }
}
