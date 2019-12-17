// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Tue Dec 17 21:05:26 GMT+03:00 2019

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
  // @LINE:27
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
    // @LINE:27
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """restaurantId<[^/]+>""", """controllers.RestaurantController.showRestaurantCard(restaurantId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/edit/""" + "$" + """restaurantId<[^/]+>""", """controllers.RestaurantController.editRestaurant(restaurantId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/update/""" + "$" + """restaurantId<[^/]+>""", """controllers.RestaurantController.updateRestaurant(restaurantId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create/""", """controllers.RestaurantController.createRestaurant()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create/""", """controllers.RestaurantController.saveRestaurantChanges()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/delete/""" + "$" + """restaurantId<[^/]+>""", """controllers.RestaurantController.destroyRestaurant(restaurantId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/""" + "$" + """visitorId<[^/]+>""", """controllers.VisitorController.showVisitorCard(visitorId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit/""" + "$" + """visitorId<[^/]+>""", """controllers.VisitorController.editVisitor(visitorId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/update/""" + "$" + """visitorId<[^/]+>""", """controllers.VisitorController.updateVisitor(visitorId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.VisitorController.createVisitor()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.VisitorController.saveVisitorChanges()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/delete/""" + "$" + """visitorId<[^/]+>""", """controllers.VisitorController.destroyVisitor(visitorId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accept/""" + "$" + """restaurantId<[^/]+>/""" + "$" + """visitorId<[^/]+>""", """controllers.RestaurantController.acceptVisitor(restaurantId:Long, visitorId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kick/""" + "$" + """restaurantId<[^/]+>/""" + "$" + """visitorId<[^/]+>""", """controllers.RestaurantController.kickVisitor(restaurantId:Long, visitorId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error""", """controllers.HomeController.showError(message:String)"""),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("restaurantId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_showRestaurantCard1_invoker = createInvoker(
    RestaurantController_3.showRestaurantCard(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "showRestaurantCard",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """restaurant/""" + "$" + """restaurantId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_RestaurantController_editRestaurant2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit/"), DynamicPart("restaurantId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_editRestaurant2_invoker = createInvoker(
    RestaurantController_3.editRestaurant(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "editRestaurant",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """restaurant/edit/""" + "$" + """restaurantId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_RestaurantController_updateRestaurant3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/update/"), DynamicPart("restaurantId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_updateRestaurant3_invoker = createInvoker(
    RestaurantController_3.updateRestaurant(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "updateRestaurant",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """restaurant/update/""" + "$" + """restaurantId<[^/]+>""",
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
  private[this] lazy val controllers_RestaurantController_destroyRestaurant6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/delete/"), DynamicPart("restaurantId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_destroyRestaurant6_invoker = createInvoker(
    RestaurantController_3.destroyRestaurant(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "destroyRestaurant",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """restaurant/delete/""" + "$" + """restaurantId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_VisitorController_showVisitorCard7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/"), DynamicPart("visitorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_showVisitorCard7_invoker = createInvoker(
    VisitorController_1.showVisitorCard(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "showVisitorCard",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """visitor/""" + "$" + """visitorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_VisitorController_editVisitor8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit/"), DynamicPart("visitorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_editVisitor8_invoker = createInvoker(
    VisitorController_1.editVisitor(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "editVisitor",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """visitor/edit/""" + "$" + """visitorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_VisitorController_updateVisitor9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/update/"), DynamicPart("visitorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_updateVisitor9_invoker = createInvoker(
    VisitorController_1.updateVisitor(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "updateVisitor",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """visitor/update/""" + "$" + """visitorId<[^/]+>""",
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
  private[this] lazy val controllers_VisitorController_destroyVisitor12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/delete/"), DynamicPart("visitorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_destroyVisitor12_invoker = createInvoker(
    VisitorController_1.destroyVisitor(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitorController",
      "destroyVisitor",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """visitor/delete/""" + "$" + """visitorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RestaurantController_acceptVisitor13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accept/"), DynamicPart("restaurantId", """[^/]+""",true), StaticPart("/"), DynamicPart("visitorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_acceptVisitor13_invoker = createInvoker(
    RestaurantController_3.acceptVisitor(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "acceptVisitor",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """accept/""" + "$" + """restaurantId<[^/]+>/""" + "$" + """visitorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RestaurantController_kickVisitor14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kick/"), DynamicPart("restaurantId", """[^/]+""",true), StaticPart("/"), DynamicPart("visitorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_kickVisitor14_invoker = createInvoker(
    RestaurantController_3.kickVisitor(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "kickVisitor",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """kick/""" + "$" + """restaurantId<[^/]+>/""" + "$" + """visitorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_showError15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error")))
  )
  private[this] lazy val controllers_HomeController_showError15_invoker = createInvoker(
    HomeController_2.showError(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showError",
      Seq(classOf[String]),
      "GET",
      this.prefix + """error""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
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
      call(params.fromPath[Long]("restaurantId", None)) { (restaurantId) =>
        controllers_RestaurantController_showRestaurantCard1_invoker.call(RestaurantController_3.showRestaurantCard(restaurantId))
      }
  
    // @LINE:8
    case controllers_RestaurantController_editRestaurant2_route(params@_) =>
      call(params.fromPath[Long]("restaurantId", None)) { (restaurantId) =>
        controllers_RestaurantController_editRestaurant2_invoker.call(RestaurantController_3.editRestaurant(restaurantId))
      }
  
    // @LINE:9
    case controllers_RestaurantController_updateRestaurant3_route(params@_) =>
      call(params.fromPath[Long]("restaurantId", None)) { (restaurantId) =>
        controllers_RestaurantController_updateRestaurant3_invoker.call(RestaurantController_3.updateRestaurant(restaurantId))
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
      call(params.fromPath[Long]("restaurantId", None)) { (restaurantId) =>
        controllers_RestaurantController_destroyRestaurant6_invoker.call(RestaurantController_3.destroyRestaurant(restaurantId))
      }
  
    // @LINE:14
    case controllers_VisitorController_showVisitorCard7_route(params@_) =>
      call(params.fromPath[Long]("visitorId", None)) { (visitorId) =>
        controllers_VisitorController_showVisitorCard7_invoker.call(VisitorController_1.showVisitorCard(visitorId))
      }
  
    // @LINE:15
    case controllers_VisitorController_editVisitor8_route(params@_) =>
      call(params.fromPath[Long]("visitorId", None)) { (visitorId) =>
        controllers_VisitorController_editVisitor8_invoker.call(VisitorController_1.editVisitor(visitorId))
      }
  
    // @LINE:16
    case controllers_VisitorController_updateVisitor9_route(params@_) =>
      call(params.fromPath[Long]("visitorId", None)) { (visitorId) =>
        controllers_VisitorController_updateVisitor9_invoker.call(VisitorController_1.updateVisitor(visitorId))
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
      call(params.fromPath[Long]("visitorId", None)) { (visitorId) =>
        controllers_VisitorController_destroyVisitor12_invoker.call(VisitorController_1.destroyVisitor(visitorId))
      }
  
    // @LINE:21
    case controllers_RestaurantController_acceptVisitor13_route(params@_) =>
      call(params.fromPath[Long]("restaurantId", None), params.fromPath[Long]("visitorId", None)) { (restaurantId, visitorId) =>
        controllers_RestaurantController_acceptVisitor13_invoker.call(RestaurantController_3.acceptVisitor(restaurantId, visitorId))
      }
  
    // @LINE:22
    case controllers_RestaurantController_kickVisitor14_route(params@_) =>
      call(params.fromPath[Long]("restaurantId", None), params.fromPath[Long]("visitorId", None)) { (restaurantId, visitorId) =>
        controllers_RestaurantController_kickVisitor14_invoker.call(RestaurantController_3.kickVisitor(restaurantId, visitorId))
      }
  
    // @LINE:24
    case controllers_HomeController_showError15_route(params@_) =>
      call(params.fromQuery[String]("message", None)) { (message) =>
        controllers_HomeController_showError15_invoker.call(HomeController_2.showError(message))
      }
  
    // @LINE:27
    case controllers_Assets_versioned16_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
