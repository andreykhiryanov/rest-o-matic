// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Wed Dec 04 14:11:48 GMT+03:00 2019

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
