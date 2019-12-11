
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
    <br>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.RestaurantController.saveRestaurantChanges())/*8.79*/ {_display_(Seq[Any](format.raw/*8.81*/("""

        """),_display_(/*10.10*/helper/*10.16*/.inputText(restaurantForm("restaurantName"), 'class -> "form-control")),format.raw/*10.86*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(restaurantForm("legalName"), 'class -> "form-control")),format.raw/*11.81*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(restaurantForm("inn"), 'class -> "form-control")),format.raw/*12.75*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(restaurantForm("address"), 'class -> "form-control")),format.raw/*13.79*/("""

        """),format.raw/*15.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus-sign"></i> Create Restaurant</button>
    """)))}),format.raw/*18.6*/("""
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
                  DATE: 2019-12-11T11:02:17.579
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createrestaurant.scala.html
                  HASH: e9f2e07ec053c64f2667c80eba18a78141e245a5
                  MATRIX: 656->1|1006->28|1113->65|1158->62|1186->82|1214->85|1246->109|1284->110|1316->116|1388->163|1402->169|1477->236|1516->238|1556->251|1571->257|1662->327|1700->338|1715->344|1801->409|1839->420|1854->426|1934->485|1972->496|1987->502|2071->565|2110->577|2281->718
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|47->15|50->18
                  -- GENERATED --
              */
          