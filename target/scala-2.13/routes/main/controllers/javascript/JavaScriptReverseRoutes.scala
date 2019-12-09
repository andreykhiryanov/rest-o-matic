// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Mon Dec 09 20:26:49 GMT+03:00 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:8
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def destroyRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.destroyRestaurant",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:8
    def showRestaurantCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.showRestaurantCard",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:11
    def createRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.createRestaurant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:12
    def saveRestaurantChanges: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.saveRestaurantChanges",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:10
    def updateRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updateRestaurant",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/edit"})
        }
      """
    )
  
    // @LINE:9
    def editRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.editRestaurant",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def greetings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.greetings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseVisitorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def saveVisitorChanges: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.saveVisitorChanges",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/create/"})
        }
      """
    )
  
    // @LINE:18
    def createVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.createVisitor",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/create/"})
        }
      """
    )
  
    // @LINE:15
    def showVisitorCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.showVisitorCard",
      """
        function(visitorName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
    // @LINE:20
    def destroyVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.destroyVisitor",
      """
        function(visitorName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
    // @LINE:16
    def editVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.editVisitor",
      """
        function(visitorName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
    // @LINE:17
    def updateVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.updateVisitor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/edit"})
        }
      """
    )
  
  }


}
