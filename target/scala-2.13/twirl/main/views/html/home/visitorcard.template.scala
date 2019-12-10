
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
/*1.2*/import models.Visitor
/*2.2*/import helper._

object visitorcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Visitor,play.twirl.api.HtmlFormat.Appendable] {

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
    </table>
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
                  DATE: 2019-12-10T15:48:18.905
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: bc35b4175d2b3046c5ee21cde347e51f4b73faa2
                  MATRIX: 656->1|685->25|1012->45|1126->64|1156->69|1195->100|1233->101|1265->107|1296->112|1311->119|1344->132|1457->219|1471->225|1544->277|1652->358|1667->364|1743->419|2029->678|2045->685|2078->697|2186->778|2202->785|2232->794|2340->875|2356->882|2392->897
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|50->19|50->19|50->19|54->23|54->23|54->23|58->27|58->27|58->27
                  -- GENERATED --
              */
          