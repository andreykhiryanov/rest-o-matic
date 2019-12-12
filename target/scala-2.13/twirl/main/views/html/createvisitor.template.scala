
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
/*1.2*/import models.Visitor

object createvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import views.html.partials._visitorFormFields


Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("New Visitor")/*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<h2>Create New Visitor</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.VisitorController.saveVisitorChanges())/*9.73*/ {_display_(Seq[Any](format.raw/*9.75*/("""

        """),_display_(/*11.10*/_visitorFormFields(visitorForm)),format.raw/*11.41*/("""

        """),format.raw/*13.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus-sign"></i> Create Visitor</button>
    """)))}),format.raw/*16.6*/("""
""")))}))
      }
    }
  }

  def render(visitorForm:Form[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(visitorForm)

  def f:((Form[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (visitorForm) => apply(visitorForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-12T19:01:49.603
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/createvisitor.scala.html
                  HASH: 04a27d4e7784d41f25981616b3cb8aeb3bb2f8f9
                  MATRIX: 651->1|992->25|1093->56|1116->74|1191->53|1219->121|1247->124|1276->145|1314->146|1346->152|1415->196|1429->202|1498->263|1537->265|1577->278|1629->309|1668->321|1836->459
                  LINES: 24->1|29->2|32->3|33->4|36->2|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          