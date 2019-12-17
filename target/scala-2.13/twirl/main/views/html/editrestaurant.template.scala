
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

object editrestaurant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Restaurant],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantForm: Form[Restaurant])(restaurantId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import views.html.partials._restaurantFormFields


Seq[Any](format.raw/*2.56*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("Edit Restaurant")/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<h2>Edit Restaurant</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.RestaurantController.updateRestaurant(restaurantId))/*9.86*/ {_display_(Seq[Any](format.raw/*9.88*/("""

        """),_display_(/*11.10*/_restaurantFormFields(restaurantForm)),format.raw/*11.47*/("""

        """),format.raw/*13.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-check"></i> Edit Restaurant</button>
    """)))}),format.raw/*16.6*/("""
""")))}))
      }
    }
  }

  def render(restaurantForm:Form[Restaurant],restaurantId:Long): play.twirl.api.HtmlFormat.Appendable = apply(restaurantForm)(restaurantId)

  def f:((Form[Restaurant]) => (Long) => play.twirl.api.HtmlFormat.Appendable) = (restaurantForm) => (restaurantId) => apply(restaurantForm)(restaurantId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T19:59:46.755
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/editrestaurant.scala.html
                  HASH: 62ef15e243a44d2f03ce65e3d6abb104e0609099
                  MATRIX: 651->1|1004->28|1131->85|1154->103|1232->82|1260->153|1288->156|1321->181|1359->182|1391->188|1457->229|1471->235|1553->309|1592->311|1632->324|1690->361|1729->373|1894->508
                  LINES: 24->1|29->2|32->3|33->4|36->2|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          