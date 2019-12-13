
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/select2.min.css")),format.raw/*8.108*/("""">

        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/ico/restaurant-15-512-260813.png" +
                "")),format.raw/*11.20*/("""'>
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
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.HomeController.greetings()),format.raw/*24.68*/("""" class="navbar-brand">Rest-o-matic</a>
                    </div>
                    <div class="collapse navbar-collapse"  id="exnav">
                        <ul class="nav navbar-nav navbar-left">
                            <li><a href=""""),_display_(/*28.43*/routes/*28.49*/.RestaurantController.createRestaurant()),format.raw/*28.89*/("""">
                                <i class="glyphicon glyphicon-plus"></i>
                                Create Restaurant</a></li>
                            <li><a href=""""),_display_(/*31.43*/routes/*31.49*/.VisitorController.createVisitor()),format.raw/*31.83*/("""">
                                <i class="glyphicon glyphicon-plus"></i>
                                Create Visitor</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </header>
        <br><br><br><br><br><br>
        <div class="container">
            """),_display_(/*41.14*/body),format.raw/*41.18*/("""
        """),format.raw/*42.9*/("""</div>

        <script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.versioned("javascripts/jquery-3.4.1.min.js")),format.raw/*44.81*/(""""></script>
        <script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*45.78*/(""""></script>
        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.versioned("javascripts/main.js")),format.raw/*46.69*/(""""></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("javascripts/select2.min.js")),format.raw/*47.76*/(""""></script>
        <script>$("#acceptVisitor").select2()</script>
        <script>$("#kickVisitor").select2()</script>
        <script>$("#visitRestaurant").select2()</script>
        <script>$("#forgetRestaurant").select2()</script>
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
                  DATE: 2019-12-13T21:56:42.105
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/layout.scala.html
                  HASH: e8e75619cb744b12e0015c5711b8cc52bc714e02
                  MATRIX: 954->1|1078->30|1106->32|1168->68|1193->73|1282->136|1296->142|1367->192|1450->249|1464->255|1541->311|1624->368|1638->374|1700->415|1783->472|1797->478|1866->526|1957->590|1972->596|2075->678|2653->1229|2668->1235|2716->1262|2991->1510|3006->1516|3067->1556|3274->1736|3289->1742|3344->1776|3708->2113|3733->2117|3770->2127|3829->2159|3844->2165|3917->2217|3979->2252|3994->2258|4064->2307|4126->2342|4141->2348|4202->2388|4264->2423|4279->2429|4347->2476
                  LINES: 28->1|33->1|34->2|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|43->11|56->24|56->24|56->24|60->28|60->28|60->28|63->31|63->31|63->31|73->41|73->41|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47
                  -- GENERATED --
              */
          