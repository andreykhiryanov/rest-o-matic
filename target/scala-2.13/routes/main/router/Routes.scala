// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Mon Dec 09 22:00:37 GMT+03:00 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_1: controllers.HomeController,
  // @LINE:8
  RestaurantController_2: controllers.RestaurantController,
  // @LINE:16
  VisitorController_0: controllers.VisitorController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_1: controllers.HomeController,
    // @LINE:8
    RestaurantController_2: controllers.RestaurantController,
    // @LINE:16
    VisitorController_0: controllers.VisitorController
  ) = this(errorHandler, HomeController_1, RestaurantController_2, VisitorController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, RestaurantController_2, VisitorController_0, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/accept/""" + "$" + """visitorName<[^/]+>""", """controllers.RestaurantController.acceptVisitor(visitorName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/""" + "$" + """visitorName<[^/]+>""", """controllers.VisitorController.showVisitorCard(visitorName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit/""" + "$" + """visitorName<[^/]+>""", """controllers.VisitorController.editVisitor(visitorName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/edit""", """controllers.VisitorController.updateVisitor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.VisitorController.createVisitor()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/create/""", """controllers.VisitorController.saveVisitorChanges()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visitor/delete/""" + "$" + """visitorName<[^/]+>""", """controllers.VisitorController.destroyVisitor(visitorName:String)"""),
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
    HomeController_1.greetings(),
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
  private[this] lazy val controllers_RestaurantController_showRestaurantCard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_showRestaurantCard1_invoker = createInvoker(
    RestaurantController_2.showRestaurantCard(fakeValue[String]),
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

  // @LINE:9
  private[this] lazy val controllers_RestaurantController_editRestaurant2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_editRestaurant2_invoker = createInvoker(
    RestaurantController_2.editRestaurant(fakeValue[String]),
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

  // @LINE:10
  private[this] lazy val controllers_RestaurantController_updateRestaurant3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/edit")))
  )
  private[this] lazy val controllers_RestaurantController_updateRestaurant3_invoker = createInvoker(
    RestaurantController_2.updateRestaurant(),
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

  // @LINE:11
  private[this] lazy val controllers_RestaurantController_createRestaurant4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create/")))
  )
  private[this] lazy val controllers_RestaurantController_createRestaurant4_invoker = createInvoker(
    RestaurantController_2.createRestaurant(),
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

  // @LINE:12
  private[this] lazy val controllers_RestaurantController_saveRestaurantChanges5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create/")))
  )
  private[this] lazy val controllers_RestaurantController_saveRestaurantChanges5_invoker = createInvoker(
    RestaurantController_2.saveRestaurantChanges(),
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

  // @LINE:13
  private[this] lazy val controllers_RestaurantController_destroyRestaurant6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/delete/"), DynamicPart("restaurantName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_destroyRestaurant6_invoker = createInvoker(
    RestaurantController_2.destroyRestaurant(fakeValue[String]),
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
  private[this] lazy val controllers_RestaurantController_acceptVisitor7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/accept/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_acceptVisitor7_invoker = createInvoker(
    RestaurantController_2.acceptVisitor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "acceptVisitor",
      Seq(classOf[String]),
      "POST",
      this.prefix + """restaurant/accept/""" + "$" + """visitorName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_VisitorController_showVisitorCard8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_showVisitorCard8_invoker = createInvoker(
    VisitorController_0.showVisitorCard(fakeValue[String]),
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

  // @LINE:17
  private[this] lazy val controllers_VisitorController_editVisitor9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_editVisitor9_invoker = createInvoker(
    VisitorController_0.editVisitor(fakeValue[String]),
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

  // @LINE:18
  private[this] lazy val controllers_VisitorController_updateVisitor10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/edit")))
  )
  private[this] lazy val controllers_VisitorController_updateVisitor10_invoker = createInvoker(
    VisitorController_0.updateVisitor(),
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

  // @LINE:19
  private[this] lazy val controllers_VisitorController_createVisitor11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/create/")))
  )
  private[this] lazy val controllers_VisitorController_createVisitor11_invoker = createInvoker(
    VisitorController_0.createVisitor(),
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

  // @LINE:20
  private[this] lazy val controllers_VisitorController_saveVisitorChanges12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/create/")))
  )
  private[this] lazy val controllers_VisitorController_saveVisitorChanges12_invoker = createInvoker(
    VisitorController_0.saveVisitorChanges(),
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

  // @LINE:21
  private[this] lazy val controllers_VisitorController_destroyVisitor13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visitor/delete/"), DynamicPart("visitorName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VisitorController_destroyVisitor13_invoker = createInvoker(
    VisitorController_0.destroyVisitor(fakeValue[String]),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_greetings0_route(params@_) =>
      call { 
        controllers_HomeController_greetings0_invoker.call(HomeController_1.greetings())
      }
  
    // @LINE:8
    case controllers_RestaurantController_showRestaurantCard1_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_RestaurantController_showRestaurantCard1_invoker.call(RestaurantController_2.showRestaurantCard(restaurantName))
      }
  
    // @LINE:9
    case controllers_RestaurantController_editRestaurant2_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_RestaurantController_editRestaurant2_invoker.call(RestaurantController_2.editRestaurant(restaurantName))
      }
  
    // @LINE:10
    case controllers_RestaurantController_updateRestaurant3_route(params@_) =>
      call { 
        controllers_RestaurantController_updateRestaurant3_invoker.call(RestaurantController_2.updateRestaurant())
      }
  
    // @LINE:11
    case controllers_RestaurantController_createRestaurant4_route(params@_) =>
      call { 
        controllers_RestaurantController_createRestaurant4_invoker.call(RestaurantController_2.createRestaurant())
      }
  
    // @LINE:12
    case controllers_RestaurantController_saveRestaurantChanges5_route(params@_) =>
      call { 
        controllers_RestaurantController_saveRestaurantChanges5_invoker.call(RestaurantController_2.saveRestaurantChanges())
      }
  
    // @LINE:13
    case controllers_RestaurantController_destroyRestaurant6_route(params@_) =>
      call(params.fromPath[String]("restaurantName", None)) { (restaurantName) =>
        controllers_RestaurantController_destroyRestaurant6_invoker.call(RestaurantController_2.destroyRestaurant(restaurantName))
      }
  
    // @LINE:14
    case controllers_RestaurantController_acceptVisitor7_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_RestaurantController_acceptVisitor7_invoker.call(RestaurantController_2.acceptVisitor(visitorName))
      }
  
    // @LINE:16
    case controllers_VisitorController_showVisitorCard8_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_VisitorController_showVisitorCard8_invoker.call(VisitorController_0.showVisitorCard(visitorName))
      }
  
    // @LINE:17
    case controllers_VisitorController_editVisitor9_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_VisitorController_editVisitor9_invoker.call(VisitorController_0.editVisitor(visitorName))
      }
  
    // @LINE:18
    case controllers_VisitorController_updateVisitor10_route(params@_) =>
      call { 
        controllers_VisitorController_updateVisitor10_invoker.call(VisitorController_0.updateVisitor())
      }
  
    // @LINE:19
    case controllers_VisitorController_createVisitor11_route(params@_) =>
      call { 
        controllers_VisitorController_createVisitor11_invoker.call(VisitorController_0.createVisitor())
      }
  
    // @LINE:20
    case controllers_VisitorController_saveVisitorChanges12_route(params@_) =>
      call { 
        controllers_VisitorController_saveVisitorChanges12_invoker.call(VisitorController_0.saveVisitorChanges())
      }
  
    // @LINE:21
    case controllers_VisitorController_destroyVisitor13_route(params@_) =>
      call(params.fromPath[String]("visitorName", None)) { (visitorName) =>
        controllers_VisitorController_destroyVisitor13_invoker.call(VisitorController_0.destroyVisitor(visitorName))
      }
  }
}
