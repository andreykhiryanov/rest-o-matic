package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Link extends Model {

    private String restaurantName;
    private String visitorName;

    public Link() {
    }

    public Link(String restaurantName, String visitorName) {
        this.restaurantName = restaurantName;
        this.visitorName = visitorName;
    }

    public static Finder<String, Link> linkFinder = new Finder<>(Link.class);

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getVisitorName() {
        return visitorName;
    }
}