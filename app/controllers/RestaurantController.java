package controllers;

import models.Restaurant;
import models.Visitor;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.createrestaurant;
import views.html.home.editrestaurant;
import views.html.home.restaurantcard;
import javax.inject.Inject;

public class RestaurantController extends Controller {

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

        if (restaurantForm.hasErrors()) {
            return badRequest(createrestaurant.render(restaurantForm));
        }

        Restaurant newRestaurant = restaurantForm.get();
        newRestaurant.save();

        return redirect(routes.HomeController.greetings());

    }

    public Result editRestaurant(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = Restaurant.restaurantFinder.byId(restaurantName);

        // If the requested restaurant was not found, the method 'getRestaurantByName' returns null.
        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }

        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).fill(restaurant);
        return ok(editrestaurant.render(restaurantForm));

    }

    public Result updateRestaurant() {

        Restaurant restaurant = formFactory.form(Restaurant.class).bindFromRequest().get();
        Restaurant oldRestaurant = Restaurant.restaurantFinder.byId(restaurant.getRestaurantName());

        if (oldRestaurant == null) {
            return notFound("You cannot change the name of the restaurant, because it is the ID of the restaurant!");
        }

        oldRestaurant.setRestaurantName(restaurant.getRestaurantName());
        oldRestaurant.setLegalName(restaurant.getLegalName());
        oldRestaurant.setInn(restaurant.getInn());
        oldRestaurant.setAddress(restaurant.getAddress());

        oldRestaurant.update();

        return redirect(routes.RestaurantController.showRestaurantCard(restaurant.getRestaurantName()));
    }

    public Result destroyRestaurant(String restaurantName) {

        Restaurant destroyingRestaurant = Restaurant.restaurantFinder.byId(restaurantName);

        if (destroyingRestaurant == null) {
            return notFound("Restaurant not found!");
        }

        destroyingRestaurant.delete();

        return redirect(routes.HomeController.greetings());
    }

    public Result showRestaurantCard(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = Restaurant.restaurantFinder.byId(restaurantName);

        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }

        // Passing in the form a restaurant and a list of all visitors.
        return ok(restaurantcard.render(restaurant, Visitor.visitorFinder.all()));
    }
}