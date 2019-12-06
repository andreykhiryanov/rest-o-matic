
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Set[Restaurant],Set[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(restaurants : Set[Restaurant])(visitors : Set[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.58*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>

        <h1>Welcome to the Rest-o-matic!</h1>

        <h2>All restaurants</h2>

        <input value="New restaurant" type="submit" onclick=""/> <input value="New visitor" type="submit" onclick=""/>
        <br><br>

        """),_display_(/*19.10*/for(restaurant <- restaurants) yield /*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
            """),format.raw/*20.13*/("""<table border="1px solid grey" style="border-collapse: collapse">
                <tr>
                    <th colspan="5" style="text-align:center">Restaurant</th>
                </tr>

                <tr>
                    <td>Name</td>
                    <th style="text-align:left">"""),_display_(/*27.50*/restaurant/*27.60*/.getRestaurantName),format.raw/*27.78*/("""</th>
                </tr>
                <tr>
                    <td>Legal Name</td>
                    <td>"""),_display_(/*31.26*/restaurant/*31.36*/.getLegalName),format.raw/*31.49*/("""</td>
                </tr>
                <tr>
                    <td>INN</td>
                    <td>"""),_display_(/*35.26*/restaurant/*35.36*/.getInn),format.raw/*35.43*/("""</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>"""),_display_(/*39.26*/restaurant/*39.36*/.getAddress),format.raw/*39.47*/("""</td>
                </tr>

                <tr>
                    <th colspan="5" style="text-align:center">Visitors</th>
                </tr>

                """),_display_(/*46.18*/for(visitor <- restaurant.getAcceptedVisitors) yield /*46.64*/ {_display_(Seq[Any](format.raw/*46.66*/("""
                    """),format.raw/*47.21*/("""<tr>
                        <td>"""),_display_(/*48.30*/visitor/*48.37*/.getFirstName),format.raw/*48.50*/("""</td>
                        <td>"""),_display_(/*49.30*/visitor/*49.37*/.getLastName),format.raw/*49.49*/("""</td>
                    </tr>
                """)))}),format.raw/*51.18*/("""
            """),format.raw/*52.13*/("""</table>
            <br>
            """)))}),format.raw/*54.14*/("""

        """),format.raw/*56.9*/("""<h2>All visitors</h2>

        """),_display_(/*58.10*/for(visitor <- visitors) yield /*58.34*/ {_display_(Seq[Any](format.raw/*58.36*/("""
            """),format.raw/*59.13*/("""<table border="1px solid grey" style="border-collapse: collapse">
                <tr>
                    <th colspan="5" style="text-align:center">Visitor</th>
                </tr>

                <tr>
                    <td>First Name</td>
                    <th style="text-align:left">"""),_display_(/*66.50*/visitor/*66.57*/.getFirstName),format.raw/*66.70*/("""</th>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>"""),_display_(/*70.26*/visitor/*70.33*/.getLastName),format.raw/*70.45*/("""</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>"""),_display_(/*74.26*/visitor/*74.33*/.getEmail),format.raw/*74.42*/("""</td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td>"""),_display_(/*78.26*/visitor/*78.33*/.getPhoneNumber),format.raw/*78.48*/("""</td>
                </tr>

                <tr>
                    <th colspan="5" style="text-align:center">Visited restaurants</th>
                </tr>

                """),_display_(/*85.18*/for(restaurant <- visitor.getVisitedRestaurants) yield /*85.66*/ {_display_(Seq[Any](format.raw/*85.68*/("""
                    """),format.raw/*86.21*/("""<tr>
                        <td colspan="5" style="text-align:center">"""),_display_(/*87.68*/restaurant/*87.78*/.getRestaurantName),format.raw/*87.96*/("""</td>
                    </tr>
                """)))}),format.raw/*89.18*/("""
            """),format.raw/*90.13*/("""</table>
            <br>
            """)))}),format.raw/*92.14*/("""

    """),format.raw/*94.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(restaurants:Set[Restaurant],visitors:Set[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)(visitors)

  def f:((Set[Restaurant]) => (Set[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => (visitors) => apply(restaurants)(visitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-06T11:42:42.679
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 7d46210f8210acc7dbd4c5526647925e1788a6ee
                  MATRIX: 656->1|690->30|1040->56|1169->115|1214->112|1242->132|1270->134|1611->448|1657->478|1697->480|1739->494|2065->793|2084->803|2123->821|2268->939|2287->949|2321->962|2459->1073|2478->1083|2506->1090|2648->1205|2667->1215|2699->1226|2899->1399|2961->1445|3001->1447|3051->1469|3113->1504|3129->1511|3163->1524|3226->1560|3242->1567|3275->1579|3357->1630|3399->1644|3471->1685|3510->1697|3571->1731|3611->1755|3651->1757|3693->1771|4022->2073|4038->2080|4072->2093|4216->2210|4232->2217|4265->2229|4405->2342|4421->2349|4451->2358|4591->2471|4607->2478|4643->2493|4854->2677|4918->2725|4958->2727|5008->2749|5108->2822|5127->2832|5166->2850|5248->2901|5290->2915|5362->2956|5397->2964
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|51->19|51->19|51->19|52->20|59->27|59->27|59->27|63->31|63->31|63->31|67->35|67->35|67->35|71->39|71->39|71->39|78->46|78->46|78->46|79->47|80->48|80->48|80->48|81->49|81->49|81->49|83->51|84->52|86->54|88->56|90->58|90->58|90->58|91->59|98->66|98->66|98->66|102->70|102->70|102->70|106->74|106->74|106->74|110->78|110->78|110->78|117->85|117->85|117->85|118->86|119->87|119->87|119->87|121->89|122->90|124->92|126->94
                  -- GENERATED --
              */
          