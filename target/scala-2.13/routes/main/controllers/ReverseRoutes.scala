// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Tue Dec 17 21:05:26 GMT+03:00 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:7
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def editRestaurant(restaurantId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("restaurantId", restaurantId)))
    }
  
    // @LINE:21
    def acceptVisitor(restaurantId:Long, visitorId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "accept/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("restaurantId", restaurantId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("visitorId", visitorId)))
    }
  
    // @LINE:22
    def kickVisitor(restaurantId:Long, visitorId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kick/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("restaurantId", restaurantId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("visitorId", visitorId)))
    }
  
    // @LINE:7
    def showRestaurantCard(restaurantId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("restaurantId", restaurantId)))
    }
  
    // @LINE:12
    def destroyRestaurant(restaurantId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "restaurant/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("restaurantId", restaurantId)))
    }
  
    // @LINE:9
    def updateRestaurant(restaurantId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("restaurantId", restaurantId)))
    }
  
    // @LINE:10
    def createRestaurant(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:11
    def saveRestaurantChanges(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def showError(message:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "error" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("message", message)))))
    }
  
    // @LINE:5
    def greetings(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseVisitorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def saveVisitorChanges(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "visitor/create/")
    }
  
    // @LINE:17
    def createVisitor(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/create/")
    }
  
    // @LINE:14
    def showVisitorCard(visitorId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("visitorId", visitorId)))
    }
  
    // @LINE:15
    def editVisitor(visitorId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "visitor/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("visitorId", visitorId)))
    }
  
    // @LINE:19
    def destroyVisitor(visitorId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "visitor/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("visitorId", visitorId)))
    }
  
    // @LINE:16
    def updateVisitor(visitorId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "visitor/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("visitorId", visitorId)))
    }
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
