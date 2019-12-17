
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
    <br>
    <a class="btn btn-primary" href=""""),_display_(/*9.39*/routes/*9.45*/.RestaurantController.editRestaurant(restaurant.getId)),format.raw/*9.99*/("""">Edit Restaurant</a>
    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deletionConfirmModal">Remove Restaurant</button>

    <br><br>

    <table class="table table-striped">
        <tr>
            <th colspan="5">Information</th>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*20.18*/restaurant/*20.28*/.getLegalName),format.raw/*20.41*/("""</td>
        </tr>
        <tr>
            <td>INN</td>
            <td>"""),_display_(/*24.18*/restaurant/*24.28*/.getInn),format.raw/*24.35*/("""</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>"""),_display_(/*28.18*/restaurant/*28.28*/.getAddress),format.raw/*28.39*/("""</td>
        </tr>
    </table>
    <h2>Accepted Visitors</h2>
    <br>
    """),_display_(/*33.6*/if(restaurant.getAcceptedVisitors.isEmpty)/*33.48*/ {_display_(Seq[Any](format.raw/*33.50*/("""
        """),format.raw/*34.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*36.22*/restaurant/*36.32*/.getRestaurantName),format.raw/*36.50*/(""" """),format.raw/*36.51*/("""has not accepted any visitors<td>
            </tr>
        </table>
    """)))}),format.raw/*39.6*/("""

    """),format.raw/*41.5*/("""<table class="table table-striped">
    """),_display_(/*42.6*/for(visitor <- restaurant.getAcceptedVisitors) yield /*42.52*/ {_display_(Seq[Any](format.raw/*42.54*/("""
        """),format.raw/*43.9*/("""<tr>
            <td><a href=""""),_display_(/*44.27*/routes/*44.33*/.VisitorController.showVisitorCard(visitor.getId)),format.raw/*44.82*/("""">"""),_display_(/*44.85*/visitor/*44.92*/.getFirstName),format.raw/*44.105*/(""" """),_display_(/*44.107*/visitor/*44.114*/.getLastName),format.raw/*44.126*/("""</a></td>
        </tr>
    """)))}),format.raw/*46.6*/("""
    """),format.raw/*47.5*/("""</table>

        <!-- Modal window "Accept" start button -->
    """),_display_(/*50.6*/if(!newVisitors.isEmpty())/*50.32*/{_display_(Seq[Any](format.raw/*50.33*/("""
        """),format.raw/*51.9*/("""<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalAccept">
            Accept Visitor
        </button>
    """)))}),format.raw/*54.6*/("""

    """),format.raw/*56.5*/("""<!-- Modal window "Kick" start button -->
    """),_display_(/*57.6*/if(!restaurant.getAcceptedVisitors().isEmpty)/*57.51*/{_display_(Seq[Any](format.raw/*57.52*/("""
        """),format.raw/*58.9*/("""<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModalKick">
            Kick Out Visitor
        </button>
    """)))}),format.raw/*61.6*/("""

        """),format.raw/*63.9*/("""<!-- Modal window "Accept" -->
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
                        """),_display_(/*76.26*/for(visitor <- newVisitors) yield /*76.53*/ {_display_(Seq[Any](format.raw/*76.55*/("""
                            """),format.raw/*77.29*/("""<option value='"""),_display_(/*77.45*/visitor/*77.52*/.getId),format.raw/*77.58*/("""'>"""),_display_(/*77.61*/visitor/*77.68*/.getFirstName),format.raw/*77.81*/(""" """),_display_(/*77.83*/visitor/*77.90*/.getLastName),format.raw/*77.102*/("""</option>
                        """)))}),format.raw/*78.26*/("""
                    """),format.raw/*79.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="acceptVisitorRequest('"""),_display_(/*84.99*/restaurant/*84.109*/.getId),format.raw/*84.115*/("""')">Accept Visitor</button>
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
                    """),_display_(/*103.22*/for(visitor <- restaurant.getAcceptedVisitors) yield /*103.68*/ {_display_(Seq[Any](format.raw/*103.70*/("""
                        """),format.raw/*104.25*/("""<option value='"""),_display_(/*104.41*/visitor/*104.48*/.getId),format.raw/*104.54*/("""'>"""),_display_(/*104.57*/visitor/*104.64*/.getFirstName),format.raw/*104.77*/(""" """),_display_(/*104.79*/visitor/*104.86*/.getLastName),format.raw/*104.98*/("""</option>
                    """)))}),format.raw/*105.22*/("""
                    """),format.raw/*106.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="kickVisitorRequest('"""),_display_(/*111.97*/restaurant/*111.107*/.getId),format.raw/*111.113*/("""')">Kick Out Visitor</button>
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
                    <button type="button" class="btn btn-danger" onclick="sendDeleteRequest('"""),_display_(/*133.95*/routes/*133.101*/.RestaurantController.destroyRestaurant(restaurant.getId)),format.raw/*133.158*/("""', '"""),_display_(/*133.163*/routes/*133.169*/.HomeController.greetings()),format.raw/*133.196*/("""')">Remove Restaurant</button>
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
                  DATE: 2019-12-17T21:06:43.058
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/restaurantcard.scala.html
                  HASH: ee6a8d49d6f73b72cb0c1e74d59a5e84c113b935
                  MATRIX: 651->1|683->28|1030->48|1179->102|1209->107|1253->143|1291->144|1323->150|1354->155|1372->165|1410->183|1491->238|1505->244|1579->298|1959->651|1978->661|2012->674|2118->753|2137->763|2165->770|2275->853|2294->863|2326->874|2435->957|2486->999|2526->1001|2563->1011|2666->1087|2685->1097|2724->1115|2753->1116|2860->1193|2895->1201|2963->1243|3025->1289|3065->1291|3102->1301|3161->1333|3176->1339|3246->1388|3276->1391|3292->1398|3327->1411|3357->1413|3374->1420|3408->1432|3469->1463|3502->1469|3598->1539|3633->1565|3672->1566|3709->1576|3888->1725|3923->1733|3997->1781|4051->1826|4090->1827|4127->1837|4305->1985|4344->1997|5153->2779|5196->2806|5236->2808|5294->2838|5337->2854|5353->2861|5380->2867|5410->2870|5426->2877|5460->2890|5489->2892|5505->2899|5539->2911|5606->2947|5656->2969|5967->3253|5987->3263|6015->3269|6922->4148|6985->4194|7026->4196|7081->4222|7125->4238|7142->4245|7170->4251|7201->4254|7218->4261|7253->4274|7283->4276|7300->4283|7334->4295|7398->4327|7449->4349|7759->4631|7780->4641|7809->4647|8882->5692|8899->5698|8979->5755|9013->5760|9030->5766|9080->5793
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|51->20|51->20|51->20|55->24|55->24|55->24|59->28|59->28|59->28|64->33|64->33|64->33|65->34|67->36|67->36|67->36|67->36|70->39|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|77->46|78->47|81->50|81->50|81->50|82->51|85->54|87->56|88->57|88->57|88->57|89->58|92->61|94->63|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|110->79|115->84|115->84|115->84|134->103|134->103|134->103|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|136->105|137->106|142->111|142->111|142->111|164->133|164->133|164->133|164->133|164->133|164->133
                  -- GENERATED --
              */
          