package controllers;

import models.Restaurant;
import models.Visitor;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.index;
import java.util.List;

public class HomeController extends Controller {

    public Result greetings() {

        // Filling up our database.
//        addDataToDb();

        // Getting all restaurants from the data base.
        List<Restaurant> restaurants = Restaurant.restaurantFinder.all();
        // Getting all visitors from the data base.
        List<Visitor> visitors = Visitor.visitorFinder.all();

        return ok(index.render(restaurants, visitors));
    }

    private void addDataToDb() {
        new Restaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39").save();
        new Restaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1").save();
        new Restaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63").save();

        new Visitor("Zitella", "Menendes", "zmenendes0@bing.com", "239-924-2788").save();
        new Visitor("Nico", "Drivers", "ndrivers0@buzzfeed.com", "693-566-8984").save();
        new Visitor("Roderich", "Caulton", "rcaulton1@tripadvisor.com", "191-729-0261").save();
        new Visitor("Deana", "Rodder", "drodder2@smugmug.com", "184-853-9441").save();
        new Visitor("Shelby", "Gori", "sgori3@blogspot.com", "365-555-8407").save();
        new Visitor("Myron", "Zannuto", "mzannuto4@usatoday.com", "233-524-4742").save();
    }

}