// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Mon Dec 09 20:26:49 GMT+03:00 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:8
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def destroyRestaurant(restaurantName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("restaurantName", restaurantName)))
    }
  
    // @LINE:8
    def showRestaurantCard(restaurantName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("restaurantName", restaurantName)))
    }
  
    // @LINE:11
    def createRestaurant(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:12
    def saveRestaurantChanges(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:10
    def updateRestaurant(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/edit")
    }
  
    // @LINE:9
    def editRestaurant(restaurantName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("restaurantName", restaurantName)))
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def greetings(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseVisitorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def saveVisitorChanges(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "visitor/create/")
    }
  
    // @LINE:18
    def createVisitor(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/create/")
    }
  
    // @LINE:15
    def showVisitorCard(visitorName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("visitorName", visitorName)))
    }
  
    // @LINE:20
    def destroyVisitor(visitorName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("visitorName", visitorName)))
    }
  
    // @LINE:16
    def editVisitor(visitorName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("visitorName", visitorName)))
    }
  
    // @LINE:17
    def updateVisitor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "visitor/edit")
    }
  
  }


}
