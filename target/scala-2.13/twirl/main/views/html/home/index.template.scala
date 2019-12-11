
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
    <table border="1px solid grey" style="border-collapse: collapse">
        """),_display_(/*11.10*/for(restaurant <- restaurants) yield /*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
            """),format.raw/*12.13*/("""<tr>
                <td><a href=""""),_display_(/*13.31*/routes/*13.37*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*13.107*/("""">"""),_display_(/*13.110*/restaurant/*13.120*/.getRestaurantName),format.raw/*13.138*/("""</a></td>
            </tr>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</table>
    <br>
    <h2>All Visitors</h2>
    <br>
    <table border="1px solid grey" style="border-collapse: collapse">
        """),_display_(/*21.10*/for(visitor <- visitors) yield /*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
            """),format.raw/*22.13*/("""<tr>
                <td><a href=""""),_display_(/*23.31*/routes/*23.37*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*23.93*/("""">"""),_display_(/*23.96*/visitor/*23.103*/.getFirstName),format.raw/*23.116*/(""" """),_display_(/*23.118*/visitor/*23.125*/.getLastName),format.raw/*23.137*/("""</a></td>
            </tr>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</table>
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
                  DATE: 2019-12-11T12:56:57.655
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 0de6aa30f4062741f554e5e9f1ea889beb4075e9
                  MATRIX: 656->1|688->28|717->52|1061->72|1214->130|1244->135|1270->153|1308->154|1340->160|1483->276|1529->306|1569->308|1611->322|1674->358|1689->364|1781->434|1812->437|1832->447|1872->465|1942->504|1975->510|2139->647|2179->671|2219->673|2261->687|2324->723|2339->729|2416->785|2446->788|2463->795|2498->808|2528->810|2545->817|2579->829|2649->868|2682->874
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|38->7|38->7|39->8|42->11|42->11|42->11|43->12|44->13|44->13|44->13|44->13|44->13|44->13|46->15|47->16|52->21|52->21|52->21|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|56->25|57->26
                  -- GENERATED --
              */
          