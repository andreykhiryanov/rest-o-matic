
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
/*2.2*/import models.Visitor
/*3.2*/import helper._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Set[Restaurant],Set[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(restaurants : Set[Restaurant])(visitors : Set[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.58*/("""

"""),_display_(/*7.2*/layout("Welcome!")/*7.20*/{_display_(Seq[Any](format.raw/*7.21*/("""
    """),format.raw/*8.5*/("""<h1>Welcome to the Rest-o-matic!</h1>

    <input value="New restaurant" type="button" onclick="window.location.href='"""),_display_(/*10.81*/routes/*10.87*/.RestaurantController.createRestaurant()),format.raw/*10.127*/("""'"/> <input value="New visitor" type="button" onclick="window.location.href='"""),_display_(/*10.205*/routes/*10.211*/.VisitorController.createVisitor()),format.raw/*10.245*/("""'"/>
    <br>

    <h2>All restaurants</h2>

    <table border="1px solid grey" style="border-collapse: collapse">
        <tr>
            <th>Restaurants</th>
        </tr>
        """),_display_(/*19.10*/for(restaurant <- restaurants) yield /*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
            """),format.raw/*20.13*/("""<tr>
                <td style="text-align:center"><a href=""""),_display_(/*21.57*/routes/*21.63*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*21.133*/("""">"""),_display_(/*21.136*/restaurant/*21.146*/.getRestaurantName),format.raw/*21.164*/("""</a></td>
            </tr>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</table>

    <h2>All visitors</h2>

    <table border="1px solid grey" style="border-collapse: collapse">
        <tr>
            <th>Visitors</th>
        </tr>
        """),_display_(/*32.10*/for(visitor <- visitors) yield /*32.34*/ {_display_(Seq[Any](format.raw/*32.36*/("""
            """),format.raw/*33.13*/("""<tr>
                <td style="text-align:center"><a href=""""),_display_(/*34.57*/routes/*34.63*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*34.119*/("""">"""),_display_(/*34.122*/visitor/*34.129*/.getFirstName),format.raw/*34.142*/(""" """),_display_(/*34.144*/visitor/*34.151*/.getLastName),format.raw/*34.163*/("""</a></td>
            </tr>
        """)))}),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</table>
""")))}))
      }
    }
  }

  def render(restaurants:Set[Restaurant],visitors:Set[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)(visitors)

  def f:((Set[Restaurant]) => (Set[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => (visitors) => apply(restaurants)(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-10T12:36:49.980
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 09dbdc39b288be032477dcbe9515160457edd674
                  MATRIX: 656->1|688->28|717->52|1059->72|1210->128|1240->133|1266->151|1304->152|1336->158|1484->279|1499->285|1561->325|1667->403|1683->409|1739->443|1959->636|2005->666|2045->668|2087->682|2176->744|2191->750|2283->820|2314->823|2334->833|2374->851|2444->890|2477->896|2685->1077|2725->1101|2765->1103|2807->1117|2896->1179|2911->1185|2989->1241|3020->1244|3037->1251|3072->1264|3102->1266|3119->1273|3153->1285|3223->1324|3256->1330
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|41->10|41->10|41->10|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|52->21|54->23|55->24|63->32|63->32|63->32|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|67->36|68->37
                  -- GENERATED --
              */
          