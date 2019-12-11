package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Visitor extends Model {

    @Id
    @Constraints.Required
    private String firstName;
    @Constraints.Required
    private String lastName;
    private String email;
    private String phoneNumber;
    private Set<Restaurant> visitedRestaurants = new HashSet<>();

    public static Finder<String, Visitor> visitorFinder = new Finder<>(Visitor.class);

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
}