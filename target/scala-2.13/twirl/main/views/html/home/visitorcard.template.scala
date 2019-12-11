
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
/*1.2*/import models.Visitor
/*2.2*/import helper._

object visitorcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Visitor,List[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(visitor : Visitor)(restaurants : List[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.53*/("""

"""),_display_(/*6.2*/layout(visitor.getFirstName)/*6.30*/{_display_(Seq[Any](format.raw/*6.31*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/visitor/*7.17*/.getFirstName),format.raw/*7.30*/("""</h2>
    <br>
    <a class="btn btn-primary" href=""""),_display_(/*9.39*/routes/*9.45*/.VisitorController.editVisitor(visitor.getFirstName)),format.raw/*9.97*/("""">Edit Visitor</a> <a class="btn btn-danger" href=""""),_display_(/*9.149*/routes/*9.155*/.VisitorController.destroyVisitor(visitor.getFirstName)),format.raw/*9.210*/("""">Remove Visitor</a>
    <br><br>
    <h2>Information</h2>
    <br>
    <table class="table table-striped">
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*16.18*/visitor/*16.25*/.getLastName),format.raw/*16.37*/("""</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>"""),_display_(/*20.18*/visitor/*20.25*/.getEmail),format.raw/*20.34*/("""</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>"""),_display_(/*24.18*/visitor/*24.25*/.getPhoneNumber),format.raw/*24.40*/("""</td>
        </tr>
    </table>
    <h2>Visited Restaurants</h2>
    <br>
    """),_display_(/*29.6*/if(restaurants.isEmpty)/*29.29*/ {_display_(Seq[Any](format.raw/*29.31*/("""
        """),format.raw/*30.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*32.22*/visitor/*32.29*/.getFirstName),format.raw/*32.42*/(""" """),format.raw/*32.43*/("""has not visited any restaurants<td>
            </tr>
        </table>
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<table class="table table-striped">
        """),_display_(/*38.10*/for(restaurant <- restaurants) yield /*38.40*/ {_display_(Seq[Any](format.raw/*38.42*/("""
            """),format.raw/*39.13*/("""<tr>
                <td><a href=""""),_display_(/*40.31*/routes/*40.37*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*40.107*/("""">"""),_display_(/*40.110*/restaurant/*40.120*/.getRestaurantName),format.raw/*40.138*/("""</a></td>
            </tr>
        """)))}),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</table>

    <a class="btn btn-primary" href="">Visit Restaurant</a> <a class="btn btn-danger" href="">Forget Restaurant</a>
""")))}))
      }
    }
  }

  def render(visitor:Visitor,restaurants:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(visitor)(restaurants)

  def f:((Visitor) => (List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (visitor) => (restaurants) => apply(visitor)(restaurants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-11T18:21:19.099
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: 65366311a90345b16388cd445193fdf7ab12bfdc
                  MATRIX: 656->1|685->25|1029->45|1175->96|1205->101|1241->129|1279->130|1311->136|1342->141|1357->148|1390->161|1471->216|1485->222|1557->274|1636->326|1651->332|1727->387|1930->563|1946->570|1979->582|2087->663|2103->670|2133->679|2241->760|2257->767|2293->782|2404->867|2436->890|2476->892|2513->902|2616->978|2632->985|2666->998|2695->999|2804->1078|2839->1086|2912->1132|2958->1162|2998->1164|3040->1178|3103->1214|3118->1220|3210->1290|3241->1293|3261->1303|3301->1321|3371->1360|3404->1366
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|47->16|47->16|47->16|51->20|51->20|51->20|55->24|55->24|55->24|60->29|60->29|60->29|61->30|63->32|63->32|63->32|63->32|66->35|68->37|69->38|69->38|69->38|70->39|71->40|71->40|71->40|71->40|71->40|71->40|73->42|74->43
                  -- GENERATED --
              */
          