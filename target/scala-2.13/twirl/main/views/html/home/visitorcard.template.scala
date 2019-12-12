
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
  def apply/*4.2*/(visitor : Visitor)(allRestaurants : List[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.56*/("""

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
    """),_display_(/*29.6*/if(visitor.getVisitedRestaurants.isEmpty)/*29.47*/ {_display_(Seq[Any](format.raw/*29.49*/("""
        """),format.raw/*30.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*32.22*/visitor/*32.29*/.getFirstName),format.raw/*32.42*/(""" """),format.raw/*32.43*/("""has not visited any restaurants<td>
            </tr>
        </table>
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<table class="table table-striped">
        """),_display_(/*38.10*/for(restaurant <- visitor.getVisitedRestaurants) yield /*38.58*/ {_display_(Seq[Any](format.raw/*38.60*/("""
            """),format.raw/*39.13*/("""<tr>
                <td><a href=""""),_display_(/*40.31*/routes/*40.37*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*40.107*/("""">"""),_display_(/*40.110*/restaurant/*40.120*/.getRestaurantName),format.raw/*40.138*/("""</a></td>
            </tr>
        """)))}),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</table>

        <!-- Modal window "Visit" start button -->
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalVisit">
        Visit Restaurant
    </button>

        <!-- Modal window "Forget" start button -->
    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModalForget">
        Forget Restaurant
    </button>

        <!-- Modal window "Visit" -->
    <div class="modal fade" id="myModalVisit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">Choose a restaurant to visit</h4>
                </div>
                <div class="modal-body">

                    ...

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Visit Restaurant</button>
                </div>
            </div>
        </div>
    </div>

        <!-- Modal window "Forget" -->
    <div class="modal fade" id="myModalForget" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">Choose a restaurant to forget</h4>
                </div>
                <div class="modal-body">

                    ...

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Forget Restaurant</button>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(visitor:Visitor,allRestaurants:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(visitor)(allRestaurants)

  def f:((Visitor) => (List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (visitor) => (allRestaurants) => apply(visitor)(allRestaurants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-12T09:01:13.349
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/visitorcard.scala.html
                  HASH: fb88d54186b158e26c2e0e12d175ae36531d08fe
                  MATRIX: 656->1|685->25|1029->45|1178->99|1208->104|1244->132|1282->133|1314->139|1345->144|1360->151|1393->164|1474->219|1488->225|1560->277|1639->329|1654->335|1730->390|1933->566|1949->573|1982->585|2090->666|2106->673|2136->682|2244->763|2260->770|2296->785|2407->870|2457->911|2497->913|2534->923|2637->999|2653->1006|2687->1019|2716->1020|2825->1099|2860->1107|2933->1153|2997->1201|3037->1203|3079->1217|3142->1253|3157->1259|3249->1329|3280->1332|3300->1342|3340->1360|3410->1399|3443->1405
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|47->16|47->16|47->16|51->20|51->20|51->20|55->24|55->24|55->24|60->29|60->29|60->29|61->30|63->32|63->32|63->32|63->32|66->35|68->37|69->38|69->38|69->38|70->39|71->40|71->40|71->40|71->40|71->40|71->40|73->42|74->43
                  -- GENERATED --
              */
          