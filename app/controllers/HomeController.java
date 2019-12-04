package controllers;

import models.Restaurant;
import models.Visitor;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.*;
import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;

public class HomeController extends Controller {

    private Set<Restaurant> restaurants = new HashSet<>();
    private Set<Visitor> visitors = new HashSet<>();

    @Inject
    FormFactory formFactory;

    // Greetings
    public Result greetings() {

        restaurants.add(new Restaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39"));
        restaurants.add(new Restaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1"));
        restaurants.add(new Restaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63"));

        return ok(index.render(restaurants));
    }

    // Create new restaurant button
    public Result create() {
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class);

        return ok(createrestaurant.render(restaurantForm));
    }

    // To save book.
    public Result save() {
        return null;
    }

    public Result edit(Integer id) {
        return null;
    }

    public Result update() {
        return null;
    }

    public Result destroy(Integer id) {
        return null;
    }

    public Result show(Integer id) {
        return null;
    }

}