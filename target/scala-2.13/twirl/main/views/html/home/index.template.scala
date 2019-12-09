
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

        <input value="New restaurant" type="submit" onclick=""/> <input value="Remove restaurant" type="submit" onclick=""/>
        <br><br>

        <input value="New visitor" type="submit" onclick=""/> <input value="Remove visitor" type="submit" onclick=""/>
        <br>

        <h2>All restaurants</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Restaurants</th>
            </tr>
            """),_display_(/*27.14*/for(restaurant <- restaurants) yield /*27.44*/ {_display_(Seq[Any](format.raw/*27.46*/("""
                """),format.raw/*28.17*/("""<tr>
                    <td style="text-align:center"><a href="#">"""),_display_(/*29.64*/restaurant/*29.74*/.getRestaurantName),format.raw/*29.92*/("""</a></td>
                </tr>
                """)))}),format.raw/*31.18*/("""
        """),format.raw/*32.9*/("""</table>

        <h2>All visitors</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Visitors</th>
            </tr>
            """),_display_(/*40.14*/for(visitor <- visitors) yield /*40.38*/ {_display_(Seq[Any](format.raw/*40.40*/("""
                """),format.raw/*41.17*/("""<tr>
                    <td style="text-align:center"><a href="#">"""),_display_(/*42.64*/visitor/*42.71*/.getFirstName),format.raw/*42.84*/(""" """),_display_(/*42.86*/visitor/*42.93*/.getLastName),format.raw/*42.105*/("""</a></td>
                </tr>
            """)))}),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""</table>

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
                  DATE: 2019-12-09T15:24:54.290
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 6cc801dea8d092fec9d144deb644fd2aca2606c8
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->136|1881->746|1927->776|1967->778|2013->796|2109->865|2128->875|2167->893|2249->944|2286->954|2518->1159|2558->1183|2598->1185|2644->1203|2740->1272|2756->1279|2790->1292|2819->1294|2835->1301|2869->1313|2947->1360|2984->1370
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|58->27|58->27|58->27|59->28|60->29|60->29|60->29|62->31|63->32|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45
                  -- GENERATED --
              */
          