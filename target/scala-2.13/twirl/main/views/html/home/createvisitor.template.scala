
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

object createvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("New Visitor")/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<h1>Create New Visitor</h1>
    <br>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.VisitorController.saveVisitorChanges())/*8.73*/ {_display_(Seq[Any](format.raw/*8.75*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(visitorForm("firstName"))),format.raw/*9.52*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(visitorForm("lastName"))),format.raw/*10.51*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(visitorForm("email"))),format.raw/*11.48*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(visitorForm("phoneNumber"))),format.raw/*12.54*/("""

        """),format.raw/*14.9*/("""<br>

        <input type="submit" value="Create Visitor">
    """)))}),format.raw/*17.6*/("""
""")))}))
      }
    }
  }

  def render(visitorForm:Form[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(visitorForm)

  def f:((Form[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (visitorForm) => apply(visitorForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T10:42:09.510
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createvisitor.scala.html
                  HASH: 27a758e34c840c9e93a185cb0708c3bd91a87216
                  MATRIX: 656->1|997->25|1098->56|1143->53|1171->73|1199->76|1228->97|1266->98|1298->104|1367->148|1381->154|1450->215|1489->217|1526->228|1540->234|1596->270|1634->281|1649->287|1705->322|1743->333|1758->339|1811->371|1849->382|1864->388|1923->426|1962->438|2059->505
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|49->17
                  -- GENERATED --
              */
          