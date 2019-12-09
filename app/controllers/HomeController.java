package controllers;

import entities.Restaurant;
import entities.Visitor;
import models.Manager;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.*;

import javax.inject.Inject;

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

        // All visitors go to the restaurant Astoria.
        astoria.getAcceptedVisitors().addAll(manager.getAllVisitors());

        for (Visitor visitor : manager.getAllVisitors()) {
            manager.visitRestaurant(visitor, astoria);
        }
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

    public Result showRestaurantCard(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = manager.getRestaurantByName(restaurantName);

        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }

        return ok(restaurantcard.render(restaurant));
    }

    // Visitors' actions

    public Result showVisitorCard(String visitorName) {

        Visitor visitor = manager.getVisitorByName(visitorName);

        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        return ok(visitorcard.render(visitor));

    }

}