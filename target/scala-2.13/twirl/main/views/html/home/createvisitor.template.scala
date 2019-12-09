
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

object createvisitor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(visitorForm: Form[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
    <head>
        <title>New Visitor</title>
    </head>
    <body>
        <h1>Create New Visitor</h1>

        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.HomeController.saveVisitorChanges())/*12.74*/ {_display_(Seq[Any](format.raw/*12.76*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(visitorForm("firstName"))),format.raw/*13.56*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(visitorForm("lastName"))),format.raw/*14.55*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(visitorForm("email"))),format.raw/*15.52*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(visitorForm("phoneNumber"))),format.raw/*16.58*/("""

            """),format.raw/*18.13*/("""<br>

            <input type="submit" value="Create Visitor">
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
                  DATE: 2019-12-09T15:57:25.432
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/createvisitor.scala.html
                  HASH: 8700b83c880ce0e0eb449b0dd490859c8481241f
                  MATRIX: 656->1|999->27|1100->58|1145->55|1173->75|1201->77|1357->206|1372->212|1439->270|1479->272|1521->287|1536->293|1593->329|1635->344|1650->350|1706->385|1748->400|1763->406|1816->438|1858->453|1873->459|1932->497|1976->513|2086->592|2119->598
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|53->21|54->22
                  -- GENERATED --
              */
          