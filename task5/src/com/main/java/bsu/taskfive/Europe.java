package com.main.java.bsu.taskfive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by irisha on 04.04.2017.
 */
public class Europe {
    private List<Country> countries = new ArrayList<>();

    public Europe() {
    }

    public Country addCountry(String name){
        Country country = new Country(name);
        getCountries().add(country);
        return country;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public class Country {
        private String name;
        private List<HistoricalInfo> historicalInfos = new ArrayList<>();

        public Country(String name) {
            this.name = name;
        }

        public HistoricalInfo addHistoricalInfo(int from, int to) {
            HistoricalInfo info = new HistoricalInfo(from, to);
            getHistoricalInfos().add(info);
            return info;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<HistoricalInfo> getHistoricalInfos() {
            return historicalInfos;
        }

        public void setHistoricalInfos(List<HistoricalInfo> historicalInfos) {
            this.historicalInfos = historicalInfos;
        }

        public class HistoricalInfo {
            private int from;
            private int to;
            private List<Coordinates> coordinates = new ArrayList<>();

            public HistoricalInfo(int from, int to) {
                this.from = from;
                this.to = to;
            }

            public void populateGeoData(double lat, double lon) {
                getCoordinates().add(new Coordinates(lat,lon));
            }

            public int getFrom() {
                return from;
            }

            public void setFrom(int from) {
                this.from = from;
            }

            public int getTo() {
                return to;
            }

            public void setTo(int to) {
                this.to = to;
            }

            public List<Coordinates> getCoordinates() {
                return coordinates;
            }

            public void setCoordinates(List<Coordinates> coordinates) {
                this.coordinates = coordinates;
            }

            public class Coordinates {
                private double lat;
                private double lon;

                public Coordinates(double lat, double lon) {
                    this.lat = lat;
                    this.lon = lon;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLon() {
                    return lon;
                }

                public void setLon(double lon) {
                    this.lon = lon;
                }

                public String toString(){
                    return "Lat: "+getLat()+" long: "+getLon();
                }
            }
        }
    }
}
