
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

object editvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Visitor],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor])(visitorName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import views.html.partials._visitorFormFields


Seq[Any](format.raw/*2.51*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/layout("Edit Visitor")/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<h2>Edit Visitor</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(action = routes.VisitorController.updateVisitor(visitorName))/*9.79*/ {_display_(Seq[Any](format.raw/*9.81*/("""

        """),_display_(/*11.10*/_visitorFormFields(visitorForm)),format.raw/*11.41*/("""

        """),format.raw/*13.9*/("""<br>

        <button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-check"></i> Edit Visitor</button>
    """)))}),format.raw/*16.6*/("""
""")))}))
      }
    }
  }

  def render(visitorForm:Form[Visitor],visitorName:String): play.twirl.api.HtmlFormat.Appendable = apply(visitorForm)(visitorName)

  def f:((Form[Visitor]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (visitorForm) => (visitorName) => apply(visitorForm)(visitorName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-13T12:45:39.592
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/editvisitor.scala.html
                  HASH: aba736ee815e185fd82ee16a8d7608500cf841ad
                  MATRIX: 651->1|997->25|1119->77|1142->95|1217->74|1245->142|1273->145|1303->167|1341->168|1373->174|1436->212|1450->218|1525->285|1564->287|1604->300|1656->331|1695->343|1857->475
                  LINES: 24->1|29->2|32->3|33->4|36->2|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|43->11|43->11|45->13|48->16
                  -- GENERATED --
              */
          