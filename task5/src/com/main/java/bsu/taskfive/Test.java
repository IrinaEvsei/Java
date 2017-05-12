package com.main.java.bsu.taskfive;

/**
 * Created by irisha on 04.04.2017.
 */
public class Test {

    public static void main(String[]args){
        Europe europe = new Europe();

        //Add poland
        Europe.Country poland = europe.addCountry("Poland");


        Europe.Country.HistoricalInfo poland2012 = poland.addHistoricalInfo(2012,2013);
        poland2012.populateGeoData(1,2);
        poland2012.populateGeoData(3,2);


        Europe.Country.HistoricalInfo poland2013 = poland.addHistoricalInfo(2013,2014);
        poland2013.populateGeoData(1,2);
        poland2013.populateGeoData(1,2);


        printEurope(europe);
    }

    private static void printEurope(Europe europe){
        for (Europe.Country country : europe.getCountries()){
            System.out.println(country.getName());
            for (Europe.Country.HistoricalInfo info : country.getHistoricalInfos()){
                System.out.println("From " + info.getFrom() + " to "+ info.getTo()
                        + " size " + info.getCoordinates().toString());
            }
            System.out.println("********");
        }
    }
}
