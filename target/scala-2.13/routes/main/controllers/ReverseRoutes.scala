// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Wed Dec 04 14:56:23 GMT+03:00 2019

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

  
    // @LINE:9
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:8
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:12
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/create/")
    }
  
    // @LINE:10
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/edit")
    }
  
    // @LINE:5
    def greetings(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
