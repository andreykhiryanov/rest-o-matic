
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

object createrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>New Restaurant</title>
    </head>
    <body>
        <h1>Create New Restaurant</h1>

        """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.HomeController.save())/*11.60*/ {_display_(Seq[Any](format.raw/*11.62*/("""
            """),_display_(/*12.14*/helper/*12.20*/.inputText(restaurantForm("RestaurantName"))),format.raw/*12.64*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(restaurantForm("LegalName"))),format.raw/*13.59*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(restaurantForm("INN"))),format.raw/*14.53*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(restaurantForm("Address"))),format.raw/*15.57*/("""

            """),format.raw/*17.13*/("""<br>

            <input type="submit" value="Create Restaurant">
            """)))}),format.raw/*20.14*/("""
    """),format.raw/*21.5*/("""</body>

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
                  DATE: 2019-12-04T18:35:19.568
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createrestaurant.scala.html
                  HASH: 384ff485aee4a9b9c73aa60ad1359858b1ff4e30
                  MATRIX: 974->1|1081->38|1126->35|1154->55|1182->57|1344->192|1359->198|1412->242|1452->244|1494->259|1509->265|1574->309|1616->324|1631->330|1691->369|1733->384|1748->390|1802->423|1844->438|1859->444|1917->481|1961->497|2074->579|2107->585
                  LINES: 28->1|31->2|34->1|35->3|36->4|43->11|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|49->17|52->20|53->21
                  -- GENERATED --
              */
          