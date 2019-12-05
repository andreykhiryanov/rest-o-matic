package controllers;

import entities.Restaurant;
import models.Manager;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.createrestaurant;
import views.html.home.editrestaurant;
import views.html.home.index;
import javax.inject.Inject;

public class HomeController extends Controller {

    Manager manager = Manager.getManager();

    @Inject
    FormFactory formFactory;

    // Greetings
    public Result greetings() {

        // Fill with test data.
        manager.fillTestRestaurants();
        manager.fillTestVisitors();

        return ok(index.render(manager.getAllRestaurants(), manager.getAllVisitors()));
    }

    // Restaurants' actions

    public Result createRestaurant() {
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class);
        return ok(createrestaurant.render(restaurantForm));
    }

    public Result saveChanges() {

        // Getting created restaurant from the previous form.
        // TODO: remove deprecated method bindFromRequest
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).bindFromRequest();

        // Transferring new restaurant to the manager for storage in the collection.
        manager.addNewRestaurant(restaurantForm.get());

        return redirect(routes.HomeController.greetings());

    }

    public Result editRestaurant(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = manager.getRestByName(restaurantName);

        // If the requested restaurant was not found, the method 'getRestByName' returns null.
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

    // Visitors' actions

}