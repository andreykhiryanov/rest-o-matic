
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurants : Set[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.33*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>

        <h1>Welcome to the Rest-o-matic!</h1>

        <h2>All Restaurants</h2>

        """),_display_(/*15.10*/for(restaurant <- restaurants) yield /*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<table border="1px solid grey">
                <tr>
                    <th>"""),_display_(/*18.26*/restaurant/*18.36*/.getRestaurantName),format.raw/*18.54*/("""</th>
                    <th>Information</th>
                </tr>
                <tr>
                    <td>Legal Name</td>
                    <td>"""),_display_(/*23.26*/restaurant/*23.36*/.getLegalName),format.raw/*23.49*/("""</td>
                </tr>
                <tr>
                    <td>INN</td>
                    <td>"""),_display_(/*27.26*/restaurant/*27.36*/.getInn),format.raw/*27.43*/("""</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>"""),_display_(/*31.26*/restaurant/*31.36*/.getAddress),format.raw/*31.47*/("""</td>
                </tr>
            </table>
            <br>
            """)))}),format.raw/*35.14*/("""

    """),format.raw/*37.5*/("""</body>

    <br>

    <input value="Add New Restaurant" type="submit" onclick="createRestaurant()"/>

</html>"""))
      }
    }
  }

  def render(restaurants:Set[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)

  def f:((Set[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => apply(restaurants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-05T12:55:38.120
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: f80ba1a590c804d45e901887d4d226bfbdb3a7c1
                  MATRIX: 656->1|996->30|1100->64|1145->61|1173->81|1201->83|1402->257|1448->287|1488->289|1530->303|1637->383|1656->393|1695->411|1882->571|1901->581|1935->594|2073->705|2092->715|2120->722|2262->837|2281->847|2313->858|2427->941|2462->949
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|47->15|47->15|47->15|48->16|50->18|50->18|50->18|55->23|55->23|55->23|59->27|59->27|59->27|63->31|63->31|63->31|67->35|69->37
                  -- GENERATED --
              */
          