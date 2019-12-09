
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

        <input value="Edit restaurant" type="button" onclick="window.location.href='"""),_display_(/*15.86*/routes/*15.92*/.RestaurantController.editRestaurant(restaurant.getRestaurantName)),format.raw/*15.158*/("""'"/> <input value="Remove restaurant" type="button" onclick="window.location.href='"""),_display_(/*15.242*/routes/*15.248*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*15.317*/("""'"/>

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
                    <td colspan="5" style="text-align:center"><a href=""""),_display_(/*42.73*/routes/*42.79*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*42.135*/("""">"""),_display_(/*42.138*/visitor/*42.145*/.getFirstName),format.raw/*42.158*/(""" """),_display_(/*42.160*/visitor/*42.167*/.getLastName),format.raw/*42.179*/("""</a></td>
                </tr>
            """)))}),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""</table>

        <br>
        <input value="Add visitor" type="submit" onclick=""/> <input value="Remove visitor" type="button" onclick=""/>

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
                  DATE: 2019-12-09T20:28:41.823
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: ac3289b9744efe9747923fccab9542804633152c
                  MATRIX: 656->1|1000->32|1120->57|1150->61|1214->99|1232->109|1270->127|1349->179|1368->189|1407->207|1528->301|1543->307|1631->373|1743->457|1759->463|1850->532|2168->823|2187->833|2221->846|2343->941|2362->951|2390->958|2516->1057|2535->1067|2567->1078|2747->1231|2809->1277|2849->1279|2895->1297|3000->1375|3015->1381|3093->1437|3124->1440|3141->1447|3176->1460|3206->1462|3223->1469|3257->1481|3335->1528|3372->1538
                  LINES: 24->1|29->3|34->3|36->5|39->8|39->8|39->8|44->13|44->13|44->13|46->15|46->15|46->15|46->15|46->15|46->15|56->25|56->25|56->25|60->29|60->29|60->29|64->33|64->33|64->33|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45
                  -- GENERATED --
              */
          