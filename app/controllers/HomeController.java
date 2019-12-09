package controllers;

import entities.Restaurant;
import entities.Visitor;
import models.Manager;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.index;

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

}