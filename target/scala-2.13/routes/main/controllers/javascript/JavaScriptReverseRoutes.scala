// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Thu Dec 05 12:55:37 GMT+03:00 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def saveChanges: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.saveChanges",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:13
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.destroy",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:8
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.show",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:10
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/edit"})
        }
      """
    )
  
    // @LINE:11
    def createRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createRestaurant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:5
    def greetings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.greetings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def editRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editRestaurant",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
  }


}
