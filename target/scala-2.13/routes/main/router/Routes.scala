// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Mon Dec 09 19:50:21 GMT+03:00 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, HomeController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.greetings()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """restaurantName<[^/]+>""", """controllers.HomeController.showRestaurantCard(restaurantName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/edit/""" + "$" + """restaurantName<[^/]+>""", """controllers.HomeController.editRestaurant(restaurantName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/edit""", """controllers.HomeController.updateRestaurant()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create/""", """controllers.HomeController.createRestaurant()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create/""", """controllers.HomeController.saveRestaurantChanges()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/delete/""" + "$" + """restaurantName<[^/]+>""", """controllers.HomeController.destroyRestaurant(restaurantName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/""" + "$" + """visitorName<[^/]+>""", """controllers.HomeController.showVisitorCard(visitorName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit/""" + "$" + """visitorName<[^/]+>""", """controllers.HomeController.editVisitor(visitorName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit""", """controllers.HomeController.updateVisitor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.HomeController.createVisitor()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.HomeController.saveVisitorChanges()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/delete/""" + "$" + """visitorName<[^/]+>""", """controllers.HomeController.destroyVisitor(visitorName:String)"""),
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
    HomeController_0.greetings(),
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_showRestaurantCard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_showRestaurantCard1_invoker = createInvoker(
    HomeController_0.showRestaurantCard(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showRestaurantCard",
      Seq(classOf[String]),
      "GET",
      this.prefix + """restaurant/""" + "$" + """restaurantName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_editRestaurant2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_editRestaurant2_invoker = createInvoker(
    HomeController_0.editRestaurant(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editRestaurant",
      Seq(classOf[String]),
      "GET",
      this.prefix + """restaurant/edit/""" + "$" + """restaurantName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_updateRestaurant3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit")))
  )
  private[this] lazy val controllers_HomeController_updateRestaurant3_invoker = createInvoker(
    HomeController_0.updateRestaurant(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateRestaurant",
      Nil,
      "POST",
      this.prefix + """restaurant/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_createRestaurant4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create/")))
  )
  private[this] lazy val controllers_HomeController_createRestaurant4_invoker = createInvoker(
    HomeController_0.createRestaurant(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createRestaurant",
      Nil,
      "GET",
      this.prefix + """restaurant/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_saveRestaurantChanges5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create/")))
  )
  private[this] lazy val controllers_HomeController_saveRestaurantChanges5_invoker = createInvoker(
    HomeController_0.saveRestaurantChanges(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "saveRestaurantChanges",
      Nil,
      "POST",
      this.prefix + """restaurant/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_destroyRestaurant6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/delete/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_destroyRestaurant6_invoker = createInvoker(
    HomeController_0.destroyRestaurant(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "destroyRestaurant",
      Seq(classOf[String]),
      "GET",
      this.prefix + """restaurant/delete/""" + "$" + """restaurantName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_showVisitorCard7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_showVisitorCard7_invoker = createInvoker(
    HomeController_0.showVisitorCard(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showVisitorCard",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visitor/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_editVisitor8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_editVisitor8_invoker = createInvoker(
    HomeController_0.editVisitor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editVisitor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visitor/edit/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_updateVisitor9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit")))
  )
  private[this] lazy val controllers_HomeController_updateVisitor9_invoker = createInvoker(
    HomeController_0.updateVisitor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateVisitor",
      Nil,
      "POST",
      this.prefix + """visitor/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_createVisitor10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/create/")))
  )
  private[this] lazy val controllers_HomeController_createVisitor10_invoker = createInvoker(
    HomeController_0.createVisitor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createVisitor",
      Nil,
      "GET",
      this.prefix + """visitor/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_saveVisitorChanges11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/create/")))
  )
  private[this] lazy val controllers_HomeController_saveVisitorChanges11_invoker = createInvoker(
    HomeController_0.saveVisitorChanges(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "saveVisitorChanges",
      Nil,
      "POST",
      this.prefix + """visitor/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_destroyVisitor12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/delete/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_destroyVisitor12_invoker = createInvoker(
    HomeController_0.destroyVisitor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "destroyVisitor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """visitor/delete/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_greetings0_route(params@_) =>
      call { 
        controllers_HomeController_greetings0_invoker.call(HomeController_0.greetings())
      }
  
    // @LINE:8
    case controllers_HomeController_showRestaurantCard1_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_HomeController_showRestaurantCard1_invoker.call(HomeController_0.showRestaurantCard(restaurantName))
      }
  
    // @LINE:9
    case controllers_HomeController_editRestaurant2_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_HomeController_editRestaurant2_invoker.call(HomeController_0.editRestaurant(restaurantName))
      }
  
    // @LINE:10
    case controllers_HomeController_updateRestaurant3_route(params@_) =>
      call { 
        controllers_HomeController_updateRestaurant3_invoker.call(HomeController_0.updateRestaurant())
      }
  
    // @LINE:11
    case controllers_HomeController_createRestaurant4_route(params@_) =>
      call { 
        controllers_HomeController_createRestaurant4_invoker.call(HomeController_0.createRestaurant())
      }
  
    // @LINE:12
    case controllers_HomeController_saveRestaurantChanges5_route(params@_) =>
      call { 
        controllers_HomeController_saveRestaurantChanges5_invoker.call(HomeController_0.saveRestaurantChanges())
      }
  
    // @LINE:13
    case controllers_HomeController_destroyRestaurant6_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_HomeController_destroyRestaurant6_invoker.call(HomeController_0.destroyRestaurant(restaurantName))
      }
  
    // @LINE:15
    case controllers_HomeController_showVisitorCard7_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_HomeController_showVisitorCard7_invoker.call(HomeController_0.showVisitorCard(visitorName))
      }
  
    // @LINE:16
    case controllers_HomeController_editVisitor8_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_HomeController_editVisitor8_invoker.call(HomeController_0.editVisitor(visitorName))
      }
  
    // @LINE:17
    case controllers_HomeController_updateVisitor9_route(params@_) =>
      call { 
        controllers_HomeController_updateVisitor9_invoker.call(HomeController_0.updateVisitor())
      }
  
    // @LINE:18
    case controllers_HomeController_createVisitor10_route(params@_) =>
      call { 
        controllers_HomeController_createVisitor10_invoker.call(HomeController_0.createVisitor())
      }
  
    // @LINE:19
    case controllers_HomeController_saveVisitorChanges11_route(params@_) =>
      call { 
        controllers_HomeController_saveVisitorChanges11_invoker.call(HomeController_0.saveVisitorChanges())
      }
  
    // @LINE:20
    case controllers_HomeController_destroyVisitor12_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_HomeController_destroyVisitor12_invoker.call(HomeController_0.destroyVisitor(visitorName))
      }
  }
}
