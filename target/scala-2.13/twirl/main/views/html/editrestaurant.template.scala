
package views.html

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

object editrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Restaurant],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantForm: Form[Restaurant])(restaurantName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import views.html.partials._restaurantFormFields


Seq[Any](format.raw/*2.60*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("Edit Restaurant")/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<h2>Edit Restaurant</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.RestaurantController.updateRestaurant(restaurantName))/*9.88*/ {_display_(Seq[Any](format.raw/*9.90*/("""

        """),_display_(/*11.10*/_restaurantFormFields(restaurantForm)),format.raw/*11.47*/("""

        """),format.raw/*13.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-check"></i> Edit Restaurant</button>
    """)))}),format.raw/*16.6*/("""
""")))}))
      }
    }
  }

  def render(restaurantForm:Form[Restaurant],restaurantName:String): play.twirl.api.HtmlFormat.Appendable = apply(restaurantForm)(restaurantName)

  def f:((Form[Restaurant]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (restaurantForm) => (restaurantName) => apply(restaurantForm)(restaurantName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-13T12:40:44.744
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/editrestaurant.scala.html
                  HASH: 23e2fe40133737ef52547576ace4dfab116b076c
                  MATRIX: 651->1|1006->28|1137->89|1160->107|1238->86|1266->157|1294->160|1327->185|1365->186|1397->192|1463->233|1477->239|1561->315|1600->317|1640->330|1698->367|1737->379|1902->514
                  LINES: 24->1|29->2|32->3|33->4|36->2|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          