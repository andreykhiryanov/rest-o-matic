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

    private Manager manager = Manager.getManager();

    public Result greetings() {

        // Filling up our database.
//        manager.addDataToDb();

        // Getting all restaurants from the data base.
        List<Restaurant> restaurants = Restaurant.restaurantFinder.all();
        // Getting all visitors from the data base.
        List<Visitor> visitors = Visitor.visitorFinder.all();

        return ok(index.render(restaurants, visitors));
    }

}