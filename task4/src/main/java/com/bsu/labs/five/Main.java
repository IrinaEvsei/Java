package main.java.com.bsu.labs.five;

import main.java.com.bsu.labs.five.motoclothes.Amunition;
import main.java.com.bsu.labs.five.motoclothes.Costume;
import main.java.com.bsu.labs.five.motoclothes.MotoAmutionComparator;
import main.java.com.bsu.labs.five.motoclothes.Perchatki;
import main.java.com.bsu.labs.five.motoclothes.Shlem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String [] args){
        MotoDriver driver = generateMotoDriver("Ирина");

        System.out.println(driver);

        Collections.sort(driver.getClothes(), new MotoAmutionComparator());
        System.out.println("Сортируем экипировку по весу");
        System.out.println(driver);

        List<Amunition> founded = findByPrice(driver.getClothes(), 189, 191);
        System.out.println("Цену от 221 дo 230 имеет: ");
        System.out.println(founded.toString());
    }

    private static MotoDriver generateMotoDriver(String name) {
        MotoDriver driver = new MotoDriver();
        driver.setName(name);
        driver.getClothes().add(new Costume("Костюм", 230, 200, 250));
        driver.getClothes().add(new Perchatki("Перчатки", 220, 210, 220));
        driver.getClothes().add(new Shlem("Шлем", 270, 190, 223));
        return driver;
    }

    private static List<Amunition> findByPrice(List<Amunition> clothes, int from, int to) {
        List<Amunition> result = new ArrayList<>();

        for (Amunition amunition : clothes) {
            if (amunition.getCost() > from && amunition.getCost() < to) {
                result.add(amunition);
            }
        }

        return result;
    }
}
