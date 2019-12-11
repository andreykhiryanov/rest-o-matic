
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

object restaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Restaurant,List[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(restaurant : Restaurant)(visitors : List[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.53*/("""

"""),_display_(/*6.2*/layout(restaurant.getRestaurantName)/*6.38*/{_display_(Seq[Any](format.raw/*6.39*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/restaurant/*7.20*/.getRestaurantName),format.raw/*7.38*/("""</h2>
    <br>
    <a class="btn btn-primary" href=""""),_display_(/*9.39*/routes/*9.45*/.RestaurantController.editRestaurant(restaurant.getRestaurantName)),format.raw/*9.111*/("""">Edit Restaurant</a> <a class="btn btn-danger" href=""""),_display_(/*9.166*/routes/*9.172*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*9.241*/("""">Remove Restaurant</a>

    <br><br>

    <table class="table table-striped">
        <tr>
            <th colspan="5">Information</th>
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
    <h2>Accepted Visitors</h2>
    <br>
    """),_display_(/*32.6*/if(visitors.isEmpty)/*32.26*/ {_display_(Seq[Any](format.raw/*32.28*/("""
        """),format.raw/*33.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*35.22*/restaurant/*35.32*/.getRestaurantName),format.raw/*35.50*/(""" """),format.raw/*35.51*/("""has not accepted any visitors<td>
            </tr>
        </table>
    """)))}),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""<table class="table table-striped">
    """),_display_(/*40.6*/for(visitor <- visitors) yield /*40.30*/ {_display_(Seq[Any](format.raw/*40.32*/("""
        """),format.raw/*41.9*/("""<tr>
            <td>"""),_display_(/*42.18*/visitor/*42.25*/.getFirstName),format.raw/*42.38*/(""" """),_display_(/*42.40*/visitor/*42.47*/.getLastName),format.raw/*42.59*/("""<td>
        </tr>
    """)))}),format.raw/*44.6*/("""
    """),format.raw/*45.5*/("""</table>

    <a class="btn btn-primary" href="">Accept Visitor</a> <a class="btn btn-danger" href="">Kick Out Visitor</a>
""")))}))
      }
    }
  }

  def render(restaurant:Restaurant,visitors:List[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)(visitors)

  def f:((Restaurant) => (List[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => (visitors) => apply(restaurant)(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T18:06:47.882
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: f0259e8e33d0dc288ee8fc73f442c27cd16011dc
                  MATRIX: 656->1|688->28|1035->48|1181->99|1211->104|1255->140|1293->141|1325->147|1356->152|1374->162|1412->180|1493->235|1507->241|1594->307|1676->362|1691->368|1781->437|2030->659|2049->669|2083->682|2189->761|2208->771|2236->778|2346->861|2365->871|2397->882|2506->965|2535->985|2575->987|2612->997|2715->1073|2734->1083|2773->1101|2802->1102|2909->1179|2942->1185|3010->1227|3050->1251|3090->1253|3127->1263|3177->1286|3193->1293|3227->1306|3256->1308|3272->1315|3305->1327|3361->1353|3394->1359
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|50->19|50->19|50->19|54->23|54->23|54->23|58->27|58->27|58->27|63->32|63->32|63->32|64->33|66->35|66->35|66->35|66->35|69->38|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45
                  -- GENERATED --
              */
          