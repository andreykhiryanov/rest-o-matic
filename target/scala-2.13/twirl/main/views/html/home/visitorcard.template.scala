
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

"""),_display_(/*6.2*/layout(visitor.getFirstName)/*6.30*/{_display_(Seq[Any](format.raw/*6.31*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/visitor/*7.17*/.getFirstName),format.raw/*7.30*/("""</h2>
    <br>
    <a class="btn btn-primary" href=""""),_display_(/*9.39*/routes/*9.45*/.VisitorController.editVisitor(visitor.getFirstName)),format.raw/*9.97*/("""">Edit Visitor</a> <a class="btn btn-danger" href=""""),_display_(/*9.149*/routes/*9.155*/.VisitorController.destroyVisitor(visitor.getFirstName)),format.raw/*9.210*/("""">Remove Visitor</a>
    <br><br>
    <h2>Information</h2>
    <br>
    <table class="table table-striped">
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*16.18*/visitor/*16.25*/.getLastName),format.raw/*16.37*/("""</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>"""),_display_(/*20.18*/visitor/*20.25*/.getEmail),format.raw/*20.34*/("""</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>"""),_display_(/*24.18*/visitor/*24.25*/.getPhoneNumber),format.raw/*24.40*/("""</td>
        </tr>
    </table>
    <h2>Visited Restaurants</h2>
    <br>
    <table class="table table-striped">
        <tr>
            <td>"""),_display_(/*31.18*/visitor/*31.25*/.getFirstName),format.raw/*31.38*/(""" """),format.raw/*31.39*/("""has not visited any restaurants<td>
        </tr>
    </table>
    <a class="btn btn-primary" href="">Visit Restaurant</a> <a class="btn btn-danger" href="">Forget Restaurant</a>
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
                  DATE: 2019-12-11T14:50:09.976
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: 7bfbb3defb7ff88aacdc07a9ef12d2fd14d6781f
                  MATRIX: 656->1|685->25|1012->45|1126->64|1156->69|1192->97|1230->98|1262->104|1293->109|1308->116|1341->129|1422->184|1436->190|1508->242|1587->294|1602->300|1678->355|1881->531|1897->538|1930->550|2038->631|2054->638|2084->647|2192->728|2208->735|2244->750|2423->902|2439->909|2473->922|2502->923
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|47->16|47->16|47->16|51->20|51->20|51->20|55->24|55->24|55->24|62->31|62->31|62->31|62->31
                  -- GENERATED --
              */
          