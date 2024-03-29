
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

object createrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantForm: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import views.html.partials._restaurantFormFields


Seq[Any](format.raw/*2.36*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("New Restaurant")/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<h2>Create New Restaurant</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.RestaurantController.saveRestaurantChanges())/*9.79*/ {_display_(Seq[Any](format.raw/*9.81*/("""

        """),_display_(/*11.10*/_restaurantFormFields(restaurantForm)),format.raw/*11.47*/("""

        """),format.raw/*13.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus-sign"></i> Create Restaurant</button>
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
                  DATE: 2019-12-12T19:01:49.586
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/createrestaurant.scala.html
                  HASH: 18cfea7bdf78ca33b686eda03c5c8e52fda63a5a
                  MATRIX: 651->1|1001->28|1108->65|1131->83|1209->62|1237->133|1265->136|1297->160|1335->161|1367->167|1439->214|1453->220|1528->287|1567->289|1607->302|1665->339|1704->351|1875->492
                  LINES: 24->1|29->2|32->3|33->4|36->2|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          