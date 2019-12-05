
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Set[Restaurant],Set[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(restaurants : Set[Restaurant])(visitors : Set[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.58*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>

        <h1>Welcome to the Rest-o-matic!</h1>

        <h2>All Restaurants</h2>

        <input value="Add New Restaurant" type="submit" onclick=""/> <input value="Add New Visitor" type="submit" onclick=""/>
        <br><br>

        """),_display_(/*19.10*/for(restaurant <- restaurants) yield /*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
            """),format.raw/*20.13*/("""<table border="1px solid grey">
                <tr>
                    <th>"""),_display_(/*22.26*/restaurant/*22.36*/.getRestaurantName),format.raw/*22.54*/("""</th>
                    <th>Information</th>
                </tr>
                <tr>
                    <td>Legal Name</td>
                    <td>"""),_display_(/*27.26*/restaurant/*27.36*/.getLegalName),format.raw/*27.49*/("""</td>
                </tr>
                <tr>
                    <td>INN</td>
                    <td>"""),_display_(/*31.26*/restaurant/*31.36*/.getInn),format.raw/*31.43*/("""</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>"""),_display_(/*35.26*/restaurant/*35.36*/.getAddress),format.raw/*35.47*/("""</td>
                </tr>
            </table>
            <br>
            """)))}),format.raw/*39.14*/("""

        """),format.raw/*41.9*/("""<h2>All Visitors</h2>

        """),_display_(/*43.10*/for(visitor <- visitors) yield /*43.34*/ {_display_(Seq[Any](format.raw/*43.36*/("""
            """),format.raw/*44.13*/("""<table border="1px solid grey">
                <tr>
                    <th>"""),_display_(/*46.26*/visitor/*46.33*/.getFirstName),format.raw/*46.46*/("""</th>
                    <th>Information</th>
                </tr>
                <tr>
                    <td>Legal Name</td>
                    <td>"""),_display_(/*51.26*/visitor/*51.33*/.getLastName),format.raw/*51.45*/("""</td>
                </tr>
                <tr>
                    <td>INN</td>
                    <td>"""),_display_(/*55.26*/visitor/*55.33*/.getEmail),format.raw/*55.42*/("""</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>"""),_display_(/*59.26*/visitor/*59.33*/.getPhoneNumber),format.raw/*59.48*/("""</td>
                </tr>
            </table>
            <br>
            """)))}),format.raw/*63.14*/("""

    """),format.raw/*65.5*/("""</body>

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
                  DATE: 2019-12-05T17:45:10.834
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 1e45874779d654eb10a97881beda84a4d77de10b
                  MATRIX: 656->1|690->30|1040->56|1169->115|1214->112|1242->132|1270->134|1619->456|1665->486|1705->488|1747->502|1854->582|1873->592|1912->610|2099->770|2118->780|2152->793|2290->904|2309->914|2337->921|2479->1036|2498->1046|2530->1057|2644->1140|2683->1152|2744->1186|2784->1210|2824->1212|2866->1226|2973->1306|2989->1313|3023->1326|3210->1486|3226->1493|3259->1505|3397->1616|3413->1623|3443->1632|3585->1747|3601->1754|3637->1769|3751->1852|3786->1860
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|51->19|51->19|51->19|52->20|54->22|54->22|54->22|59->27|59->27|59->27|63->31|63->31|63->31|67->35|67->35|67->35|71->39|73->41|75->43|75->43|75->43|76->44|78->46|78->46|78->46|83->51|83->51|83->51|87->55|87->55|87->55|91->59|91->59|91->59|95->63|97->65
                  -- GENERATED --
              */
          