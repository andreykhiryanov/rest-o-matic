
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
/*1.2*/import models.Visitor

object editvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import views.html.home.partials._visitorFormFields


Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("Edit Visitor")/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<h2>Edit Visitor</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.VisitorController.updateVisitor())/*9.68*/ {_display_(Seq[Any](format.raw/*9.70*/("""

        """),_display_(/*11.10*/_visitorFormFields(visitorForm)),format.raw/*11.41*/("""

        """),format.raw/*13.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-check"></i> Edit Visitor</button>
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
                  DATE: 2019-12-11T12:54:51.539
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/editvisitor.scala.html
                  HASH: fdea320ee0c47f4207728dca35eddef22a29e27a
                  MATRIX: 656->1|995->25|1096->56|1119->74|1199->53|1227->126|1255->129|1285->151|1323->152|1355->158|1418->196|1432->202|1496->258|1535->260|1575->273|1627->304|1666->316|1828->448
                  LINES: 24->1|29->2|32->3|33->4|36->2|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          