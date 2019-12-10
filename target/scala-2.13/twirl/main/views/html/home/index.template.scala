
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
/*1.2*/import entities.Restaurant
/*2.2*/import entities.Visitor
/*3.2*/import helper._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Set[Restaurant],Set[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(restaurants : Set[Restaurant])(visitors : Set[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.58*/("""

"""),_display_(/*7.2*/layout("Welcome!")/*7.20*/{_display_(Seq[Any](format.raw/*7.21*/("""
    """),format.raw/*8.5*/("""<h1>Welcome to the Rest-o-matic!</h1>

    <input value="New restaurant" type="button" onclick="window.location.href='"""),_display_(/*10.81*/routes/*10.87*/.RestaurantController.createRestaurant()),format.raw/*10.127*/("""'"/> <input value="New visitor" type="button" onclick="window.location.href='"""),_display_(/*10.205*/routes/*10.211*/.VisitorController.createVisitor()),format.raw/*10.245*/("""'"/>
    <br>

    <h2>All restaurants</h2>

    <table border="1px solid grey" style="border-collapse: collapse">
        <tr>
            <th>Restaurants</th>
        </tr>
        """),_display_(/*19.10*/for(restaurant <- restaurants) yield /*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
            """),format.raw/*20.13*/("""<tr>
                <td style="text-align:center"><a href=""""),_display_(/*21.57*/routes/*21.63*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*21.133*/("""">"""),_display_(/*21.136*/restaurant/*21.146*/.getRestaurantName),format.raw/*21.164*/("""</a></td>
            </tr>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</table>

    <h2>All visitors</h2>

    <table border="1px solid grey" style="border-collapse: collapse">
        <tr>
            <th>Visitors</th>
        </tr>
        """),_display_(/*32.10*/for(visitor <- visitors) yield /*32.34*/ {_display_(Seq[Any](format.raw/*32.36*/("""
            """),format.raw/*33.13*/("""<tr>
                <td style="text-align:center"><a href=""""),_display_(/*34.57*/routes/*34.63*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*34.119*/("""">"""),_display_(/*34.122*/visitor/*34.129*/.getFirstName),format.raw/*34.142*/(""" """),_display_(/*34.144*/visitor/*34.151*/.getLastName),format.raw/*34.163*/("""</a></td>
            </tr>
        """)))}),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</table>
""")))}))
      }
    }
  }

  def render(restaurants:Set[Restaurant],visitors:Set[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)(visitors)

  def f:((Set[Restaurant]) => (Set[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => (visitors) => apply(restaurants)(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-10T09:49:27.782
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 7dbfdcd95b51be15ef955f08047e00f154ef444a
                  MATRIX: 656->1|690->30|721->56|1063->76|1214->132|1244->137|1270->155|1308->156|1340->162|1488->283|1503->289|1565->329|1671->407|1687->413|1743->447|1963->640|2009->670|2049->672|2091->686|2180->748|2195->754|2287->824|2318->827|2338->837|2378->855|2448->894|2481->900|2689->1081|2729->1105|2769->1107|2811->1121|2900->1183|2915->1189|2993->1245|3024->1248|3041->1255|3076->1268|3106->1270|3123->1277|3157->1289|3227->1328|3260->1334
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|41->10|41->10|41->10|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|52->21|54->23|55->24|63->32|63->32|63->32|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|67->36|68->37
                  -- GENERATED --
              */
          