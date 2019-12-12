
package views.html.reserve

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

object copyrestaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Restaurant,play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: 2019-12-12T19:00:50.847
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/reserve/copyrestaurantcard.scala.html
                  HASH: 8a6f65e56dea1c03c7ed8adb522cbeda7f74bb6c
                  MATRIX: 659->1|691->28|1028->48|1148->73|1178->78|1225->117|1263->118|1295->124|1326->129|1344->139|1382->157|1498->247|1512->253|1599->319|1710->403|1725->409|1815->478|2101->737|2120->747|2154->760|2260->839|2279->849|2307->856|2417->939|2436->949|2468->960|2666->1131|2728->1177|2768->1179|2810->1193|2852->1208|2868->1215|2902->1228|2931->1230|2947->1237|2981->1250|3010->1252|3026->1259|3059->1271|3110->1291|3147->1301
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|50->19|50->19|50->19|54->23|54->23|54->23|58->27|58->27|58->27|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38
                  -- GENERATED --
              */
          