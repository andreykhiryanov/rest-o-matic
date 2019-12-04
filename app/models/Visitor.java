package models;

import java.util.HashSet;
import java.util.Set;

public class Visitor {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private int id;
    private Set<Restaurant> restaurants;

    public Visitor() {
    }

    public Visitor(String firstName, String lastName, String email, int phoneNumber, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
        restaurants = new HashSet<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

}