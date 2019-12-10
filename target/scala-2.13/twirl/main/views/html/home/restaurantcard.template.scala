
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
/*1.2*/import models.Restaurant
/*2.2*/import helper._

object restaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Restaurant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(restaurant : Restaurant):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.27*/("""

"""),_display_(/*6.2*/layout("@restaurant.getRestaurantName")/*6.41*/{_display_(Seq[Any](format.raw/*6.42*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/restaurant/*7.20*/.getRestaurantName),format.raw/*7.38*/("""</h2>

    <input value="Edit restaurant" type="button" onclick="window.location.href='"""),_display_(/*9.82*/routes/*9.88*/.RestaurantController.editRestaurant(restaurant.getRestaurantName)),format.raw/*9.154*/("""'"/> <input value="Remove restaurant" type="button" onclick="window.location.href='"""),_display_(/*9.238*/routes/*9.244*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*9.313*/("""'"/>

    <br><br>

    <table border="1px solid grey" style="border-collapse: collapse">
        <tr>
            <th colspan="5" style="text-align:center">Information</th>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*19.18*/restaurant/*19.28*/.getLegalName),format.raw/*19.41*/("""</td>
        </tr>
        <tr>
            <td>INN</td>
            <td>"""),_display_(/*23.18*/restaurant/*23.28*/.getInn),format.raw/*23.35*/("""</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>"""),_display_(/*27.18*/restaurant/*27.28*/.getAddress),format.raw/*27.39*/("""</td>
        </tr>
    </table>

    <h3>Accepted visitors</h3>

    <form name="kick" method="post">
        <select name='visitors' multiple size="5">
        """),_display_(/*35.10*/for(visitor <- restaurant.getAcceptedVisitors) yield /*35.56*/ {_display_(Seq[Any](format.raw/*35.58*/("""
            """),format.raw/*36.13*/("""<option value="""),_display_(/*36.28*/visitor/*36.35*/.getFirstName),format.raw/*36.48*/(""">"""),_display_(/*36.50*/visitor/*36.57*/.getFirstName),format.raw/*36.70*/(""" """),_display_(/*36.72*/visitor/*36.79*/.getLastName),format.raw/*36.91*/("""</option>
        """)))}),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</select>
        <br><br>
        <input type="submit" value="Kick visitor">
    </form>

    <h3>Have not visited</h3>

    <input value="Accept visitor" type="button" onclick=""/>
""")))}))
      }
    }
  }

  def render(restaurant:Restaurant): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)

  def f:((Restaurant) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => apply(restaurant)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-10T12:36:49.990
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: 8a6f65e56dea1c03c7ed8adb522cbeda7f74bb6c
                  MATRIX: 656->1|688->28|1021->48|1141->73|1171->78|1218->117|1256->118|1288->124|1319->129|1337->139|1375->157|1491->247|1505->253|1592->319|1703->403|1718->409|1808->478|2094->737|2113->747|2147->760|2253->839|2272->849|2300->856|2410->939|2429->949|2461->960|2659->1131|2721->1177|2761->1179|2803->1193|2845->1208|2861->1215|2895->1228|2924->1230|2940->1237|2974->1250|3003->1252|3019->1259|3052->1271|3103->1291|3140->1301
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|50->19|50->19|50->19|54->23|54->23|54->23|58->27|58->27|58->27|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38
                  -- GENERATED --
              */
          