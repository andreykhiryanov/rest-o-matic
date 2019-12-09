
package views.html.home

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import entities.Restaurant
/*2.2*/import entities.Visitor
/*3.2*/import helper._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Set[Restaurant],Set[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(restaurants : Set[Restaurant])(visitors : Set[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.58*/("""

"""),format.raw/*7.1*/("""<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>

        <h1>Welcome to the Rest-o-matic!</h1>

        <input value="New restaurant" type="button" onclick="window.location.href='"""),_display_(/*15.85*/routes/*15.91*/.RestaurantController.createRestaurant()),format.raw/*15.131*/("""'"/> <input value="New visitor" type="button" onclick="window.location.href='"""),_display_(/*15.209*/routes/*15.215*/.VisitorController.createVisitor()),format.raw/*15.249*/("""'"/>
        <br>

        <h2>All restaurants</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Restaurants</th>
            </tr>
            """),_display_(/*24.14*/for(restaurant <- restaurants) yield /*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
                """),format.raw/*25.17*/("""<tr>
                    <td style="text-align:center"><a href=""""),_display_(/*26.61*/routes/*26.67*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*26.137*/("""">"""),_display_(/*26.140*/restaurant/*26.150*/.getRestaurantName),format.raw/*26.168*/("""</a></td>
                </tr>
                """)))}),format.raw/*28.18*/("""
        """),format.raw/*29.9*/("""</table>

        <h2>All visitors</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Visitors</th>
            </tr>
            """),_display_(/*37.14*/for(visitor <- visitors) yield /*37.38*/ {_display_(Seq[Any](format.raw/*37.40*/("""
                """),format.raw/*38.17*/("""<tr>
                    <td style="text-align:center"><a href=""""),_display_(/*39.61*/routes/*39.67*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*39.123*/("""">"""),_display_(/*39.126*/visitor/*39.133*/.getFirstName),format.raw/*39.146*/(""" """),_display_(/*39.148*/visitor/*39.155*/.getLastName),format.raw/*39.167*/("""</a></td>
                </tr>
            """)))}),format.raw/*41.14*/("""
        """),format.raw/*42.9*/("""</table>

    </body>

</html>"""))
      }
    }
  }

  def render(restaurants:Set[Restaurant],visitors:Set[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)(visitors)

  def f:((Set[Restaurant]) => (Set[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => (visitors) => apply(restaurants)(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T20:26:49.763
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 39cc33a20a7c781e5eca06fea3234b6fb995d721
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->136|1484->349|1499->355|1561->395|1667->473|1683->479|1739->513|1987->734|2033->764|2073->766|2119->784|2212->850|2227->856|2319->926|2350->929|2370->939|2410->957|2492->1008|2529->1018|2761->1223|2801->1247|2841->1249|2887->1267|2980->1333|2995->1339|3073->1395|3104->1398|3121->1405|3156->1418|3186->1420|3203->1427|3237->1439|3315->1486|3352->1496
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|46->15|46->15|46->15|46->15|46->15|46->15|55->24|55->24|55->24|56->25|57->26|57->26|57->26|57->26|57->26|57->26|59->28|60->29|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|72->41|73->42
                  -- GENERATED --
              */
          