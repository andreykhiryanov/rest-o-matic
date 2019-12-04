// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Wed Dec 04 17:11:04 GMT+03:00 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def greetings(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:6
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
  }


}
