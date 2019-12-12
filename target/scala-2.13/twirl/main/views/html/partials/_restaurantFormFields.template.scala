
package views.html.partials

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

object _restaurantFormFields extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/helper/*3.8*/.inputText(restaurantForm("restaurantName"), '_label -> "Restaurant Name", 'class -> "form-control")),format.raw/*3.108*/("""
"""),_display_(/*4.2*/helper/*4.8*/.inputText(restaurantForm("legalName"), '_label -> "Legal Name", 'class -> "form-control")),format.raw/*4.98*/("""
"""),_display_(/*5.2*/helper/*5.8*/.inputText(restaurantForm("inn"), '_label -> "INN", 'class -> "form-control")),format.raw/*5.85*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(restaurantForm("address"), '_label -> "Address", 'class -> "form-control")))
      }
    }
  }

  def render(restaurantForm:Form[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurantForm)

  def f:((Form[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurantForm) => apply(restaurantForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-12T19:00:50.834
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/partials/_restaurantFormFields.scala.html
                  HASH: 52323584ed59a6654f206f3c3a74d22e4ba2ee5b
                  MATRIX: 983->1|1112->35|1142->40|1155->46|1276->146|1304->149|1317->155|1427->245|1455->248|1468->254|1565->331|1593->334|1606->340
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6
                  -- GENERATED --
              */
          