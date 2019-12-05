package controllers;

import entities.Restaurant;
import entities.Visitor;
import models.Manager;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.createrestaurant;
import views.html.home.index;

import javax.inject.Inject;
import java.util.Set;

public class HomeController extends Controller {

    Manager manager = Manager.getManager();

    private Set<Restaurant> allRestaurants = manager.getAllRestaurants();
    private Set<Visitor> allVisitors = manager.getAllVisitors();

    @Inject
    FormFactory formFactory;

    // Greetings
    public Result greetings() {

        allRestaurants.add(new Restaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39"));
        allRestaurants.add(new Restaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1"));
        allRestaurants.add(new Restaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63"));

        return ok(index.render(allRestaurants));
    }

    // Create new restaurant button
    public Result create() {
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class);
        return ok(createrestaurant.render(restaurantForm));
    }

    public Result save() {

        // TODO: remove deprecated method bindFromRequest
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).bindFromRequest();
        allRestaurants.add(restaurantForm.get());

        return redirect(routes.HomeController.greetings());

    }

    public Result edit(String restaurantName) {
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