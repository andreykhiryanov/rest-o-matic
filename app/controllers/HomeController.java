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
import java.util.Iterator;
import java.util.Set;

public class HomeController extends Controller {

    private Manager manager = Manager.getManager();

    @Inject
    FormFactory formFactory;

    public Result greetings() {

        fillTestData();

        return ok(index.render(manager.getAllRestaurants(), manager.getAllVisitors()));
    }

    private void fillTestData() {
        // Fill with test entities.
        manager.fillTestRestaurants();
        manager.fillTestVisitors();

        Restaurant astoria = manager.getRestaurantByName("Astoria");
        Visitor zitella = manager.getVisitorByName("Zitella");

        // All visitors go to the restaurant Astoria.
        astoria.getAcceptedVisitors().addAll(manager.getAllVisitors());
        // Zitella visits all restaurants.
        zitella.getVisitedRestaurants().addAll(manager.getAllRestaurants());

        // TODO: Find out why it does not work.
//        for (Visitor visitor : manager.getAllVisitors()) {
//            visitor.visitRestaurant(astoria);
//        }
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
        Restaurant restaurant = manager.getRestaurantByName(restaurantName);

        // If the requested restaurant was not found, the method 'getRestaurantByName' returns null.
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