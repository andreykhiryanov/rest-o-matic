// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Fri Dec 13 12:45:05 GMT+03:00 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:7
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def destroyRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.destroyRestaurant",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:22
    def kickVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.kickVisitor",
      """
        function(restaurantName0,visitorName1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kick/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName1))})
        }
      """
    )
  
    // @LINE:7
    def showRestaurantCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.showRestaurantCard",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:9
    def updateRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updateRestaurant",
      """
        function(restaurantName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:10
    def createRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.createRestaurant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:21
    def acceptVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.acceptVisitor",
      """
        function(restaurantName0,visitorName1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accept/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName1))})
        }
      """
    )
  
    // @LINE:11
    def saveRestaurantChanges: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.saveRestaurantChanges",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:8
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

  // @LINE:14
  class ReverseVisitorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def saveVisitorChanges: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.saveVisitorChanges",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/create/"})
        }
      """
    )
  
    // @LINE:17
    def createVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.createVisitor",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/create/"})
        }
      """
    )
  
    // @LINE:14
    def showVisitorCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.showVisitorCard",
      """
        function(visitorName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
    // @LINE:19
    def destroyVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.destroyVisitor",
      """
        function(visitorName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
    // @LINE:16
    def updateVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.updateVisitor",
      """
        function(visitorName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
    // @LINE:15
    def editVisitor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitorController.editVisitor",
      """
        function(visitorName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visitor/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("visitorName", visitorName0))})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
