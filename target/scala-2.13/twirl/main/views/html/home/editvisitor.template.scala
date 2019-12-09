
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
/*1.2*/import entities.Visitor

object editvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
    <head>
        <title>Edit Visitor</title>
    </head>
    <body>
        <h1>Edit Visitor</h1>

        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.HomeController.updateVisitor())/*12.69*/ {_display_(Seq[Any](format.raw/*12.71*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(visitorForm("firstName"))),format.raw/*13.56*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(visitorForm("lastName"))),format.raw/*14.55*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(visitorForm("email"))),format.raw/*15.52*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(visitorForm("phoneNumber"))),format.raw/*16.58*/("""

            """),format.raw/*18.13*/("""<br>

            <input type="submit" value="Edit Visitor">
            """)))}),format.raw/*21.14*/("""
    """),format.raw/*22.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(visitorForm:Form[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(visitorForm)

  def f:((Form[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (visitorForm) => apply(visitorForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-09T17:57:19.354
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/editvisitor.scala.html
                  HASH: 843dfc0b27eef6feaba8ab1c70276bceb89ee5c3
                  MATRIX: 656->1|997->27|1098->58|1143->55|1171->75|1199->77|1350->201|1365->207|1427->260|1467->262|1509->277|1524->283|1581->319|1623->334|1638->340|1694->375|1736->390|1751->396|1804->428|1846->443|1861->449|1920->487|1964->503|2072->580|2105->586
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|53->21|54->22
                  -- GENERATED --
              */
          