
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
                <td><a href=""""),_display_(/*20.31*/routes/*20.37*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*20.107*/("""">"""),_display_(/*20.110*/restaurant/*20.120*/.getRestaurantName),format.raw/*20.138*/("""</a></td>
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
                <td><a href=""""),_display_(/*37.31*/routes/*37.37*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*37.93*/("""">"""),_display_(/*37.96*/visitor/*37.103*/.getFirstName),format.raw/*37.116*/(""" """),_display_(/*37.118*/visitor/*37.125*/.getLastName),format.raw/*37.137*/("""</a></td>
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
                  DATE: 2019-12-11T21:18:49.269
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: ce49b88894cf2b86413ad83ef42f50af80706557
                  MATRIX: 656->1|688->28|717->52|1061->72|1214->130|1244->135|1274->157|1312->158|1344->164|1411->205|1443->228|1482->229|1519->239|1673->363|1706->369|1779->415|1825->445|1865->447|1907->461|1970->497|1985->503|2077->573|2108->576|2128->586|2168->604|2238->643|2271->649|2359->711|2388->731|2427->732|2464->742|2615->863|2648->869|2721->915|2761->939|2801->941|2843->955|2906->991|2921->997|2998->1053|3028->1056|3045->1063|3080->1076|3110->1078|3127->1085|3161->1097|3231->1136|3264->1142
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|42->11|47->16|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|53->22|54->23|58->27|58->27|58->27|59->28|64->33|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|70->39|71->40
                  -- GENERATED --
              */
          