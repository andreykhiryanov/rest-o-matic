package models;

import entities.Restaurant;
import entities.Visitor;

import java.util.HashSet;
import java.util.Set;

public class Manager {
    private static Manager manager = new Manager();

    public static Manager getManager() {
        return manager;
    }

    private Manager() {
    }

    private Set<Restaurant> allRestaurants = new HashSet<>();
    private Set<Visitor> allVisitors = new HashSet<>();

    public Set<Restaurant> getAllRestaurants() {
        return allRestaurants;
    }

    public Set<Visitor> getAllVisitors() {
        return allVisitors;
    }

}