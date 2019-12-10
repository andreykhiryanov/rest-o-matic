
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
/*1.2*/import models.Restaurant

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
                  DATE: 2019-12-10T12:36:49.947
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createrestaurant.scala.html
                  HASH: 20c555019b7d5a1e2b3b2b105a6314fe5df9d23c
                  MATRIX: 656->1|1006->28|1113->65|1158->62|1186->82|1214->85|1246->109|1284->110|1316->116|1380->155|1394->161|1469->228|1508->230|1545->241|1559->247|1623->291|1661->302|1676->308|1736->347|1774->358|1789->364|1843->397|1881->408|1896->414|1954->451|1993->463|2093->533
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|49->17
                  -- GENERATED --
              */
          