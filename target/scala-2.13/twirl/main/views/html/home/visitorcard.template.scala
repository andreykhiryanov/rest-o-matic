
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

object visitorcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(visitors : Set[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.27*/("""

"""),format.raw/*6.1*/("""<html>

    <body>

        <h2>All visitors</h2>

        """),_display_(/*12.10*/for(visitor <- visitors) yield /*12.34*/ {_display_(Seq[Any](format.raw/*12.36*/("""
            """),format.raw/*13.13*/("""<table border="1px solid grey" style="border-collapse: collapse">
                <tr>
                    <th colspan="5" style="text-align:center">Visitor</th>
                </tr>

                <tr>
                    <td>First Name</td>
                    <th style="text-align:left">"""),_display_(/*20.50*/visitor/*20.57*/.getFirstName),format.raw/*20.70*/("""</th>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>"""),_display_(/*24.26*/visitor/*24.33*/.getLastName),format.raw/*24.45*/("""</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>"""),_display_(/*28.26*/visitor/*28.33*/.getEmail),format.raw/*28.42*/("""</td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td>"""),_display_(/*32.26*/visitor/*32.33*/.getPhoneNumber),format.raw/*32.48*/("""</td>
                </tr>

                <tr>
                    <th colspan="5" style="text-align:center">Visited restaurants</th>
                </tr>

                """),_display_(/*39.18*/for(restaurant <- visitor.getVisitedRestaurants) yield /*39.66*/ {_display_(Seq[Any](format.raw/*39.68*/("""
                    """),format.raw/*40.21*/("""<tr>
                        <td colspan="5" style="text-align:center">"""),_display_(/*41.68*/restaurant/*41.78*/.getRestaurantName),format.raw/*41.96*/("""</td>
                    </tr>
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</table>
            <br>
            """)))}),format.raw/*46.14*/("""

    """),format.raw/*48.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(visitors:Set[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(visitors)

  def f:((Set[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (visitors) => apply(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-06T13:36:17.178
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: 1053623bbe56553444bec67efda636b8103cd9ee
                  MATRIX: 656->1|687->27|1019->47|1139->72|1169->76|1262->142|1302->166|1342->168|1384->182|1713->484|1729->491|1763->504|1907->621|1923->628|1956->640|2096->753|2112->760|2142->769|2282->882|2298->889|2334->904|2545->1088|2609->1136|2649->1138|2699->1160|2799->1233|2818->1243|2857->1261|2939->1312|2981->1326|3053->1367|3088->1375
                  LINES: 24->1|25->2|30->4|35->4|37->6|43->12|43->12|43->12|44->13|51->20|51->20|51->20|55->24|55->24|55->24|59->28|59->28|59->28|63->32|63->32|63->32|70->39|70->39|70->39|71->40|72->41|72->41|72->41|74->43|75->44|77->46|79->48
                  -- GENERATED --
              */
          