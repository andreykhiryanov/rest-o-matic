// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Wed Dec 04 19:01:30 GMT+03:00 2019

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

  
    // @LINE:9
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.edit",
      """
        function(restaurantName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("restaurantName", restaurantName0))})
        }
      """
    )
  
    // @LINE:11
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
        }
      """
    )
  
    // @LINE:8
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.destroy",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/create/"})
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


}
