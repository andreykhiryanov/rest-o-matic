
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
                  DATE: 2019-12-10T09:49:27.749
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createvisitor.scala.html
                  HASH: 63e220f88f5217afe1ceb42a5ed1e5d295f69116
                  MATRIX: 656->1|999->27|1100->58|1145->55|1173->75|1201->78|1230->99|1268->100|1300->106|1361->142|1375->148|1444->209|1483->211|1520->222|1534->228|1590->264|1628->275|1643->281|1699->316|1737->327|1752->333|1805->365|1843->376|1858->382|1917->420|1956->432|2053->499
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|49->17
                  -- GENERATED --
              */
          