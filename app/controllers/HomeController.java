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

    private boolean firstRun = true;

    private Manager manager = Manager.getManager();

    @Inject
    FormFactory formFactory;

    public Result greetings() {

        // Fill in the test data only once.
        if (firstRun) {
            fillTestData();
            firstRun = false;
        }

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

        return redirect(routes.HomeController.showRestaurantCard(restaurant.getRestaurantName()));
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

    // Visitors' actions

    public Result createVisitor() {
        Form<Visitor> visitorForm = formFactory.form(Visitor.class);
        return ok(createvisitor.render(visitorForm));
    }

    public Result saveVisitorChanges() {

        // Getting created visitor from the previous form.
        // TODO: remove deprecated method bindFromRequest
        Form<Visitor> visitorForm = formFactory.form(Visitor.class).bindFromRequest();

        // Transferring new restaurant to the manager for storage in the collection.
        manager.addNewVisitor(visitorForm.get());

        return redirect(routes.HomeController.greetings());
    }

    public Result showVisitorCard(String visitorName) {

        Visitor visitor = manager.getVisitorByName(visitorName);

        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        return ok(visitorcard.render(visitor));

    }

    public Result editVisitor(String visitorName) {

        // Searching requested restaurant
        Visitor visitor = manager.getVisitorByName(visitorName);

        // If the requested restaurant was not found, the method 'getRestaurantByName' returns null.
        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        Form<Visitor> visitorForm = formFactory.form(Visitor.class).fill(visitor);
        return ok(editvisitor.render(visitorForm));

    }

    public Result updateVisitor() {

        Visitor visitor = formFactory.form(Visitor.class).bindFromRequest().get();
        Visitor oldVisitor = manager.getVisitorByName(visitor.getFirstName());

        if (oldVisitor == null) {
            return notFound("You cannot change the name of the visitor yet!");
        }

        oldVisitor.setFirstName(visitor.getFirstName());
        oldVisitor.setLastName(visitor.getLastName());
        oldVisitor.setEmail(visitor.getEmail());
        oldVisitor.setPhoneNumber(visitor.getPhoneNumber());

        return redirect(routes.HomeController.showVisitorCard(visitor.getFirstName()));
    }

    public Result destroyVisitor(String visitorName) {

        Visitor destroyingVisitor = manager.getVisitorByName(visitorName);

        for (Restaurant restaurant : manager.getAllRestaurants()) {
            restaurant.getAcceptedVisitors().remove(destroyingVisitor);
        }

        manager.getAllVisitors().remove(destroyingVisitor);

        return redirect(routes.HomeController.greetings());
    }

}