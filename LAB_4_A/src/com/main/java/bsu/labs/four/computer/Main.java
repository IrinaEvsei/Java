package com.main.java.bsu.labs.four.computer;

import com.main.java.bsu.labs.four.computer.antivirus.Kaspersky;
import com.main.java.bsu.labs.four.computer.antivirus.NOD32;
import com.main.java.bsu.labs.four.computer.cpu.Processor2X;
import com.main.java.bsu.labs.four.computer.cpu.Processor4X;
import com.main.java.bsu.labs.four.computer.drive.DVDDriver;
import com.main.java.bsu.labs.four.computer.drive.CDDriver;
import com.main.java.bsu.labs.four.computer.hdd.HDD;
import com.main.java.bsu.labs.four.computer.hdd.SSD;
import com.main.java.bsu.labs.four.computer.ram.RAM1024;
import com.main.java.bsu.labs.four.computer.ram.RAM512;

public class Main {

    public static void main(String[] args) {

        Computer intel = new Computer("Intel", new Processor2X(), new CDDriver(), new HDD(), new RAM512(), new NOD32());
        Computer apple = new Computer("Apple", new Processor4X(), new DVDDriver(), new SSD(), new RAM1024(), new Kaspersky());
        Computer intel2 = new Computer("Intel2", new Processor4X(), new CDDriver(), new HDD(), new RAM512(), new Kaspersky());

        workWithComputer(intel);
        workWithComputer(apple);
        workWithComputer(intel2);

    }

    private static void workWithComputer(Computer computer){
        computer.powerOn();
        computer.getAntiVirus().checkViruses();
        System.out.println(computer.getProcessor().getNumberOfCores());
        computer.getHardDisk().printSize();
        computer.powerOff();
    }
}
