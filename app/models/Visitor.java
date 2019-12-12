package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "VISITOR")
public class Visitor extends Model {

    @Id
    @Constraints.Required
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Constraints.Required
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "acceptedVisitors")
    private List<Restaurant> visitedRestaurants = new ArrayList<>();

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

    public List<Restaurant> getVisitedRestaurants() {
        return visitedRestaurants;
    }
}