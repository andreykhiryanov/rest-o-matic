package controllers;

import models.Restaurant;
import models.Visitor;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.createrestaurant;
import views.html.editrestaurant;
import views.html.restaurantcard;
import javax.inject.Inject;
import java.util.List;

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

        // Checking the uniqueness of the INN.
        for (Restaurant restaurant : Restaurant.restaurantFinder.all()) {
            if (restaurant.getInn() == newRestaurant.getInn()) {
                return badRequest("A restaurant with this INN already exists.");
            }
        }

        newRestaurant.setId((long) (Math.random()*10000));
        newRestaurant.save();

        return redirect(routes.HomeController.greetings());

    }

    public Result editRestaurant(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = searchRestByName(restaurantName);

        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }

        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).fill(restaurant);
        return ok(editrestaurant.render(restaurantForm, restaurantName));

    }

    public Result updateRestaurant(String oldRestaurantName) {

        Restaurant updatedRestaurant = formFactory.form(Restaurant.class).bindFromRequest().get();
        Restaurant oldRestaurant = searchRestByName(oldRestaurantName);

        if (oldRestaurant == null) {
            return notFound("Updating error!");
        }

        // Checking the uniqueness of the INN.
        for (Restaurant existingRestaurant : Restaurant.restaurantFinder.all()) {
            if (existingRestaurant.getInn() == updatedRestaurant.getInn() &
                    updatedRestaurant.getInn() != oldRestaurant.getInn()) {
                return badRequest("A restaurant with this INN already exists.");
            }
        }

        oldRestaurant.setRestaurantName(updatedRestaurant.getRestaurantName());
        oldRestaurant.setLegalName(updatedRestaurant.getLegalName());
        oldRestaurant.setInn(updatedRestaurant.getInn());
        oldRestaurant.setAddress(updatedRestaurant.getAddress());

        oldRestaurant.update();

        return redirect(routes.RestaurantController.showRestaurantCard(updatedRestaurant.getRestaurantName()));
    }

    public Result destroyRestaurant(String restaurantName) {

        Restaurant destroyingRestaurant = searchRestByName(restaurantName);

        if (destroyingRestaurant == null) {
            return notFound("Restaurant not found!");
        }

        destroyingRestaurant.delete();

        return redirect(routes.HomeController.greetings());
    }

    public Result showRestaurantCard(String restaurantName) {

        // Searching requested restaurant
        Restaurant restaurant = searchRestByName(restaurantName);

        if (restaurant == null) {
            return notFound("Restaurant not found!");
        }


        List<Visitor> newVisitors = Visitor.visitorFinder.all();
        newVisitors.removeAll(restaurant.getAcceptedVisitors());

        // Passing in the form a restaurant and a list of all visitors.
        return ok(restaurantcard.render(restaurant, newVisitors));
    }

    public Result acceptVisitor(String restaurantName, String visitorName) {

        Restaurant restaurant = searchRestByName(restaurantName);
        Visitor visitor = searchVisitorByName(visitorName);

        if (restaurant == null || visitor == null) {
            return notFound("Method: error!");
        }

        restaurant.getAcceptedVisitors().add(visitor);
        restaurant.update();
        visitor.update();

        return ok();
    }

    public Result kickVisitor(String restaurantName, String visitorName) {

        Restaurant restaurant = searchRestByName(restaurantName);
        Visitor visitor = searchVisitorByName(visitorName);

        if (restaurant == null || visitor == null) {
            return notFound("Method: error!");
        }

        restaurant.getAcceptedVisitors().remove(visitor);
        restaurant.update();
        visitor.update();

        return ok();
    }

    private Restaurant searchRestByName(String restaurantName) {
        long id = 0;

        for (Restaurant restaurant : Restaurant.restaurantFinder.all()) {
            if (restaurant.getRestaurantName().equals(restaurantName)) id = restaurant.getId();
        }

        return Restaurant.restaurantFinder.byId(id);
    }

    private Visitor searchVisitorByName(String visitorName) {
        long id = 0;

        for (Visitor visitor : Visitor.visitorFinder.all()) {
            if (visitor.getFirstName().equals(visitorName)) id = visitor.getId();
        }

        return Visitor.visitorFinder.byId(id);
    }

}