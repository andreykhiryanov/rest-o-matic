
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
/*2.2*/import models.Visitor
/*3.2*/import helper._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Restaurant],List[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(restaurants : List[Restaurant])(visitors : List[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.60*/("""

"""),_display_(/*7.2*/layout("Rest-o-matic")/*7.24*/{_display_(Seq[Any](format.raw/*7.25*/("""
    """),format.raw/*8.5*/("""<h2>All Restaurants</h2>
    <br>
    """),_display_(/*10.6*/if(restaurants.isEmpty)/*10.29*/{_display_(Seq[Any](format.raw/*10.30*/("""
        """),format.raw/*11.9*/("""<table>
            <tr>
                <td>There are no restaurants yet</td>
            </tr>
        </table>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""<table class="table table-striped">
        """),_display_(/*18.10*/for(restaurant <- restaurants) yield /*18.40*/ {_display_(Seq[Any](format.raw/*18.42*/("""
            """),format.raw/*19.13*/("""<tr>
                <td><a href=""""),_display_(/*20.31*/routes/*20.37*/.RestaurantController.showRestaurantCard(restaurant.getId)),format.raw/*20.95*/("""">"""),_display_(/*20.98*/restaurant/*20.108*/.getRestaurantName),format.raw/*20.126*/("""</a></td>
            </tr>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</table>
    <br>
    <h2>All Visitors</h2>
    <br>
    """),_display_(/*27.6*/if(visitors.isEmpty)/*27.26*/{_display_(Seq[Any](format.raw/*27.27*/("""
        """),format.raw/*28.9*/("""<table>
            <tr>
                <td>There are no visitors yet</td>
            </tr>
        </table>
    """)))}),format.raw/*33.6*/("""
    """),format.raw/*34.5*/("""<table class="table table-striped">
        """),_display_(/*35.10*/for(visitor <- visitors) yield /*35.34*/ {_display_(Seq[Any](format.raw/*35.36*/("""
            """),format.raw/*36.13*/("""<tr>
                <td><a href=""""),_display_(/*37.31*/routes/*37.37*/.VisitorController.showVisitorCard(visitor.getId)),format.raw/*37.86*/("""">"""),_display_(/*37.89*/visitor/*37.96*/.getFirstName),format.raw/*37.109*/(""" """),_display_(/*37.111*/visitor/*37.118*/.getLastName),format.raw/*37.130*/("""</a></td>
            </tr>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</table>
""")))}))
      }
    }
  }

  def render(restaurants:List[Restaurant],visitors:List[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)(visitors)

  def f:((List[Restaurant]) => (List[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => (visitors) => apply(restaurants)(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-17T20:39:05.520
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/index.scala.html
                  HASH: f2b43ac90cc5a1ef3f683c7e31f73ea781522bf1
                  MATRIX: 651->1|683->28|712->52|1056->72|1209->130|1239->135|1269->157|1307->158|1339->164|1406->205|1438->228|1477->229|1514->239|1668->363|1701->369|1774->415|1820->445|1860->447|1902->461|1965->497|1980->503|2059->561|2089->564|2109->574|2149->592|2219->631|2252->637|2340->699|2369->719|2408->720|2445->730|2596->851|2629->857|2702->903|2742->927|2782->929|2824->943|2887->979|2902->985|2972->1034|3002->1037|3018->1044|3053->1057|3083->1059|3100->1066|3134->1078|3204->1117|3237->1123
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|42->11|47->16|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|53->22|54->23|58->27|58->27|58->27|59->28|64->33|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|70->39|71->40
                  -- GENERATED --
              */
          