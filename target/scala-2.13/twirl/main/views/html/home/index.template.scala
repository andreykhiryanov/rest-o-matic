
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

        <input value="New restaurant" type="button" onclick="window.location.href='"""),_display_(/*15.85*/routes/*15.91*/.HomeController.createRestaurant()),format.raw/*15.125*/("""'"/> <input value="Remove restaurant" type="submit" onclick=""/>
        <br><br>

        <input value="New visitor" type="button" onclick="window.location.href='"""),_display_(/*18.82*/routes/*18.88*/.HomeController.createVisitor()),format.raw/*18.119*/("""'"/> <input value="Remove visitor" type="submit" onclick=""/>
        <br>

        <h2>All restaurants</h2>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th>Restaurants</th>
            </tr>
            """),_display_(/*27.14*/for(restaurant <- restaurants) yield /*27.44*/ {_display_(Seq[Any](format.raw/*27.46*/("""
                """),format.raw/*28.17*/("""<tr>
                    <td style="text-align:center"><a href=""""),_display_(/*29.61*/routes/*29.67*/.HomeController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*29.131*/("""">"""),_display_(/*29.134*/restaurant/*29.144*/.getRestaurantName),format.raw/*29.162*/("""</a></td>
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
                    <td style="text-align:center"><a href=""""),_display_(/*42.61*/routes/*42.67*/.HomeController.showVisitorCard(visitor.getFirstName)),format.raw/*42.120*/("""">"""),_display_(/*42.123*/visitor/*42.130*/.getFirstName),format.raw/*42.143*/(""" """),_display_(/*42.145*/visitor/*42.152*/.getLastName),format.raw/*42.164*/("""</a></td>
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
                  DATE: 2019-12-09T16:20:48.315
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: b84e57810c5ccbba116fda0b8bbe8b08c7de801e
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->136|1484->349|1499->355|1555->389|1749->556|1764->562|1817->593|2122->871|2168->901|2208->903|2254->921|2347->987|2362->993|2448->1057|2479->1060|2499->1070|2539->1088|2621->1139|2658->1149|2890->1354|2930->1378|2970->1380|3016->1398|3109->1464|3124->1470|3199->1523|3230->1526|3247->1533|3282->1546|3312->1548|3329->1555|3363->1567|3441->1614|3478->1624
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|46->15|46->15|46->15|49->18|49->18|49->18|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45
                  -- GENERATED --
              */
          