package models;

import java.util.HashSet;
import java.util.Set;

public class Visitor {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Set<Restaurant> visitedRestaurants = new HashSet<>();

    public Visitor() {
    }

    public Visitor(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Restaurant> getVisitedRestaurants() {
        return visitedRestaurants;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Visitor visitor = (Visitor) o;
//
//        if (!firstName.equals(visitor.firstName)) return false;
//        if (!lastName.equals(visitor.lastName)) return false;
//        if (!email.equals(visitor.email)) return false;
//        if (!phoneNumber.equals(visitor.phoneNumber)) return false;
//        return visitedRestaurants.equals(visitor.visitedRestaurants);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = firstName.hashCode();
//        result = 31 * result + lastName.hashCode();
//        result = 31 * result + email.hashCode();
//        result = 31 * result + phoneNumber.hashCode();
//        result = 31 * result + visitedRestaurants.hashCode();
//        return result;
//    }
}