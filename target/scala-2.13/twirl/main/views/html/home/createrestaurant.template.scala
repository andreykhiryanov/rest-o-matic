
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
"""),format.raw/*5.1*/("""<html>
    <head>
        <title>New Restaurant</title>
    </head>
    <body>
        <h1>Create New Restaurant</h1>

        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.HomeController.saveChanges())/*12.67*/ {_display_(Seq[Any](format.raw/*12.69*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(restaurantForm("restaurantName"))),format.raw/*13.64*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(restaurantForm("legalName"))),format.raw/*14.59*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(restaurantForm("inn"))),format.raw/*15.53*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(restaurantForm("address"))),format.raw/*16.57*/("""

            """),format.raw/*18.13*/("""<br>

            <input type="submit" value="Create Restaurant">
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
                  DATE: 2019-12-05T16:48:12.854
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createrestaurant.scala.html
                  HASH: a31b8bf6cfa60a0bb071140c96c7d624332bb428
                  MATRIX: 656->1|1008->30|1115->67|1160->64|1188->84|1216->86|1378->221|1393->227|1453->278|1493->280|1535->295|1550->301|1615->345|1657->360|1672->366|1732->405|1774->420|1789->426|1843->459|1885->474|1900->480|1958->517|2002->533|2115->615|2148->621
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|53->21|54->22
                  -- GENERATED --
              */
          