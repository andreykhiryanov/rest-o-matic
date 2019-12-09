
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

        <input value="Remove this restaurant" type="button" onclick="window.location.href='"""),_display_(/*15.93*/routes/*15.99*/.HomeController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*15.162*/("""'"/>

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
                    <td colspan="5" style="text-align:center">"""),_display_(/*42.64*/visitor/*42.71*/.getFirstName),format.raw/*42.84*/(""" """),_display_(/*42.86*/visitor/*42.93*/.getLastName),format.raw/*42.105*/("""</td>
                </tr>
            """)))}),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""</table>

        <br>
        <input value="Add visitor" type="submit" onclick=""/> <input value="Remove visitor" type="button" onclick="window.location.href='"""),_display_(/*48.139*/routes/*48.145*/.HomeController.createRestaurant()),format.raw/*48.179*/("""'"/>

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
                  DATE: 2019-12-09T17:33:15.478
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: 7a6336eec006f01fffb4d277d7903a08b2399654
                  MATRIX: 656->1|1000->32|1120->57|1150->61|1214->99|1232->109|1270->127|1349->179|1368->189|1407->207|1535->308|1550->314|1635->377|1953->668|1972->678|2006->691|2128->786|2147->796|2175->803|2301->902|2320->912|2352->923|2532->1076|2594->1122|2634->1124|2680->1142|2776->1211|2792->1218|2826->1231|2855->1233|2871->1240|2905->1252|2979->1295|3016->1305|3208->1469|3224->1475|3280->1509
                  LINES: 24->1|29->3|34->3|36->5|39->8|39->8|39->8|44->13|44->13|44->13|46->15|46->15|46->15|56->25|56->25|56->25|60->29|60->29|60->29|64->33|64->33|64->33|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45|79->48|79->48|79->48
                  -- GENERATED --
              */
          