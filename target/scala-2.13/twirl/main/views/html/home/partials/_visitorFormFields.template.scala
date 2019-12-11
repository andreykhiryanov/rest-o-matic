
package views.html.home.partials

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

object _visitorFormFields extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/helper/*3.8*/.inputText(visitorForm("firstName"), 'class -> "form-control")),format.raw/*3.70*/("""
"""),_display_(/*4.2*/helper/*4.8*/.inputText(visitorForm("lastName"), 'class -> "form-control")),format.raw/*4.69*/("""
"""),_display_(/*5.2*/helper/*5.8*/.inputText(visitorForm("email"), 'class -> "form-control")),format.raw/*5.66*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(visitorForm("phoneNumber"), 'class -> "form-control")))
      }
    }
  }

  def render(visitorForm:Form[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(visitorForm)

  def f:((Form[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (visitorForm) => apply(visitorForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T12:54:51.555
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/partials/_visitorFormFields.scala.html
                  HASH: c007cfd7f460f5c93745c7b32b8f06f91052e824
                  MATRIX: 982->1|1105->29|1135->34|1148->40|1230->102|1258->105|1271->111|1352->172|1380->175|1393->181|1471->239|1499->242|1512->248
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6
                  -- GENERATED --
              */
          