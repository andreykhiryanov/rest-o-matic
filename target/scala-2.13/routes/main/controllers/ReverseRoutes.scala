// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Thu Dec 05 12:55:37 GMT+03:00 2019

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

  
    // @LINE:12
    def saveChanges(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:13
    def destroy(restaurantName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("restaurantName", restaurantName)))
    }
  
    // @LINE:8
    def show(restaurantName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("restaurantName", restaurantName)))
    }
  
    // @LINE:10
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/edit")
    }
  
    // @LINE:11
    def createRestaurant(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:5
    def greetings(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def editRestaurant(restaurantName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("restaurantName", restaurantName)))
    }
  
  }


}
