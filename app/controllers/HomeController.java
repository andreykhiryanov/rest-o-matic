package controllers;

import models.Manager;
import models.Restaurant;
import models.Visitor;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.index;

import javax.inject.Inject;
import java.util.List;

public class HomeController extends Controller {

    private boolean firstRun = true;

    private Manager manager = Manager.getManager();

    @Inject
    FormFactory formFactory;

    public Result greetings() {

        // Getting all restaurants from the data base.
        List<Restaurant> restaurants = Restaurant.restaurantFinder.all();
        // Getting all visitors from the data base.
        List<Visitor> visitors = Visitor.visitorFinder.all();

        return ok(index.render(restaurants, visitors));
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

        // Filling up the data base
        manager.putDataToDb();

        // Cleaning up our collections.
        for (Visitor visitor : manager.getAllVisitors()) {
            manager.getAllVisitors().remove(visitor);
        }
        for (Restaurant restaurant : manager.getAllRestaurants()) {
            manager.getAllRestaurants().remove(restaurant);
        }

        // Filling up our collections from the data base.
        manager.getDataFromDb();
    }

}