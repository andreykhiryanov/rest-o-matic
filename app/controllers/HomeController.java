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
        Restaurant astoria = new Restaurant("Astoria", "ZAO GK Astoria", 783801001, "Bolshaya Morskaya, 39");
        Restaurant legran = new Restaurant("Legran", "OOO Legran", 784101001, "Millionnaya, 4/1");
        Restaurant gollandec = new Restaurant("Letuchiy Gollandec", "OOO Letuchiy Gollandec", 780101001, "Maliy, 63");

        Visitor zitella = new Visitor("Zitella", "Menendes", "zmenendes0@bing.com", "239-924-2788");
        Visitor nico = new Visitor("Nico", "Drivers", "ndrivers0@buzzfeed.com", "693-566-8984");
        Visitor roderich = new Visitor("Roderich", "Caulton", "rcaulton1@tripadvisor.com", "191-729-0261");
        Visitor deana = new Visitor("Deana", "Rodder", "drodder2@smugmug.com", "184-853-9441");
        Visitor shelby = new Visitor("Shelby", "Gori", "sgori3@blogspot.com", "365-555-8407");
        Visitor myron = new Visitor("Myron", "Zannuto", "mzannuto4@usatoday.com", "233-524-4742");

//        astoria.getAcceptedVisitors().add(zitella);
//        astoria.getAcceptedVisitors().add(nico);
//        astoria.getAcceptedVisitors().add(roderich);
//        astoria.getAcceptedVisitors().add(deana);
//        astoria.getAcceptedVisitors().add(shelby);
//        astoria.getAcceptedVisitors().add(myron);
//
//        zitella.getVisitedRestaurants().add(astoria);
//        nico.getVisitedRestaurants().add(astoria);
//        roderich.getVisitedRestaurants().add(astoria);
//        deana.getVisitedRestaurants().add(astoria);
//        shelby.getVisitedRestaurants().add(astoria);
//        myron.getVisitedRestaurants().add(astoria);

        astoria.save();
        legran.save();
        gollandec.save();

        zitella.save();
        nico.save();
        roderich.save();
        deana.save();
        shelby.save();
        myron.save();
    }

}