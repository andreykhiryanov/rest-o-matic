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

    public void visitRestaurant(Visitor visitor, Restaurant restaurant) {
        visitor.visitRestaurant(restaurant);
        restaurant.acceptVisitor(visitor);
    }

    // Restaurants' methods.

    public void fillTestRestaurants() {
        addNewRestaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39");
        addNewRestaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1");
        addNewRestaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63");
    }

    public Restaurant getRestaurantByName(String requestedRestaurantName) {
        for (Restaurant restaurant : allRestaurants) {
            if (restaurant.getRestaurantName().equals(requestedRestaurantName)) {
                return restaurant;
            }
        }

        return null;
    }

    public void addNewRestaurant(String restaurantName, String legalName, int inn, String address) {
        allRestaurants.add(new Restaurant(restaurantName, legalName, inn, address));
    }

    public void addNewRestaurant(Restaurant newRestaurant) {
        allRestaurants.add(newRestaurant);
    }

    // Visitors' methods.

    public void fillTestVisitors() {
        addNewVisitor("Zitella", "Menendes", "zmenendes0@bing.com", "239-924-2788");
        addNewVisitor("Nico", "Drivers", "ndrivers0@buzzfeed.com", "693-566-8984");
        addNewVisitor("Roderich", "Caulton", "rcaulton1@tripadvisor.com", "191-729-0261");
        addNewVisitor("Deana", "Rodder", "drodder2@smugmug.com", "184-853-9441");
        addNewVisitor("Shelby", "Gori", "sgori3@blogspot.com", "365-555-8407");
        addNewVisitor("Myron", "Zannuto", "mzannuto4@usatoday.com", "233-524-4742");
    }

    public Visitor getVisitorByName(String requestedVisitorName) {
        for (Visitor visitor  : allVisitors) {
            if (visitor.getFirstName().equals(requestedVisitorName)) {
                return visitor;
            }
        }

        return null;
    }

    public void addNewVisitor(String firstName, String lastName, String email, String phoneNumber) {
        allVisitors.add(new Visitor(firstName, lastName, email, phoneNumber));
    }

    public void addNewVisitor(Visitor newVisitor) {
        allVisitors.add(newVisitor);
    }

}