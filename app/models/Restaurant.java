package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RESTAURANT")
public class Restaurant extends Model {

    @Id
    @Constraints.Required
    @Column(name = "RESTAURANT_NAME", nullable = false)
    private String restaurantName;

    @Column(name = "LEGAL_NAME", nullable = false)
    private String legalName;

    @Column(name = "INN", nullable = false)
    private int inn;

    @Constraints.Required
    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "HAS",
            joinColumns = @JoinColumn(name = "RESTAURANT_ID", referencedColumnName = "RESTAURANT_NAME"),
            inverseJoinColumns = @JoinColumn(name = "VISITOR_ID", referencedColumnName = "FIRST_NAME")
    )
    private List<Visitor> acceptedVisitors = new ArrayList<>();

    public static Finder<String, Restaurant> restaurantFinder = new Finder<>(Restaurant.class);

    public Restaurant() {
    }

    public Restaurant(String restaurantName, String legalName, int inn, String address) {
        this.restaurantName = restaurantName;
        this.legalName = legalName;
        this.inn = inn;
        this.address = address;
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

    public List<Visitor> getAcceptedVisitors() {
        return acceptedVisitors;
    }
}