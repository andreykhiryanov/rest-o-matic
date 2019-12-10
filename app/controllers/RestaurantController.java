package controllers;

import models.Restaurant;
import models.Visitor;
import models.Manager;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.createrestaurant;
import views.html.home.editrestaurant;
import views.html.home.restaurantcard;
import javax.inject.Inject;

public class RestaurantController extends Controller {

    private Manager manager = Manager.getManager();

    @Inject
    FormFactory formFactory;

    public Result createRestaurant() {
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class);
        return ok(createrestaurant.render(restaurantForm));
    }

    public Result saveRestaurantChanges() {

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

    public Result updateRestaurant() {

        Restaurant restaurant = formFactory.form(Restaurant.class).bindFromRequest().get();
        Restaurant oldRestaurant = manager.getRestaurantByName(restaurant.getRestaurantName());

        if (oldRestaurant == null) {
            return notFound("You cannot change the name of the restaurant yet!");
        }

        oldRestaurant.setRestaurantName(restaurant.getRestaurantName());
        oldRestaurant.setLegalName(restaurant.getLegalName());
        oldRestaurant.setInn(restaurant.getInn());
        oldRestaurant.setAddress(restaurant.getAddress());

        return redirect(routes.RestaurantController.showRestaurantCard(restaurant.getRestaurantName()));
    }

    public Result destroyRestaurant(String restaurantName) {

        Restaurant destroyingRestaurant = manager.getRestaurantByName(restaurantName);

        // Removing this restaurant from visitors' "visited restaurants".
        for (Visitor visitor : manager.getAllVisitors()) {
            visitor.getVisitedRestaurants().remove(destroyingRestaurant);
        }

        // Removing the restaurant at all.
        manager.getAllRestaurants().remove(destroyingRestaurant);

        return redirect(routes.HomeController.greetings());
    }

    public Result showRestaurantCard(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = manager.getRestaurantByName(restaurantName);

        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }

        return ok(restaurantcard.render(restaurant));
    }

    public Result acceptVisitor(String visitorName) {

        Restaurant restaurant = formFactory.form(Restaurant.class).bindFromRequest().get();
        Visitor visitor = manager.getVisitorByName(visitorName);

        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        manager.visitRestaurant(visitor, restaurant);

        return redirect(routes.RestaurantController.showRestaurantCard(restaurant.getRestaurantName()));
    }

    public Result kickVisitor(String visitorName) {

        Restaurant restaurant = formFactory.form(Restaurant.class).bindFromRequest().get();
        Visitor visitor = manager.getVisitorByName(visitorName);

        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        manager.unvisitRestaurant(visitor, restaurant);

        return redirect(routes.RestaurantController.showRestaurantCard(restaurant.getRestaurantName()));

    }

}