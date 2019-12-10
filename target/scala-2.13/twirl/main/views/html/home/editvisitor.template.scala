
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

object editvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("Edit Visitor")/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<h1>Edit Visitor</h1>

    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.VisitorController.updateVisitor())/*8.68*/ {_display_(Seq[Any](format.raw/*8.70*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(visitorForm("firstName"))),format.raw/*9.52*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(visitorForm("lastName"))),format.raw/*10.51*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(visitorForm("email"))),format.raw/*11.48*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(visitorForm("phoneNumber"))),format.raw/*12.54*/("""

        """),format.raw/*14.9*/("""<br>

        <input type="submit" value="Edit Visitor">
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
                  DATE: 2019-12-10T09:49:27.774
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/editvisitor.scala.html
                  HASH: 5575d2586a3af85d63765a401d73fc147f44c04b
                  MATRIX: 656->1|997->27|1098->58|1143->55|1171->75|1199->78|1229->100|1267->101|1299->107|1354->137|1368->143|1432->199|1471->201|1508->212|1522->218|1578->254|1616->265|1631->271|1687->306|1725->317|1740->323|1793->355|1831->366|1846->372|1905->410|1944->422|2039->487
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|49->17
                  -- GENERATED --
              */
          