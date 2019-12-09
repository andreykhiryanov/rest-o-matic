
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

        <input value="Edit visitor" type="button" onclick="window.location.href='"""),_display_(/*16.83*/routes/*16.89*/.HomeController.editVisitor(visitor.getFirstName)),format.raw/*16.138*/("""'"/> <input value="Remove visitor" type="submit" onclick="window.location.href='"""),_display_(/*16.219*/routes/*16.225*/.HomeController.destroyVisitor(visitor.getFirstName)),format.raw/*16.277*/("""'"/>

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
                    <td colspan="5" style="text-align:center"><a href=""""),_display_(/*43.73*/routes/*43.79*/.HomeController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*43.143*/("""">"""),_display_(/*43.146*/restaurant/*43.156*/.getRestaurantName),format.raw/*43.174*/("""</a></td>
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
                  DATE: 2019-12-09T19:23:20.490
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: 03adb5dff8fb18d6c8832b1a69bbe85dd7b5691e
                  MATRIX: 656->1|687->27|1014->47|1128->66|1158->70|1222->108|1237->115|1270->128|1349->180|1365->187|1399->200|1517->291|1532->297|1603->346|1712->427|1728->433|1802->485|2120->776|2136->783|2169->795|2293->892|2309->899|2339->908|2463->1005|2479->1012|2515->1027|2706->1191|2770->1239|2810->1241|2856->1259|2961->1337|2976->1343|3062->1407|3093->1410|3113->1420|3153->1438|3231->1485|3268->1495
                  LINES: 24->1|25->2|30->4|35->4|37->6|40->9|40->9|40->9|45->14|45->14|45->14|47->16|47->16|47->16|47->16|47->16|47->16|57->26|57->26|57->26|61->30|61->30|61->30|65->34|65->34|65->34|72->41|72->41|72->41|73->42|74->43|74->43|74->43|74->43|74->43|74->43|76->45|77->46
                  -- GENERATED --
              */
          