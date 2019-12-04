
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurants : Set[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>

        <h1>Welcome to the Rest-o-matic!</h1>

        <h2>All Restaurants</h2>

        """),_display_(/*14.10*/for(restaurant <- restaurants) yield /*14.40*/ {_display_(Seq[Any](format.raw/*14.42*/("""
            """),format.raw/*15.13*/("""<table border="1px solid grey">
                <tr>
                    <th>"""),_display_(/*17.26*/restaurant/*17.36*/.getRestaurantName),format.raw/*17.54*/("""</th>
                    <th>Information</th>
                </tr>
                <tr>
                    <td>Legal Name</td>
                    <td>"""),_display_(/*22.26*/restaurant/*22.36*/.getLegalName),format.raw/*22.49*/("""</td>
                </tr>
                <tr>
                    <td>INN</td>
                    <td>"""),_display_(/*26.26*/restaurant/*26.36*/.getInn),format.raw/*26.43*/("""</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>"""),_display_(/*30.26*/restaurant/*30.36*/.getAddress),format.raw/*30.47*/("""</td>
                </tr>
            </table>
            <br>
            """)))}),format.raw/*34.14*/("""

    """),format.raw/*36.5*/("""</body>

    <br>

    <input value="Add New Restaurant" type="submit" onclick="create()"/>

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
                  DATE: 2019-12-04T18:33:28.393
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 475b8219bd966a78ef83947e4519a6f27e5b57d9
                  MATRIX: 962->1|1066->35|1111->32|1139->52|1167->54|1368->228|1414->258|1454->260|1496->274|1603->354|1622->364|1661->382|1848->542|1867->552|1901->565|2039->676|2058->686|2086->693|2228->808|2247->818|2279->829|2393->912|2428->920
                  LINES: 28->1|31->2|34->1|35->3|36->4|46->14|46->14|46->14|47->15|49->17|49->17|49->17|54->22|54->22|54->22|58->26|58->26|58->26|62->30|62->30|62->30|66->34|68->36
                  -- GENERATED --
              */
          