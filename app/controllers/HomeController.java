package controllers;

import entities.Restaurant;
import entities.Visitor;
import models.Manager;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.createrestaurant;
import views.html.home.editrestaurant;
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

        // Fill with test data.
        manager.fillTestData();

        return ok(index.render(allRestaurants));
    }

    // Create new restaurant button
    public Result createRestaurant() {
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class);
        return ok(createrestaurant.render(restaurantForm));
    }

    public Result saveChanges() {

        // TODO: remove deprecated method bindFromRequest
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).bindFromRequest();
        allRestaurants.add(restaurantForm.get());

        return redirect(routes.HomeController.greetings());

    }

    public Result editRestaurant(String restaurantName) {

        Restaurant restaurant = manager.getRestByName(restaurantName);

        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }

        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).fill(restaurant);
        return ok(editrestaurant.render(restaurantForm));

    }

    public Result update() {
        return null;
    }

    public Result destroy(String restaurantName) {
        return null;
    }

    public Result show(String restaurantName) {
        return null;
    }

}