
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

object editrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.36*/("""
"""),_display_(/*4.2*/layout("Edit Restaurant")/*4.27*/{_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<h1>Edit Restaurant</h1>

    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.RestaurantController.updateRestaurant())/*7.74*/ {_display_(Seq[Any](format.raw/*7.76*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(restaurantForm("restaurantName"))),format.raw/*8.60*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(restaurantForm("legalName"))),format.raw/*9.55*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(restaurantForm("inn"))),format.raw/*10.49*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(restaurantForm("address"))),format.raw/*11.53*/("""

        """),format.raw/*13.9*/("""<br>

        <input type="submit" value="Edit Restaurant">
    """)))}),format.raw/*16.6*/("""
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
                  DATE: 2019-12-10T12:36:49.965
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/editrestaurant.scala.html
                  HASH: 4cbe667d1611dd783487447a02fb3f6cfce18f8d
                  MATRIX: 656->1|1004->28|1111->65|1156->62|1184->83|1217->108|1255->109|1287->115|1345->148|1359->154|1429->216|1468->218|1505->229|1519->235|1583->279|1620->290|1634->296|1693->335|1731->346|1746->352|1800->385|1838->396|1853->402|1911->439|1950->451|2048->519
                  LINES: 24->1|29->2|32->3|35->2|36->4|36->4|36->4|37->5|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          