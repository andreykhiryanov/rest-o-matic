
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
/*2.2*/import helper._

object restaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Restaurant,List[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(restaurant : Restaurant)(allVisitors : List[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.56*/("""

"""),_display_(/*6.2*/layout(restaurant.getRestaurantName)/*6.38*/{_display_(Seq[Any](format.raw/*6.39*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/restaurant/*7.20*/.getRestaurantName),format.raw/*7.38*/("""</h2>
    <br>
    <a class="btn btn-primary" href=""""),_display_(/*9.39*/routes/*9.45*/.RestaurantController.editRestaurant(restaurant.getRestaurantName)),format.raw/*9.111*/("""">Edit Restaurant</a> <a class="btn btn-danger" href=""""),_display_(/*9.166*/routes/*9.172*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*9.241*/("""">Remove Restaurant</a>

    <br><br>

    <table class="table table-striped">
        <tr>
            <th colspan="5">Information</th>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*19.18*/restaurant/*19.28*/.getLegalName),format.raw/*19.41*/("""</td>
        </tr>
        <tr>
            <td>INN</td>
            <td>"""),_display_(/*23.18*/restaurant/*23.28*/.getInn),format.raw/*23.35*/("""</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>"""),_display_(/*27.18*/restaurant/*27.28*/.getAddress),format.raw/*27.39*/("""</td>
        </tr>
    </table>
    <h2>Accepted Visitors</h2>
    <br>
    """),_display_(/*32.6*/if(restaurant.getAcceptedVisitors.isEmpty)/*32.48*/ {_display_(Seq[Any](format.raw/*32.50*/("""
        """),format.raw/*33.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*35.22*/restaurant/*35.32*/.getRestaurantName),format.raw/*35.50*/(""" """),format.raw/*35.51*/("""has not accepted any visitors<td>
            </tr>
        </table>
    """)))}),format.raw/*38.6*/("""

    """),format.raw/*40.5*/("""<table class="table table-striped">
    """),_display_(/*41.6*/for(visitor <- restaurant.getAcceptedVisitors) yield /*41.52*/ {_display_(Seq[Any](format.raw/*41.54*/("""
        """),format.raw/*42.9*/("""<tr>
            <td><a href=""""),_display_(/*43.27*/routes/*43.33*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*43.89*/("""">"""),_display_(/*43.92*/visitor/*43.99*/.getFirstName),format.raw/*43.112*/(""" """),_display_(/*43.114*/visitor/*43.121*/.getLastName),format.raw/*43.133*/("""</a></td>
        </tr>
    """)))}),format.raw/*45.6*/("""
    """),format.raw/*46.5*/("""</table>

        <!-- Modal window "Accept" start button -->
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalAccept">
        Accept Visitor
    </button>

    <!-- Modal window "Kick" start button -->
    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModalKick">
        Kick Out Visitor
    </button>

        <!-- Modal window "Accept" -->
    <div class="modal fade" id="myModalAccept" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">Select a visitor to be accepted</h4>
                </div>
                <div class="modal-body">

                    <select name="accept" class="form-control">
                        """),_display_(/*71.26*/for(visitor <- allVisitors) yield /*71.53*/ {_display_(Seq[Any](format.raw/*71.55*/("""
                            """),format.raw/*72.29*/("""<option value="""),_display_(/*72.44*/visitor/*72.51*/.getFirstName),format.raw/*72.64*/(""">"""),_display_(/*72.66*/visitor/*72.73*/.getFirstName),format.raw/*72.86*/(""" """),_display_(/*72.88*/visitor/*72.95*/.getLastName),format.raw/*72.107*/("""</option>
                        """)))}),format.raw/*73.26*/("""
                    """),format.raw/*74.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Accept Visitor</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Modal window "Kick" -->
    <div class="modal fade" id="myModalKick" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">Select the visitor to be kicked</h4>
                </div>
                <div class="modal-body">

                    ...

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Kick Out Visitor</button>
                </div>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(restaurant:Restaurant,allVisitors:List[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)(allVisitors)

  def f:((Restaurant) => (List[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => (allVisitors) => apply(restaurant)(allVisitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-12T09:01:13.334
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/restaurantcard.scala.html
                  HASH: 5679781ab358755dbca1efa0bd9fc93398aea9a3
                  MATRIX: 656->1|688->28|1035->48|1184->102|1214->107|1258->143|1296->144|1328->150|1359->155|1377->165|1415->183|1496->238|1510->244|1597->310|1679->365|1694->371|1784->440|2033->662|2052->672|2086->685|2192->764|2211->774|2239->781|2349->864|2368->874|2400->885|2509->968|2560->1010|2600->1012|2637->1022|2740->1098|2759->1108|2798->1126|2827->1127|2934->1204|2969->1212|3037->1254|3099->1300|3139->1302|3176->1312|3235->1344|3250->1350|3327->1406|3357->1409|3373->1416|3408->1429|3438->1431|3455->1438|3489->1450|3550->1481|3583->1487|4761->2638|4804->2665|4844->2667|4902->2697|4944->2712|4960->2719|4994->2732|5023->2734|5039->2741|5073->2754|5102->2756|5118->2763|5152->2775|5219->2811|5269->2833
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|40->9|40->9|40->9|50->19|50->19|50->19|54->23|54->23|54->23|58->27|58->27|58->27|63->32|63->32|63->32|64->33|66->35|66->35|66->35|66->35|69->38|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|76->45|77->46|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|104->73|105->74
                  -- GENERATED --
              */
          