
package views.html.home.reserve

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

        <header>
            <div class="navbar navbar-default">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#exnav">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.HomeController.greetings()),format.raw/*23.68*/("""" class="navbar-brand">Rest-o-matic</a>
                    </div>
                    <div class="collapse navbar-collapse"  id="exnav">
                        <ul class="nav navbar-nav navbar-left">
                            <li><a href=""""),_display_(/*27.43*/routes/*27.49*/.RestaurantController.createRestaurant()),format.raw/*27.89*/("""">
                                <i class="glyphicon glyphicon-plus"></i>
                                Create Restaurant</a></li>
                            <li><a href=""""),_display_(/*30.43*/routes/*30.49*/.VisitorController.createVisitor()),format.raw/*30.83*/("""">
                                <i class="glyphicon glyphicon-plus"></i>
                                Create Visitor</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </header>
        <br><br><br><br><br><br>
        <div class="container">
            """),_display_(/*40.14*/body),format.raw/*40.18*/("""
        """),format.raw/*41.9*/("""</div>

        <script src=""""),_display_(/*43.23*/routes/*43.29*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*43.81*/(""""></script>
        <script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*44.78*/(""""></script>
        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.versioned("javascripts/main.js")),format.raw/*45.69*/(""""></script>
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
                  DATE: 2019-12-11T12:57:27.034
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/reserve/layout.scala.html
                  HASH: fddb0060a683be7a55c219811febdd7696be4561
                  MATRIX: 967->1|1091->30|1119->32|1181->68|1206->73|1295->136|1309->142|1380->192|1463->249|1477->255|1554->311|1637->368|1651->374|1713->415|2330->1005|2345->1011|2393->1038|2668->1286|2683->1292|2744->1332|2951->1512|2966->1518|3021->1552|3385->1889|3410->1893|3447->1903|3506->1935|3521->1941|3594->1993|3656->2028|3671->2034|3741->2083|3803->2118|3818->2124|3879->2164
                  LINES: 28->1|33->1|34->2|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|55->23|55->23|55->23|59->27|59->27|59->27|62->30|62->30|62->30|72->40|72->40|73->41|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45
                  -- GENERATED --
              */
          