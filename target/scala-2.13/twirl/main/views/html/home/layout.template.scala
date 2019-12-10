
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(body : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>"""),_display_(/*4.17*/title),format.raw/*4.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*5.54*/routes/*5.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*5.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/bootstrap-theme.min.css")),format.raw/*6.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.101*/("""">

        <link rel="icon" type="">

    </head>
    <body>
        <div class="container">
            """),_display_(/*14.14*/body),format.raw/*14.18*/("""
        """),format.raw/*15.9*/("""</div>

        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*17.81*/(""""></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*18.78*/(""""></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/main.js")),format.raw/*19.69*/(""""></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-10T17:49:10.823
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/layout.scala.html
                  HASH: fd0302f03da832f8679a7f028022839f43bb6b3a
                  MATRIX: 959->1|1083->30|1111->32|1173->68|1198->73|1287->136|1301->142|1372->192|1455->249|1469->255|1546->311|1629->368|1643->374|1705->415|1846->529|1871->533|1908->543|1967->575|1982->581|2055->633|2117->668|2132->674|2202->723|2264->758|2279->764|2340->804
                  LINES: 28->1|33->1|34->2|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|46->14|46->14|47->15|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19
                  -- GENERATED --
              */
          