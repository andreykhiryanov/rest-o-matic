
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
/*1.2*/import entities.Restaurant

object createrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.36*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("New Restaurant")/*5.26*/{_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<h1>Create New Restaurant</h1>

    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.RestaurantController.saveRestaurantChanges())/*8.79*/ {_display_(Seq[Any](format.raw/*8.81*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(restaurantForm("restaurantName"))),format.raw/*9.60*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(restaurantForm("legalName"))),format.raw/*10.55*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(restaurantForm("inn"))),format.raw/*11.49*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(restaurantForm("address"))),format.raw/*12.53*/("""

        """),format.raw/*14.9*/("""<br>

        <input type="submit" value="Create Restaurant">
    """)))}),format.raw/*17.6*/("""
""")))}))
      }
    }
  }

  def render(restaurantForm:Form[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurantForm)

  def f:((Form[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurantForm) => apply(restaurantForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-10T09:49:27.740
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createrestaurant.scala.html
                  HASH: 72611ab51b3ddb474c2f510cc25d0cf5d0a6afca
                  MATRIX: 656->1|1008->30|1115->67|1160->64|1188->84|1216->87|1248->111|1286->112|1318->118|1382->157|1396->163|1471->230|1510->232|1547->243|1561->249|1625->293|1663->304|1678->310|1738->349|1776->360|1791->366|1845->399|1883->410|1898->416|1956->453|1995->465|2095->535
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|49->17
                  -- GENERATED --
              */
          