
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
/*1.2*/import entities.Visitor
/*2.2*/import helper._

object visitorcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Visitor,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(visitor : Visitor):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.21*/("""

"""),format.raw/*6.1*/("""<html>

    <head>
        <title>"""),_display_(/*9.17*/visitor/*9.24*/.getFirstName),format.raw/*9.37*/("""</title>
    </head>

    <body>

        <h2>"""),_display_(/*14.14*/visitor/*14.21*/.getFirstName),format.raw/*14.34*/("""</h2>

        <input value="Remove this visitor" type="submit" onclick="window.location.href='"""),_display_(/*16.90*/routes/*16.96*/.HomeController.destroyVisitor(visitor.getFirstName)),format.raw/*16.148*/("""'"/>

        <br><br>

        <table border="1px solid grey" style="border-collapse: collapse">
            <tr>
                <th colspan="5" style="text-align:center">Information</th>
            </tr>
            <tr>
                <td>Last Name</td>
                <td>"""),_display_(/*26.22*/visitor/*26.29*/.getLastName),format.raw/*26.41*/("""</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>"""),_display_(/*30.22*/visitor/*30.29*/.getEmail),format.raw/*30.38*/("""</td>
            </tr>
            <tr>
                <td>Phone</td>
                <td>"""),_display_(/*34.22*/visitor/*34.29*/.getPhoneNumber),format.raw/*34.44*/("""</td>
            </tr>

            <tr>
                <th colspan="5" style="text-align:center">Visited restaurants</th>
            </tr>

            """),_display_(/*41.14*/for(restaurant <- visitor.getVisitedRestaurants) yield /*41.62*/ {_display_(Seq[Any](format.raw/*41.64*/("""
                """),format.raw/*42.17*/("""<tr>
                    <td colspan="5" style="text-align:center">"""),_display_(/*43.64*/restaurant/*43.74*/.getRestaurantName),format.raw/*43.92*/("""</td>
                </tr>
            """)))}),format.raw/*45.14*/("""
        """),format.raw/*46.9*/("""</table>

        <br>
        <input value="Visit restaurant" type="button" onclick=""/> <input value="Remove restaurant" type="submit" onclick=""/>

    </body>

</html>"""))
      }
    }
  }

  def render(visitor:Visitor): play.twirl.api.HtmlFormat.Appendable = apply(visitor)

  def f:((Visitor) => play.twirl.api.HtmlFormat.Appendable) = (visitor) => apply(visitor)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T17:44:58.177
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: f9b83f77e273e587fd106a3530e535c807b930bf
                  MATRIX: 656->1|687->27|1014->47|1128->66|1158->70|1222->108|1237->115|1270->128|1349->180|1365->187|1399->200|1524->298|1539->304|1613->356|1931->647|1947->654|1980->666|2104->763|2120->770|2150->779|2274->876|2290->883|2326->898|2517->1062|2581->1110|2621->1112|2667->1130|2763->1199|2782->1209|2821->1227|2895->1270|2932->1280
                  LINES: 24->1|25->2|30->4|35->4|37->6|40->9|40->9|40->9|45->14|45->14|45->14|47->16|47->16|47->16|57->26|57->26|57->26|61->30|61->30|61->30|65->34|65->34|65->34|72->41|72->41|72->41|73->42|74->43|74->43|74->43|76->45|77->46
                  -- GENERATED --
              */
          