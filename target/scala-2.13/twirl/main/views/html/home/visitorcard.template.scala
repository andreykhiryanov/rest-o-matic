
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

        <input value="Edit visitor" type="button" onclick="window.location.href='"""),_display_(/*16.83*/routes/*16.89*/.VisitorController.editVisitor(visitor.getFirstName)),format.raw/*16.141*/("""'"/> <input value="Remove visitor" type="submit" onclick="window.location.href='"""),_display_(/*16.222*/routes/*16.228*/.VisitorController.destroyVisitor(visitor.getFirstName)),format.raw/*16.283*/("""'"/>

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

            """),format.raw/*37.21*/("""
                """),format.raw/*38.87*/("""
            """),format.raw/*39.22*/("""

            """),_display_(/*41.14*/for(restaurant <- visitor.getVisitedRestaurants) yield /*41.62*/ {_display_(Seq[Any](format.raw/*41.64*/("""
                """),format.raw/*42.25*/("""
                    """),format.raw/*43.193*/("""
                """),format.raw/*44.26*/("""
            """)))}),format.raw/*45.14*/("""
        """),format.raw/*46.9*/("""</table>

        <h3>Visited restaurants</h3>

        <form name="restaurants" method="post">
            <select name='restaurants' multiple size="5">
            """),_display_(/*52.14*/for(restaurant <- visitor.getVisitedRestaurants) yield /*52.62*/ {_display_(Seq[Any](format.raw/*52.64*/("""
                """),format.raw/*53.17*/("""<option value="""),_display_(/*53.32*/restaurant/*53.42*/.getRestaurantName),format.raw/*53.60*/(""">"""),_display_(/*53.62*/restaurant/*53.72*/.getRestaurantName),format.raw/*53.90*/("""</option>
            """)))}),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""</select>
            <br><br>
            <input type="submit" value="Remove restaurant">
        </form>

        <h3>Not visited restaurants</h3>


        <input value="Visit restaurant" type="button" onclick=""/>


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
                  DATE: 2019-12-09T22:33:30.019
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: ac122a47ecbe5bea604bbf49b47e7ce750ec5925
                  MATRIX: 656->1|687->27|1014->47|1128->66|1158->70|1222->108|1237->115|1270->128|1349->180|1365->187|1399->200|1517->291|1532->297|1606->349|1715->430|1731->436|1808->491|2126->782|2142->789|2175->801|2299->898|2315->905|2345->914|2469->1011|2485->1018|2521->1033|2589->1081|2635->1169|2677->1192|2721->1209|2785->1257|2825->1259|2871->1285|2922->1479|2968->1506|3014->1521|3051->1531|3251->1704|3315->1752|3355->1754|3401->1772|3443->1787|3462->1797|3501->1815|3530->1817|3549->1827|3588->1845|3643->1869|3685->1883
                  LINES: 24->1|25->2|30->4|35->4|37->6|40->9|40->9|40->9|45->14|45->14|45->14|47->16|47->16|47->16|47->16|47->16|47->16|57->26|57->26|57->26|61->30|61->30|61->30|65->34|65->34|65->34|68->37|69->38|70->39|72->41|72->41|72->41|73->42|74->43|75->44|76->45|77->46|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|86->55
                  -- GENERATED --
              */
          