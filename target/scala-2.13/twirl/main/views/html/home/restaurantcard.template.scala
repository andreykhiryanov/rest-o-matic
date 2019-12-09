
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
/*2.2*/import helper._

object restaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Restaurant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(restaurant : Restaurant):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.27*/("""

"""),format.raw/*6.1*/("""<html>

    <head>
        <title>"""),_display_(/*9.17*/restaurant/*9.27*/.getRestaurantName),format.raw/*9.45*/("""</title>
    </head>

    <body>

        <h2>"""),_display_(/*14.14*/restaurant/*14.24*/.getRestaurantName),format.raw/*14.42*/("""</h2>

        <input value="Edit restaurant" type="button" onclick="window.location.href='"""),_display_(/*16.86*/routes/*16.92*/.RestaurantController.editRestaurant(restaurant.getRestaurantName)),format.raw/*16.158*/("""'"/> <input value="Remove restaurant" type="button" onclick="window.location.href='"""),_display_(/*16.242*/routes/*16.248*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*16.317*/("""'"/>

        <br><br>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th colspan="5" style="text-align:center">Information</th>
            </tr>
            <tr>
                <td>Last Name</td>
                <td>"""),_display_(/*26.22*/restaurant/*26.32*/.getLegalName),format.raw/*26.45*/("""</td>
            </tr>
            <tr>
                <td>INN</td>
                <td>"""),_display_(/*30.22*/restaurant/*30.32*/.getInn),format.raw/*30.39*/("""</td>
            </tr>
            <tr>
                <td>Address</td>
                <td>"""),_display_(/*34.22*/restaurant/*34.32*/.getAddress),format.raw/*34.43*/("""</td>
            </tr>
        </table>

        <h3>Accepted visitors</h3>

        <form name="kick" method="post">
            <select name='visitors' multiple size="5">
                """),_display_(/*42.18*/for(visitor <- restaurant.getAcceptedVisitors) yield /*42.64*/ {_display_(Seq[Any](format.raw/*42.66*/("""
                    """),format.raw/*43.21*/("""<option value="""),_display_(/*43.36*/visitor/*43.43*/.getFirstName),format.raw/*43.56*/(""">"""),_display_(/*43.58*/visitor/*43.65*/.getFirstName),format.raw/*43.78*/(""" """),_display_(/*43.80*/visitor/*43.87*/.getLastName),format.raw/*43.99*/("""</option>
                """)))}),format.raw/*44.18*/("""
            """),format.raw/*45.13*/("""</select>
            <br><br>
            <input type="submit" value="Kick visitor">
        </form>

        <h3>Have not visited</h3>

        <input value="Accept visitor" type="button" onclick=""/>

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
                  DATE: 2019-12-09T22:30:25.858
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: c37d795c6bc69fbdcd688aa685d7632a004bfcad
                  MATRIX: 656->1|690->30|1023->50|1143->75|1173->79|1237->117|1255->127|1293->145|1372->197|1391->207|1430->225|1551->319|1566->325|1654->391|1766->475|1782->481|1873->550|2191->841|2210->851|2244->864|2366->959|2385->969|2413->976|2539->1075|2558->1085|2590->1096|2816->1295|2878->1341|2918->1343|2968->1365|3010->1380|3026->1387|3060->1400|3089->1402|3105->1409|3139->1422|3168->1424|3184->1431|3217->1443|3276->1471|3318->1485
                  LINES: 24->1|25->2|30->4|35->4|37->6|40->9|40->9|40->9|45->14|45->14|45->14|47->16|47->16|47->16|47->16|47->16|47->16|57->26|57->26|57->26|61->30|61->30|61->30|65->34|65->34|65->34|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|76->45
                  -- GENERATED --
              */
          