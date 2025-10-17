package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;

    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Same object
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Different class or null
        }
        City city = (City) obj;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);  // Generate hash code based on city and province
    }

    @Override
    public int compareTo(City city){
        return this.city.compareTo(city.getCityName());
        // this.city refers to the city name
    }
}
