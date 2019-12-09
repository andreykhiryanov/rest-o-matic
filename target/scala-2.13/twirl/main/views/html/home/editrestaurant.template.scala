
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

object editrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.36*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
    <head>
        <title>Edit Restaurant</title>
    </head>
    <body>
        <h1>Edit Restaurant</h1>

        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.HomeController.updateRestaurant())/*12.72*/ {_display_(Seq[Any](format.raw/*12.74*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(restaurantForm("restaurantName"))),format.raw/*13.64*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(restaurantForm("legalName"))),format.raw/*14.59*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(restaurantForm("inn"))),format.raw/*15.53*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(restaurantForm("address"))),format.raw/*16.57*/("""

            """),format.raw/*18.13*/("""<br>

            <input type="submit" value="Edit Restaurant">
            """)))}),format.raw/*21.14*/("""
    """),format.raw/*22.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(restaurantForm:Form[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurantForm)

  def f:((Form[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurantForm) => apply(restaurantForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T17:57:19.346
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/editrestaurant.scala.html
                  HASH: 099749785090862a8bca35efdd8b1e4a889c5c8a
                  MATRIX: 656->1|1006->30|1113->67|1158->64|1186->84|1214->86|1371->216|1386->222|1451->278|1491->280|1533->295|1548->301|1613->345|1655->360|1670->366|1730->405|1772->420|1787->426|1841->459|1883->474|1898->480|1956->517|2000->533|2111->613|2144->619
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|53->21|54->22
                  -- GENERATED --
              */
          