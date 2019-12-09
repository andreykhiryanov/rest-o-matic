
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

        <input value="New restaurant" type="submit" onclick=""/> <input value="New visitor" type="submit" onclick=""/>
        <br>

        <h2>All restaurants</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Restaurants</th>
            </tr>
            """),_display_(/*24.14*/for(restaurant <- restaurants) yield /*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
                """),format.raw/*25.17*/("""<tr>
                    <td style="text-align:center"><a href="#">"""),_display_(/*26.64*/restaurant/*26.74*/.getRestaurantName),format.raw/*26.92*/("""</a></td>
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
                    <td style="text-align:center"><a href="#">"""),_display_(/*39.64*/visitor/*39.71*/.getFirstName),format.raw/*39.84*/(""" """),_display_(/*39.86*/visitor/*39.93*/.getLastName),format.raw/*39.105*/("""</a></td>
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
                  DATE: 2019-12-06T13:38:14.914
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: c51719eb4a77b8b0cfe872541159e2536d888564
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->136|1735->600|1781->630|1821->632|1867->650|1963->719|1982->729|2021->747|2103->798|2140->808|2372->1013|2412->1037|2452->1039|2498->1057|2594->1126|2610->1133|2644->1146|2673->1148|2689->1155|2723->1167|2801->1214|2838->1224
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|55->24|55->24|55->24|56->25|57->26|57->26|57->26|59->28|60->29|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|72->41|73->42
                  -- GENERATED --
              */
          