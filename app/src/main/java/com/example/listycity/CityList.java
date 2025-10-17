package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private final List<com.example.listycity.City> cities = new ArrayList<>();

    /**
     * Checks if city exists or not in the list
     * @param city
     * @return true if city already exists in the list, false otherwise
     */
    public boolean hasCity(com.example.listycity.City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if the city exists
     * @param city
     *      This is a candidate city to delete
     */
    public void delete(com.example.listycity.City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the count of cities in the list
     * @return the number of cities in list
     */
    public int countCities(){
        return cities.size();
    }
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(com.example.listycity.City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<com.example.listycity.City> getCities() {
        List<com.example.listycity.City> list = cities;
        Collections.sort(list);
        return list;
    }
}
