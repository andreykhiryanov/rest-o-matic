
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
    <a class="btn btn-danger" href=""""),_display_(/*11.38*/routes/*11.44*/.RestaurantController.destroyRestaurant(restaurant.getRestaurantName)),format.raw/*11.113*/("""">Remove Restaurant</a>

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

                    <select id="acceptVisitor" class="form-control">
                        """),_display_(/*75.26*/for(visitor <- newVisitors) yield /*75.53*/ {_display_(Seq[Any](format.raw/*75.55*/("""
                            """),format.raw/*76.29*/("""<option value="""),_display_(/*76.44*/visitor/*76.51*/.getFirstName),format.raw/*76.64*/(""">"""),_display_(/*76.66*/visitor/*76.73*/.getFirstName),format.raw/*76.86*/(""" """),_display_(/*76.88*/visitor/*76.95*/.getLastName),format.raw/*76.107*/("""</option>
                        """)))}),format.raw/*77.26*/("""
                    """),format.raw/*78.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="acceptVisitorRequest('"""),_display_(/*83.99*/restaurant/*83.109*/.getRestaurantName),format.raw/*83.127*/("""')">Accept Visitor</button>
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

                    <select name="kick" class="form-control">
                    """),_display_(/*102.22*/for(visitor <- restaurant.getAcceptedVisitors) yield /*102.68*/ {_display_(Seq[Any](format.raw/*102.70*/("""
                        """),format.raw/*103.25*/("""<option value="""),_display_(/*103.40*/visitor/*103.47*/.getFirstName),format.raw/*103.60*/(""">"""),_display_(/*103.62*/visitor/*103.69*/.getFirstName),format.raw/*103.82*/(""" """),_display_(/*103.84*/visitor/*103.91*/.getLastName),format.raw/*103.103*/("""</option>
                    """)))}),format.raw/*104.22*/("""
                    """),format.raw/*105.21*/("""</select>

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

  def render(restaurant:Restaurant,newVisitors:List[Visitor]): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)(newVisitors)

  def f:((Restaurant) => (List[Visitor]) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => (newVisitors) => apply(restaurant)(newVisitors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-12T23:45:04.758
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/restaurantcard.scala.html
                  HASH: 298018dfa4961e6c9676afa6b095495524d68e96
                  MATRIX: 651->1|683->28|1030->48|1179->102|1209->107|1253->143|1291->144|1323->150|1354->155|1372->165|1410->183|1448->259|1480->265|1551->309|1566->315|1654->381|1741->441|1756->447|1847->516|2096->738|2115->748|2149->761|2255->840|2274->850|2302->857|2412->940|2431->950|2463->961|2572->1044|2623->1086|2663->1088|2700->1098|2803->1174|2822->1184|2861->1202|2890->1203|2997->1280|3032->1288|3100->1330|3162->1376|3202->1378|3239->1388|3298->1420|3313->1426|3390->1482|3420->1485|3436->1492|3471->1505|3501->1507|3518->1514|3552->1526|3613->1557|3646->1563|3742->1633|3777->1659|3816->1660|3853->1670|4032->1819|4067->1827|5039->2772|5082->2799|5122->2801|5180->2831|5222->2846|5238->2853|5272->2866|5301->2868|5317->2875|5351->2888|5380->2890|5396->2897|5430->2909|5497->2945|5547->2967|5858->3251|5878->3261|5918->3279|6791->4124|6854->4170|6895->4172|6950->4198|6993->4213|7010->4220|7045->4233|7075->4235|7092->4242|7127->4255|7157->4257|7174->4264|7209->4276|7273->4308|7324->4330
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|40->9|41->10|41->10|41->10|42->11|42->11|42->11|52->21|52->21|52->21|56->25|56->25|56->25|60->29|60->29|60->29|65->34|65->34|65->34|66->35|68->37|68->37|68->37|68->37|71->40|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|78->47|79->48|82->51|82->51|82->51|83->52|86->55|88->57|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|107->76|107->76|107->76|107->76|108->77|109->78|114->83|114->83|114->83|133->102|133->102|133->102|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|135->104|136->105
                  -- GENERATED --
              */
          