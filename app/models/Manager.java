package models;

import java.util.HashSet;
import java.util.Set;


public class Manager {

    private static Manager ourManager = new Manager();

    public static Manager getManager() {
        return ourManager;
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

    // Data method.
    public void addDataToDb() {
        new Restaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39").save();
        new Restaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1").save();
        new Restaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63").save();

        new Visitor("Zitella", "Menendes", "zmenendes0@bing.com", "239-924-2788").save();
        new Visitor("Nico", "Drivers", "ndrivers0@buzzfeed.com", "693-566-8984").save();
        new Visitor("Roderich", "Caulton", "rcaulton1@tripadvisor.com", "191-729-0261").save();
        new Visitor("Deana", "Rodder", "drodder2@smugmug.com", "184-853-9441").save();
        new Visitor("Shelby", "Gori", "sgori3@blogspot.com", "365-555-8407").save();
        new Visitor("Myron", "Zannuto", "mzannuto4@usatoday.com", "233-524-4742").save();

        // Linking all visitors with Astoria.
        Restaurant astoria = Restaurant.restaurantFinder.byId("Astoria");

        if (astoria == null) return;

        for (Visitor visitor : Visitor.visitorFinder.all()) {
            new Link(astoria.getRestaurantName(), visitor.getFirstName()).save();
        }
    }

    // General methods.

    public void visitRestaurant(String restaurantName, String visitorName) {
        new Link(restaurantName, visitorName).save();
    }

    public void forgetRestaurant(String restaurantName, String visitorName) {
        for (Link link : Link.linkFinder.all()) {
            if (link.getRestaurantName().equals(restaurantName)) {
                if (link.getVisitorName().equals(visitorName)) link.delete();
            }
        }
    }
}