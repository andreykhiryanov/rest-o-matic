
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
/*2.2*/import helper._

object restaurantcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Restaurant,List[Visitor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(restaurant : Restaurant)(newVisitors : List[Visitor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.56*/("""

"""),_display_(/*6.2*/layout(restaurant.getRestaurantName)/*6.38*/{_display_(Seq[Any](format.raw/*6.39*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/restaurant/*7.20*/.getRestaurantName),format.raw/*7.38*/("""</h2>
    """),format.raw/*8.70*/("""
    """),format.raw/*9.5*/("""<br>
    <a class="btn btn-primary" href=""""),_display_(/*10.39*/routes/*10.45*/.RestaurantController.editRestaurant(restaurant.getRestaurantName)),format.raw/*10.111*/("""">Edit Restaurant</a>
    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deletionConfirmModal">Remove Restaurant</button>

    <br><br>

    <table class="table table-striped">
        <tr>
            <th colspan="5">Information</th>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*21.18*/restaurant/*21.28*/.getLegalName),format.raw/*21.41*/("""</td>
        </tr>
        <tr>
            <td>INN</td>
            <td>"""),_display_(/*25.18*/restaurant/*25.28*/.getInn),format.raw/*25.35*/("""</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>"""),_display_(/*29.18*/restaurant/*29.28*/.getAddress),format.raw/*29.39*/("""</td>
        </tr>
    </table>
    <h2>Accepted Visitors</h2>
    <br>
    """),_display_(/*34.6*/if(restaurant.getAcceptedVisitors.isEmpty)/*34.48*/ {_display_(Seq[Any](format.raw/*34.50*/("""
        """),format.raw/*35.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*37.22*/restaurant/*37.32*/.getRestaurantName),format.raw/*37.50*/(""" """),format.raw/*37.51*/("""has not accepted any visitors<td>
            </tr>
        </table>
    """)))}),format.raw/*40.6*/("""

    """),format.raw/*42.5*/("""<table class="table table-striped">
    """),_display_(/*43.6*/for(visitor <- restaurant.getAcceptedVisitors) yield /*43.52*/ {_display_(Seq[Any](format.raw/*43.54*/("""
        """),format.raw/*44.9*/("""<tr>
            <td><a href=""""),_display_(/*45.27*/routes/*45.33*/.VisitorController.showVisitorCard(visitor.getFirstName)),format.raw/*45.89*/("""">"""),_display_(/*45.92*/visitor/*45.99*/.getFirstName),format.raw/*45.112*/(""" """),_display_(/*45.114*/visitor/*45.121*/.getLastName),format.raw/*45.133*/("""</a></td>
        </tr>
    """)))}),format.raw/*47.6*/("""
    """),format.raw/*48.5*/("""</table>

        <!-- Modal window "Accept" start button -->
    """),_display_(/*51.6*/if(!newVisitors.isEmpty())/*51.32*/{_display_(Seq[Any](format.raw/*51.33*/("""
        """),format.raw/*52.9*/("""<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalAccept">
            Accept Visitor
        </button>
    """)))}),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""<!-- Modal window "Kick" start button -->
    """),_display_(/*58.6*/if(!restaurant.getAcceptedVisitors().isEmpty)/*58.51*/{_display_(Seq[Any](format.raw/*58.52*/("""
        """),format.raw/*59.9*/("""<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModalKick">
            Kick Out Visitor
        </button>
    """)))}),format.raw/*62.6*/("""

        """),format.raw/*64.9*/("""<!-- Modal window "Accept" -->
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

                    <select id="acceptVisitor" class="js-data-example-ajax" style="width: 570px">
                        """),_display_(/*77.26*/for(visitor <- newVisitors) yield /*77.53*/ {_display_(Seq[Any](format.raw/*77.55*/("""
                            """),format.raw/*78.29*/("""<option value='"""),_display_(/*78.45*/visitor/*78.52*/.getFirstName),format.raw/*78.65*/("""'>"""),_display_(/*78.68*/visitor/*78.75*/.getFirstName),format.raw/*78.88*/(""" """),_display_(/*78.90*/visitor/*78.97*/.getLastName),format.raw/*78.109*/("""</option>
                        """)))}),format.raw/*79.26*/("""
                    """),format.raw/*80.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="acceptVisitorRequest('"""),_display_(/*85.99*/restaurant/*85.109*/.getRestaurantName),format.raw/*85.127*/("""')">Accept Visitor</button>
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

                    <select id="kickVisitor" class="js-data-example-ajax" style="width: 570px">
                    """),_display_(/*104.22*/for(visitor <- restaurant.getAcceptedVisitors) yield /*104.68*/ {_display_(Seq[Any](format.raw/*104.70*/("""
                        """),format.raw/*105.25*/("""<option value='"""),_display_(/*105.41*/visitor/*105.48*/.getFirstName),format.raw/*105.61*/("""'>"""),_display_(/*105.64*/visitor/*105.71*/.getFirstName),format.raw/*105.84*/(""" """),_display_(/*105.86*/visitor/*105.93*/.getLastName),format.raw/*105.105*/("""</option>
                    """)))}),format.raw/*106.22*/("""
                    """),format.raw/*107.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="kickVisitorRequest('"""),_display_(/*112.97*/restaurant/*112.107*/.getRestaurantName),format.raw/*112.125*/("""')">Kick Out Visitor</button>
                </div>
            </div>
        </div>
    </div>

        <!-- Modal window "Confirm" -->
    <div class="modal fade" id="deletionConfirmModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">

                    <h2 class="modal-title" id="myModalLabel" align="center">Are you sure?</h2>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <a class="btn btn-danger" href=""""),_display_(/*134.54*/routes/*134.60*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*134.129*/("""">Remove Restaurant</a>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(restaurant:Restaurant,newVisitors:List[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)(newVisitors)

  def f:((Restaurant) => (List[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => (newVisitors) => apply(restaurant)(newVisitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-13T16:27:34.701
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/restaurantcard.scala.html
                  HASH: 7c51a4ec06bce6a47d79ab080f0d8266acd0fb26
                  MATRIX: 651->1|683->28|1030->48|1179->102|1209->107|1253->143|1291->144|1323->150|1354->155|1372->165|1410->183|1448->259|1480->265|1551->309|1566->315|1654->381|2034->734|2053->744|2087->757|2193->836|2212->846|2240->853|2350->936|2369->946|2401->957|2510->1040|2561->1082|2601->1084|2638->1094|2741->1170|2760->1180|2799->1198|2828->1199|2935->1276|2970->1284|3038->1326|3100->1372|3140->1374|3177->1384|3236->1416|3251->1422|3328->1478|3358->1481|3374->1488|3409->1501|3439->1503|3456->1510|3490->1522|3551->1553|3584->1559|3680->1629|3715->1655|3754->1656|3791->1666|3970->1815|4005->1823|4079->1871|4133->1916|4172->1917|4209->1927|4387->2075|4426->2087|5235->2869|5278->2896|5318->2898|5376->2928|5419->2944|5435->2951|5469->2964|5499->2967|5515->2974|5549->2987|5578->2989|5594->2996|5628->3008|5695->3044|5745->3066|6056->3350|6076->3360|6116->3378|7023->4257|7086->4303|7127->4305|7182->4331|7226->4347|7243->4354|7278->4367|7309->4370|7326->4377|7361->4390|7391->4392|7408->4399|7443->4411|7507->4443|7558->4465|7868->4747|7889->4757|7930->4775|8962->5779|8978->5785|9070->5854
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|40->9|41->10|41->10|41->10|52->21|52->21|52->21|56->25|56->25|56->25|60->29|60->29|60->29|65->34|65->34|65->34|66->35|68->37|68->37|68->37|68->37|71->40|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|78->47|79->48|82->51|82->51|82->51|83->52|86->55|88->57|89->58|89->58|89->58|90->59|93->62|95->64|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|111->80|116->85|116->85|116->85|135->104|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|137->106|138->107|143->112|143->112|143->112|165->134|165->134|165->134
                  -- GENERATED --
              */
          