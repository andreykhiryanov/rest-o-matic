
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

        <input value="New restaurant" type="button" onclick="window.location.href='"""),_display_(/*15.85*/routes/*15.91*/.HomeController.createRestaurant()),format.raw/*15.125*/("""'"/> <input value="New visitor" type="button" onclick="window.location.href='"""),_display_(/*15.203*/routes/*15.209*/.HomeController.createVisitor()),format.raw/*15.240*/("""'"/>
        <br>

        <h2>All restaurants</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Restaurants</th>
            </tr>
            """),_display_(/*24.14*/for(restaurant <- restaurants) yield /*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
                """),format.raw/*25.17*/("""<tr>
                    <td style="text-align:center"><a href=""""),_display_(/*26.61*/routes/*26.67*/.HomeController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*26.131*/("""">"""),_display_(/*26.134*/restaurant/*26.144*/.getRestaurantName),format.raw/*26.162*/("""</a></td>
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
                    <td style="text-align:center"><a href=""""),_display_(/*39.61*/routes/*39.67*/.HomeController.showVisitorCard(visitor.getFirstName)),format.raw/*39.120*/("""">"""),_display_(/*39.123*/visitor/*39.130*/.getFirstName),format.raw/*39.143*/(""" """),_display_(/*39.145*/visitor/*39.152*/.getLastName),format.raw/*39.164*/("""</a></td>
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
                  DATE: 2019-12-09T17:21:32.652
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 7fae1001426bc09eff903d5b6ee75e24082995ad
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->136|1484->349|1499->355|1555->389|1661->467|1677->473|1730->504|1978->725|2024->755|2064->757|2110->775|2203->841|2218->847|2304->911|2335->914|2355->924|2395->942|2477->993|2514->1003|2746->1208|2786->1232|2826->1234|2872->1252|2965->1318|2980->1324|3055->1377|3086->1380|3103->1387|3138->1400|3168->1402|3185->1409|3219->1421|3297->1468|3334->1478
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|46->15|46->15|46->15|46->15|46->15|46->15|55->24|55->24|55->24|56->25|57->26|57->26|57->26|57->26|57->26|57->26|59->28|60->29|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|72->41|73->42
                  -- GENERATED --
              */
          