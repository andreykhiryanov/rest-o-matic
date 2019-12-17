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
                return redirect(routes.HomeController.showError("A restaurant with this INN already exists!"));
            }
        }

        newRestaurant.setId((long) (Math.random()*10000));
        newRestaurant.save();

        return redirect(routes.HomeController.greetings());

    }

    public Result editRestaurant(Long restaurantId) {
        // Searching requested restaurant
        Restaurant restaurant = Restaurant.restaurantFinder.byId(restaurantId);

        if (restaurant == null) {
            return redirect(routes.HomeController.showError("Editing error!"));
        }

        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).fill(restaurant);
        return ok(editrestaurant.render(restaurantForm, restaurantId));

    }

    public Result updateRestaurant(Long oldRestaurantId) {
        // TODO: remove deprecated method bindFromRequest
        Form<Restaurant> restaurantForm = formFactory.form(Restaurant.class).bindFromRequest();

        if (restaurantForm.hasErrors()) {
            return redirect(routes.HomeController.showError("Updating error!"));
        }

        Restaurant updatedRestaurant = restaurantForm.get();
        Restaurant oldRestaurant = Restaurant.restaurantFinder.byId(oldRestaurantId);

        if (oldRestaurant == null) {
            return redirect(routes.HomeController.showError("Updating error!"));
        }

        // Checking the uniqueness of the INN.
        if (updatedRestaurant.getInn() != oldRestaurant.getInn()) {
            for (Restaurant existingRestaurant : Restaurant.restaurantFinder.all()) {
                if (existingRestaurant.getInn() == updatedRestaurant.getInn()) {
                    return redirect(routes.HomeController.showError("A restaurant with this INN already exists!"));
                }
            }
        }

        oldRestaurant.setRestaurantName(updatedRestaurant.getRestaurantName());
        oldRestaurant.setLegalName(updatedRestaurant.getLegalName());
        oldRestaurant.setInn(updatedRestaurant.getInn());
        oldRestaurant.setAddress(updatedRestaurant.getAddress());

        oldRestaurant.update();

        return redirect(routes.RestaurantController.showRestaurantCard(updatedRestaurant.getId()));
    }

    public Result destroyRestaurant(Long restaurantId) {

        Restaurant destroyingRestaurant = Restaurant.restaurantFinder.byId(restaurantId);

        if (destroyingRestaurant == null) {
            return redirect(routes.HomeController.showError("Deleting error!"));
        }

        destroyingRestaurant.delete();

        return redirect(routes.HomeController.greetings());
    }

    public Result showRestaurantCard(Long restaurantId) {
        // Searching requested restaurant
        Restaurant restaurant = Restaurant.restaurantFinder.byId(restaurantId);

        if (restaurant == null) {
            return redirect(routes.HomeController.showError("Restaurant not found!"));
        }

        List<Visitor> newVisitors = Visitor.visitorFinder.all();
        newVisitors.removeAll(restaurant.getAcceptedVisitors());

        // Passing in the form of a restaurant and a list of all visitors.
        return ok(restaurantcard.render(restaurant, newVisitors));
    }

    public Result acceptVisitor(Long restaurantId, Long visitorId) {

        Restaurant restaurant = Restaurant.restaurantFinder.byId(restaurantId);
        Visitor visitor = Visitor.visitorFinder.byId(visitorId);

        if (restaurant == null || visitor == null) {
            return redirect(routes.HomeController.showError("Accept error!"));
        }

        restaurant.getAcceptedVisitors().add(visitor);
        restaurant.update();
        visitor.update();

        return ok();
    }

    public Result kickVisitor(Long restaurantId, Long visitorId) {

        Restaurant restaurant = Restaurant.restaurantFinder.byId(restaurantId);
        Visitor visitor = Visitor.visitorFinder.byId(visitorId);

        if (restaurant == null || visitor == null) {
            return redirect(routes.HomeController.showError("Kicking error!"));
        }

        restaurant.getAcceptedVisitors().remove(visitor);
        restaurant.update();
        visitor.update();

        return ok();
    }
}