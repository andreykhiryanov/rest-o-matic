
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

object _restaurantFormFields extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/helper/*3.8*/.inputText(restaurantForm("restaurantName"), 'class -> "form-control")),format.raw/*3.78*/("""
"""),_display_(/*4.2*/helper/*4.8*/.inputText(restaurantForm("legalName"), 'class -> "form-control")),format.raw/*4.73*/("""
"""),_display_(/*5.2*/helper/*5.8*/.inputText(restaurantForm("inn"), 'class -> "form-control")),format.raw/*5.67*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(restaurantForm("address"), 'class -> "form-control")))
      }
    }
  }

  def render(restaurantForm:Form[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurantForm)

  def f:((Form[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurantForm) => apply(restaurantForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T15:10:51.028
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/partials/_restaurantFormFields.scala.html
                  HASH: f9c2743339e870935325c802babe8487b1d057a7
                  MATRIX: 988->1|1117->35|1147->40|1160->46|1250->116|1278->119|1291->125|1376->190|1404->193|1417->199|1496->258|1524->261|1537->267
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6
                  -- GENERATED --
              */
          