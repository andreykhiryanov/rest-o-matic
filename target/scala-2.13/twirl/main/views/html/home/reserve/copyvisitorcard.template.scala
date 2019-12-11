
package views.html.home.reserve

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
/*1.2*/import models.Visitor
/*2.2*/import helper._

object copyvisitorcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Visitor,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(visitor : Visitor):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.21*/("""

"""),_display_(/*6.2*/layout("@visitor.getFirstName")/*6.33*/{_display_(Seq[Any](format.raw/*6.34*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/visitor/*7.17*/.getFirstName),format.raw/*7.30*/("""</h2>

    <input value="Edit visitor" type="button" onclick="window.location.href='"""),_display_(/*9.79*/routes/*9.85*/.VisitorController.editVisitor(visitor.getFirstName)),format.raw/*9.137*/("""'"/> <input value="Remove visitor" type="submit" onclick="window.location.href='"""),_display_(/*9.218*/routes/*9.224*/.VisitorController.destroyVisitor(visitor.getFirstName)),format.raw/*9.279*/("""'"/>

    <br><br>

    <table border="1px solid grey" style="border-collapse: collapse">
        <tr>
            <th colspan="5" style="text-align:center">Information</th>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*19.18*/visitor/*19.25*/.getLastName),format.raw/*19.37*/("""</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>"""),_display_(/*23.18*/visitor/*23.25*/.getEmail),format.raw/*23.34*/("""</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>"""),_display_(/*27.18*/visitor/*27.25*/.getPhoneNumber),format.raw/*27.40*/("""</td>
        </tr>

        """),format.raw/*30.17*/("""
        """),format.raw/*31.79*/("""
        """),format.raw/*32.18*/("""

        """),_display_(/*34.10*/for(restaurant <- visitor.getVisitedRestaurants) yield /*34.58*/ {_display_(Seq[Any](format.raw/*34.60*/("""
            """),format.raw/*35.21*/("""
            """),format.raw/*36.185*/("""
            """),format.raw/*37.22*/("""
        """)))}),format.raw/*38.10*/("""
    """),format.raw/*39.5*/("""</table>

    <h3>Visited restaurants</h3>

    <form name="restaurants" method="post">
        <select name='restaurants' multiple size="5">
        """),_display_(/*45.10*/for(restaurant <- visitor.getVisitedRestaurants) yield /*45.58*/ {_display_(Seq[Any](format.raw/*45.60*/("""
            """),format.raw/*46.13*/("""<option value="""),_display_(/*46.28*/restaurant/*46.38*/.getRestaurantName),format.raw/*46.56*/(""">"""),_display_(/*46.58*/restaurant/*46.68*/.getRestaurantName),format.raw/*46.86*/("""</option>
        """)))}),format.raw/*47.10*/("""
        """),format.raw/*48.9*/("""</select>
        <br><br>
        <input type="submit" value="Remove restaurant">
    </form>

    <h3>Not visited restaurants</h3>


    <input value="Visit restaurant" type="button" onclick=""/>
""")))}))
      }
    }
  }

  def render(visitor:Visitor): play.twirl.api.HtmlFormat.Appendable = apply(visitor)

  def f:((Visitor) => play.twirl.api.HtmlFormat.Appendable) = (visitor) => apply(visitor)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T12:56:57.699
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/reserve/copyvisitorcard.scala.html
                  HASH: 14bf1359cf773af7b3e16287a7e65d9b14772fdc
                  MATRIX: 664->1|693->25|1024->45|1138->64|1168->69|1207->100|1245->101|1277->107|1308->112|1323->119|1356->132|1469->219|1483->225|1556->277|1664->358|1679->364|1755->419|2041->678|2057->685|2090->697|2198->778|2214->785|2244->794|2352->875|2368->882|2404->897|2464->937|2502->1017|2540->1036|2580->1049|2644->1097|2684->1099|2726->1121|2769->1307|2811->1330|2853->1341|2886->1347|3070->1504|3134->1552|3174->1554|3216->1568|3258->1583|3277->1593|3316->1611|3345->1613|3364->1623|3403->1641|3454->1661|3491->1671
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|50->19|50->19|50->19|54->23|54->23|54->23|58->27|58->27|58->27|61->30|62->31|63->32|65->34|65->34|65->34|66->35|67->36|68->37|69->38|70->39|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|78->47|79->48
                  -- GENERATED --
              */
          