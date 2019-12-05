package entities;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private String restaurantName;
    private String legalName;
    private int inn;
    private String address;
    private Set<Visitor> visitors;

    public Restaurant() {
    }

    public Restaurant(String restaurantName, String legalName, int inn, String address) {
        this.restaurantName = restaurantName;
        this.legalName = legalName;
        this.inn = inn;
        this.address = address;
        visitors = new HashSet<>();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Visitor> getVisitors() {
        return visitors;
    }

}