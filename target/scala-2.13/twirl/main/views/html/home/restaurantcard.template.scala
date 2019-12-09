
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

object restaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Restaurant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(restaurant : Restaurant):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<html>

    <head>
        <title>"""),_display_(/*8.17*/restaurant/*8.27*/.getRestaurantName),format.raw/*8.45*/("""</title>
    </head>

    <body>

        <h2>"""),_display_(/*13.14*/restaurant/*13.24*/.getRestaurantName),format.raw/*13.42*/("""</h2>

        <input value="Add visitor" type="submit" onclick=""/> <input value="Remove visitor" type="submit" onclick=""/>

        <br><br>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th colspan="5" style="text-align:center">Information</th>
            </tr>
            <tr>
                <td>Last Name</td>
                <td>"""),_display_(/*25.22*/restaurant/*25.32*/.getLegalName),format.raw/*25.45*/("""</td>
            </tr>
            <tr>
                <td>INN</td>
                <td>"""),_display_(/*29.22*/restaurant/*29.32*/.getInn),format.raw/*29.39*/("""</td>
            </tr>
            <tr>
                <td>Address</td>
                <td>"""),_display_(/*33.22*/restaurant/*33.32*/.getAddress),format.raw/*33.43*/("""</td>
            </tr>

            <tr>
                <th colspan="5" style="text-align:center">Visitors</th>
            </tr>

            """),_display_(/*40.14*/for(visitor <- restaurant.getAcceptedVisitors) yield /*40.60*/ {_display_(Seq[Any](format.raw/*40.62*/("""
                """),format.raw/*41.17*/("""<tr>
                    <td>"""),_display_(/*42.26*/visitor/*42.33*/.getFirstName),format.raw/*42.46*/("""</td>
                    <td>"""),_display_(/*43.26*/visitor/*43.33*/.getLastName),format.raw/*43.45*/("""</td>
                </tr>
            """)))}),format.raw/*45.14*/("""
        """),format.raw/*46.9*/("""</table>

    </body>

</html>"""))
      }
    }
  }

  def render(restaurant:Restaurant): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)

  def f:((Restaurant) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => apply(restaurant)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T15:18:44.310
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: fa1733ed90eeae754f4ea1d4885a0ef5d7934b94
                  MATRIX: 656->1|1000->32|1120->57|1150->61|1214->99|1232->109|1270->127|1349->179|1368->189|1407->207|1848->621|1867->631|1901->644|2023->739|2042->749|2070->756|2196->855|2215->865|2247->876|2427->1029|2489->1075|2529->1077|2575->1095|2633->1126|2649->1133|2683->1146|2742->1178|2758->1185|2791->1197|2865->1240|2902->1250
                  LINES: 24->1|29->3|34->3|36->5|39->8|39->8|39->8|44->13|44->13|44->13|56->25|56->25|56->25|60->29|60->29|60->29|64->33|64->33|64->33|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|77->46
                  -- GENERATED --
              */
          