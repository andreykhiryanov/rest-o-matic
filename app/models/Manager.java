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

    public void fillTestData() {
        createNewRestaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39");
        createNewRestaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1");
        createNewRestaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63");
    }

    public Restaurant getRestByName(String requestedRestaurant) {

        for (Restaurant restaurant : allRestaurants) {
            if (restaurant.getRestaurantName().equals(requestedRestaurant)) {
                return restaurant;
            }
        }

        return null;
    }

    public void createNewRestaurant(String restaurantName, String legalName, int inn, String address) {
        allRestaurants.add(new Restaurant(restaurantName, legalName, inn, address));
    }

}