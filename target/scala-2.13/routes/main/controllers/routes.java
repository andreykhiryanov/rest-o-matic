// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Mon Dec 09 20:26:49 GMT+03:00 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRestaurantController RestaurantController = new controllers.ReverseRestaurantController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseVisitorController VisitorController = new controllers.ReverseVisitorController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRestaurantController RestaurantController = new controllers.javascript.ReverseRestaurantController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseVisitorController VisitorController = new controllers.javascript.ReverseVisitorController(RoutesPrefix.byNamePrefix());
  }

}
