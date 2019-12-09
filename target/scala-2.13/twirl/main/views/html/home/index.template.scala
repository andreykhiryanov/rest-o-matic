
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
                  DATE: 2019-12-09T15:33:58.209
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 002cac724905653a8759078882286bf916daa92f
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->136|1881->746|1927->776|1967->778|2013->796|2106->862|2121->868|2207->932|2238->935|2258->945|2298->963|2380->1014|2417->1024|2649->1229|2689->1253|2729->1255|2775->1273|2868->1339|2883->1345|2958->1398|2989->1401|3006->1408|3041->1421|3071->1423|3088->1430|3122->1442|3200->1489|3237->1499
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|63->32|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45
                  -- GENERATED --
              */
          