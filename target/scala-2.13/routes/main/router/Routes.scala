// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Thu Dec 12 23:54:16 GMT+03:00 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_2: controllers.HomeController,
  // @LINE:7
  RestaurantController_3: controllers.RestaurantController,
  // @LINE:14
  VisitorController_1: controllers.VisitorController,
  // @LINE:25
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_2: controllers.HomeController,
    // @LINE:7
    RestaurantController_3: controllers.RestaurantController,
    // @LINE:14
    VisitorController_1: controllers.VisitorController,
    // @LINE:25
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_2, RestaurantController_3, VisitorController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, RestaurantController_3, VisitorController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.greetings()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """restaurantName<[^/]+>""", """controllers.RestaurantController.showRestaurantCard(restaurantName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/edit/""" + "$" + """restaurantName<[^/]+>""", """controllers.RestaurantController.editRestaurant(restaurantName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/edit""", """controllers.RestaurantController.updateRestaurant()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create/""", """controllers.RestaurantController.createRestaurant()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create/""", """controllers.RestaurantController.saveRestaurantChanges()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/delete/""" + "$" + """restaurantName<[^/]+>""", """controllers.RestaurantController.destroyRestaurant(restaurantName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/""" + "$" + """visitorName<[^/]+>""", """controllers.VisitorController.showVisitorCard(visitorName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit/""" + "$" + """visitorName<[^/]+>""", """controllers.VisitorController.editVisitor(visitorName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit""", """controllers.VisitorController.updateVisitor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.VisitorController.createVisitor()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.VisitorController.saveVisitorChanges()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/delete/""" + "$" + """visitorName<[^/]+>""", """controllers.VisitorController.destroyVisitor(visitorName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accept/""" + "$" + """restaurantName<[^/]+>/""" + "$" + """visitorName<[^/]+>""", """controllers.RestaurantController.acceptVisitor(restaurantName:String, visitorName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kick/""" + "$" + """restaurantName<[^/]+>/""" + "$" + """visitorName<[^/]+>""", """controllers.RestaurantController.kickVisitor(restaurantName:String, visitorName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_greetings0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_greetings0_invoker = createInvoker(
    HomeController_2.greetings(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "greetings",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_RestaurantController_showRestaurantCard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_showRestaurantCard1_invoker = createInvoker(
    RestaurantController_3.showRestaurantCard(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "showRestaurantCard",
      Seq(classOf[String]),
      "GET",
      this.prefix + """restaurant/""" + "$" + """restaurantName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_RestaurantController_editRestaurant2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_editRestaurant2_invoker = createInvoker(
    RestaurantController_3.editRestaurant(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "editRestaurant",
      Seq(classOf[String]),
      "GET",
      this.prefix + """restaurant/edit/""" + "$" + """restaurantName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_RestaurantController_updateRestaurant3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit")))
  )
  private[this] lazy val controllers_RestaurantController_updateRestaurant3_invoker = createInvoker(
    RestaurantController_3.updateRestaurant(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "updateRestaurant",
      Nil,
      "POST",
      this.prefix + """restaurant/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RestaurantController_createRestaurant4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create/")))
  )
  private[this] lazy val controllers_RestaurantController_createRestaurant4_invoker = createInvoker(
    RestaurantController_3.createRestaurant(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "createRestaurant",
      Nil,
      "GET",
      this.prefix + """restaurant/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_RestaurantController_saveRestaurantChanges5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create/")))
  )
  private[this] lazy val controllers_RestaurantController_saveRestaurantChanges5_invoker = createInvoker(
    RestaurantController_3.saveRestaurantChanges(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "saveRestaurantChanges",
      Nil,
      "POST",
      this.prefix + """restaurant/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RestaurantController_destroyRestaurant6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/delete/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_destroyRestaurant6_invoker = createInvoker(
    RestaurantController_3.destroyRestaurant(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "destroyRestaurant",
      Seq(classOf[String]),
      "GET",
      this.prefix + """restaurant/delete/""" + "$" + """restaurantName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_VisitorController_showVisitorCard7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_showVisitorCard7_invoker = createInvoker(
    VisitorController_1.showVisitorCard(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "showVisitorCard",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visitor/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_VisitorController_editVisitor8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_editVisitor8_invoker = createInvoker(
    VisitorController_1.editVisitor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "editVisitor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visitor/edit/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_VisitorController_updateVisitor9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit")))
  )
  private[this] lazy val controllers_VisitorController_updateVisitor9_invoker = createInvoker(
    VisitorController_1.updateVisitor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "updateVisitor",
      Nil,
      "POST",
      this.prefix + """visitor/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_VisitorController_createVisitor10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/create/")))
  )
  private[this] lazy val controllers_VisitorController_createVisitor10_invoker = createInvoker(
    VisitorController_1.createVisitor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "createVisitor",
      Nil,
      "GET",
      this.prefix + """visitor/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_VisitorController_saveVisitorChanges11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/create/")))
  )
  private[this] lazy val controllers_VisitorController_saveVisitorChanges11_invoker = createInvoker(
    VisitorController_1.saveVisitorChanges(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "saveVisitorChanges",
      Nil,
      "POST",
      this.prefix + """visitor/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_VisitorController_destroyVisitor12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/delete/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_destroyVisitor12_invoker = createInvoker(
    VisitorController_1.destroyVisitor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "destroyVisitor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visitor/delete/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RestaurantController_acceptVisitor13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accept/"), DynamicPart("restaurantName", """[^/]+""",true), StaticPart("/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_acceptVisitor13_invoker = createInvoker(
    RestaurantController_3.acceptVisitor(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "acceptVisitor",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """accept/""" + "$" + """restaurantName<[^/]+>/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RestaurantController_kickVisitor14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kick/"), DynamicPart("restaurantName", """[^/]+""",true), StaticPart("/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_kickVisitor14_invoker = createInvoker(
    RestaurantController_3.kickVisitor(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "kickVisitor",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """kick/""" + "$" + """restaurantName<[^/]+>/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_greetings0_route(params@_) =>
      call { 
        controllers_HomeController_greetings0_invoker.call(HomeController_2.greetings())
      }
  
    // @LINE:7
    case controllers_RestaurantController_showRestaurantCard1_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_RestaurantController_showRestaurantCard1_invoker.call(RestaurantController_3.showRestaurantCard(restaurantName))
      }
  
    // @LINE:8
    case controllers_RestaurantController_editRestaurant2_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_RestaurantController_editRestaurant2_invoker.call(RestaurantController_3.editRestaurant(restaurantName))
      }
  
    // @LINE:9
    case controllers_RestaurantController_updateRestaurant3_route(params@_) =>
      call { 
        controllers_RestaurantController_updateRestaurant3_invoker.call(RestaurantController_3.updateRestaurant())
      }
  
    // @LINE:10
    case controllers_RestaurantController_createRestaurant4_route(params@_) =>
      call { 
        controllers_RestaurantController_createRestaurant4_invoker.call(RestaurantController_3.createRestaurant())
      }
  
    // @LINE:11
    case controllers_RestaurantController_saveRestaurantChanges5_route(params@_) =>
      call { 
        controllers_RestaurantController_saveRestaurantChanges5_invoker.call(RestaurantController_3.saveRestaurantChanges())
      }
  
    // @LINE:12
    case controllers_RestaurantController_destroyRestaurant6_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_RestaurantController_destroyRestaurant6_invoker.call(RestaurantController_3.destroyRestaurant(restaurantName))
      }
  
    // @LINE:14
    case controllers_VisitorController_showVisitorCard7_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_VisitorController_showVisitorCard7_invoker.call(VisitorController_1.showVisitorCard(visitorName))
      }
  
    // @LINE:15
    case controllers_VisitorController_editVisitor8_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_VisitorController_editVisitor8_invoker.call(VisitorController_1.editVisitor(visitorName))
      }
  
    // @LINE:16
    case controllers_VisitorController_updateVisitor9_route(params@_) =>
      call { 
        controllers_VisitorController_updateVisitor9_invoker.call(VisitorController_1.updateVisitor())
      }
  
    // @LINE:17
    case controllers_VisitorController_createVisitor10_route(params@_) =>
      call { 
        controllers_VisitorController_createVisitor10_invoker.call(VisitorController_1.createVisitor())
      }
  
    // @LINE:18
    case controllers_VisitorController_saveVisitorChanges11_route(params@_) =>
      call { 
        controllers_VisitorController_saveVisitorChanges11_invoker.call(VisitorController_1.saveVisitorChanges())
      }
  
    // @LINE:19
    case controllers_VisitorController_destroyVisitor12_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_VisitorController_destroyVisitor12_invoker.call(VisitorController_1.destroyVisitor(visitorName))
      }
  
    // @LINE:21
    case controllers_RestaurantController_acceptVisitor13_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None), params.fromPath[String]("visitorName", None)) { (restaurantName, visitorName) =>
        controllers_RestaurantController_acceptVisitor13_invoker.call(RestaurantController_3.acceptVisitor(restaurantName, visitorName))
      }
  
    // @LINE:22
    case controllers_RestaurantController_kickVisitor14_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None), params.fromPath[String]("visitorName", None)) { (restaurantName, visitorName) =>
        controllers_RestaurantController_kickVisitor14_invoker.call(RestaurantController_3.kickVisitor(restaurantName, visitorName))
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
