
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

"""),_display_(/*7.2*/layout("Welcome!")/*7.20*/{_display_(Seq[Any](format.raw/*7.21*/("""
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
                  DATE: 2019-12-11T16:51:18.331
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: fa2d3198d2a4ee2172fc528e6681e72689208ea0
                  MATRIX: 656->1|688->28|717->52|1061->72|1214->130|1244->135|1270->153|1308->154|1340->160|1407->201|1439->224|1478->225|1515->235|1669->359|1702->365|1775->411|1821->441|1861->443|1903->457|1966->493|1981->499|2073->569|2104->572|2124->582|2164->600|2234->639|2267->645|2355->707|2384->727|2423->728|2460->738|2611->859|2644->865|2717->911|2757->935|2797->937|2839->951|2902->987|2917->993|2994->1049|3024->1052|3041->1059|3076->1072|3106->1074|3123->1081|3157->1093|3227->1132|3260->1138
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|42->11|47->16|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|53->22|54->23|58->27|58->27|58->27|59->28|64->33|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|70->39|71->40
                  -- GENERATED --
              */
          