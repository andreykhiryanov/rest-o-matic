
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
/*1.2*/import models.Visitor
/*2.2*/import helper._

object visitorcard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Visitor,List[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(visitor : Visitor)(newRestaurants : List[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.56*/("""

"""),_display_(/*6.2*/layout(visitor.getFirstName)/*6.30*/{_display_(Seq[Any](format.raw/*6.31*/("""
    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/visitor/*7.17*/.getFirstName),format.raw/*7.30*/("""</h2>
    <br>
    <a class="btn btn-primary" href=""""),_display_(/*9.39*/routes/*9.45*/.VisitorController.editVisitor(visitor.getFirstName)),format.raw/*9.97*/("""">Edit Visitor</a>
    <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deletionConfirmModal">Remove Visitor</button>

    <br><br>
    <h2>Information</h2>
    <br>
    <table class="table table-striped">
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*18.18*/visitor/*18.25*/.getLastName),format.raw/*18.37*/("""</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>"""),_display_(/*22.18*/visitor/*22.25*/.getEmail),format.raw/*22.34*/("""</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>"""),_display_(/*26.18*/visitor/*26.25*/.getPhoneNumber),format.raw/*26.40*/("""</td>
        </tr>
    </table>
    <h2>Visited Restaurants</h2>
    <br>
    """),_display_(/*31.6*/if(visitor.getVisitedRestaurants.isEmpty)/*31.47*/ {_display_(Seq[Any](format.raw/*31.49*/("""
        """),format.raw/*32.9*/("""<table class="table table-striped">
            <tr>
                <td>"""),_display_(/*34.22*/visitor/*34.29*/.getFirstName),format.raw/*34.42*/(""" """),format.raw/*34.43*/("""has not visited any restaurants<td>
            </tr>
        </table>
    """)))}),format.raw/*37.6*/("""

    """),format.raw/*39.5*/("""<table class="table table-striped">
        """),_display_(/*40.10*/for(restaurant <- visitor.getVisitedRestaurants) yield /*40.58*/ {_display_(Seq[Any](format.raw/*40.60*/("""
            """),format.raw/*41.13*/("""<tr>
                <td><a href=""""),_display_(/*42.31*/routes/*42.37*/.RestaurantController.showRestaurantCard(restaurant.getRestaurantName)),format.raw/*42.107*/("""">"""),_display_(/*42.110*/restaurant/*42.120*/.getRestaurantName),format.raw/*42.138*/("""</a></td>
            </tr>
        """)))}),format.raw/*44.10*/("""
    """),format.raw/*45.5*/("""</table>

        <!-- Modal window "Visit" start button -->
    """),_display_(/*48.6*/if(!newRestaurants.isEmpty)/*48.33*/{_display_(Seq[Any](format.raw/*48.34*/("""
        """),format.raw/*49.9*/("""<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalVisit">
            Visit Restaurant
        </button>
    """)))}),format.raw/*52.6*/("""

        """),format.raw/*54.9*/("""<!-- Modal window "Forget" start button -->
    """),_display_(/*55.6*/if(!visitor.getVisitedRestaurants().isEmpty)/*55.50*/ {_display_(Seq[Any](format.raw/*55.52*/("""
        """),format.raw/*56.9*/("""<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModalForget">
            Forget Restaurant
        </button>
    """)))}),format.raw/*59.6*/("""

        """),format.raw/*61.9*/("""<!-- Modal window "Visit" -->
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

                    <select id="visitRestaurant" class="js-data-example-ajax" style="width: 570px">
                        """),_display_(/*74.26*/for(restaurant <- newRestaurants) yield /*74.59*/ {_display_(Seq[Any](format.raw/*74.61*/("""
                            """),format.raw/*75.29*/("""<option value='"""),_display_(/*75.45*/restaurant/*75.55*/.getRestaurantName),format.raw/*75.73*/("""'>"""),_display_(/*75.76*/restaurant/*75.86*/.getRestaurantName),format.raw/*75.104*/("""</option>
                        """)))}),format.raw/*76.26*/("""
                    """),format.raw/*77.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="visitRestaurantRequest('"""),_display_(/*82.101*/visitor/*82.108*/.getFirstName),format.raw/*82.121*/("""')">Visit Restaurant</button>
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

                    <select id="forgetRestaurant" class="js-data-example-ajax" style="width: 570px">
                    """),_display_(/*101.22*/for(restaurant <- visitor.getVisitedRestaurants) yield /*101.70*/ {_display_(Seq[Any](format.raw/*101.72*/("""
                        """),format.raw/*102.25*/("""<option value='"""),_display_(/*102.41*/restaurant/*102.51*/.getRestaurantName),format.raw/*102.69*/("""'>"""),_display_(/*102.72*/restaurant/*102.82*/.getRestaurantName),format.raw/*102.100*/("""</option>
                    """)))}),format.raw/*103.22*/("""
                    """),format.raw/*104.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="forgetRestaurantRequest('"""),_display_(/*109.102*/visitor/*109.109*/.getFirstName),format.raw/*109.122*/("""')">Forget Restaurant</button>
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
                    <a class="btn btn-danger" href=""""),_display_(/*131.54*/routes/*131.60*/.VisitorController.destroyVisitor(visitor.getFirstName)),format.raw/*131.115*/("""">Remove Visitor</a>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(visitor:Visitor,newRestaurants:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(visitor)(newRestaurants)

  def f:((Visitor) => (List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (visitor) => (newRestaurants) => apply(visitor)(newRestaurants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-13T16:31:14.117
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/visitorcard.scala.html
                  HASH: 201437ac98cdd0745f4f71d62070864baa1baafc
                  MATRIX: 651->1|680->25|1024->45|1173->99|1203->104|1239->132|1277->133|1309->139|1340->144|1355->151|1388->164|1469->219|1483->225|1555->277|1888->583|1904->590|1937->602|2045->683|2061->690|2091->699|2199->780|2215->787|2251->802|2362->887|2412->928|2452->930|2489->940|2592->1016|2608->1023|2642->1036|2671->1037|2780->1116|2815->1124|2888->1170|2952->1218|2992->1220|3034->1234|3097->1270|3112->1276|3204->1346|3235->1349|3255->1359|3295->1377|3365->1416|3398->1422|3493->1491|3529->1518|3568->1519|3605->1529|3785->1679|3824->1691|3900->1741|3953->1785|3993->1787|4030->1797|4211->1948|4250->1960|5056->2739|5105->2772|5145->2774|5203->2804|5246->2820|5265->2830|5304->2848|5334->2851|5353->2861|5393->2879|5460->2915|5510->2937|5824->3223|5841->3230|5876->3243|6796->4135|6861->4183|6902->4185|6957->4211|7001->4227|7021->4237|7061->4255|7092->4258|7112->4268|7153->4286|7217->4318|7268->4340|7584->4627|7602->4634|7638->4647|8671->5652|8687->5658|8765->5713
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|49->18|49->18|49->18|53->22|53->22|53->22|57->26|57->26|57->26|62->31|62->31|62->31|63->32|65->34|65->34|65->34|65->34|68->37|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45|79->48|79->48|79->48|80->49|83->52|85->54|86->55|86->55|86->55|87->56|90->59|92->61|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|106->75|107->76|108->77|113->82|113->82|113->82|132->101|132->101|132->101|133->102|133->102|133->102|133->102|133->102|133->102|133->102|134->103|135->104|140->109|140->109|140->109|162->131|162->131|162->131
                  -- GENERATED --
              */
          