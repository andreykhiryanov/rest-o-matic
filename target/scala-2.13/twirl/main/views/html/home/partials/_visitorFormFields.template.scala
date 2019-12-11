
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

"""),_display_(/*3.2*/helper/*3.8*/.inputText(visitorForm("firstName"), '_label -> "First Name", 'class -> "form-control")),format.raw/*3.95*/("""
"""),_display_(/*4.2*/helper/*4.8*/.inputText(visitorForm("lastName"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*4.93*/("""
"""),_display_(/*5.2*/helper/*5.8*/.inputText(visitorForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*5.86*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(visitorForm("phoneNumber"), '_label -> "Phone Number", 'class -> "form-control")))
      }
    }
  }

  def render(visitorForm:Form[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(visitorForm)

  def f:((Form[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (visitorForm) => apply(visitorForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T20:43:46.294
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/partials/_visitorFormFields.scala.html
                  HASH: d52ebf663aa5bac9685a8644cfaec953ebd3536c
                  MATRIX: 982->1|1105->29|1135->34|1148->40|1255->127|1283->130|1296->136|1401->221|1429->224|1442->230|1540->308|1568->311|1581->317
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6
                  -- GENERATED --
              */
          