
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
    <a class="btn btn-danger" href=""""),_display_(/*10.38*/routes/*10.44*/.VisitorController.destroyVisitor(visitor.getFirstName)),format.raw/*10.99*/("""">Remove Visitor</a>

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
                            """),format.raw/*75.29*/("""<option value="""),_display_(/*75.44*/restaurant/*75.54*/.getRestaurantName),format.raw/*75.72*/(""">"""),_display_(/*75.74*/restaurant/*75.84*/.getRestaurantName),format.raw/*75.102*/("""</option>
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
                        """),_display_(/*101.26*/for(restaurant <- visitor.getVisitedRestaurants) yield /*101.74*/ {_display_(Seq[Any](format.raw/*101.76*/("""
                            """),format.raw/*102.29*/("""<option value="""),_display_(/*102.44*/restaurant/*102.54*/.getRestaurantName),format.raw/*102.72*/(""">"""),_display_(/*102.74*/restaurant/*102.84*/.getRestaurantName),format.raw/*102.102*/("""</option>
                        """)))}),format.raw/*103.26*/("""
                    """),format.raw/*104.21*/("""</select>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="forgetRestaurantRequest('"""),_display_(/*109.102*/visitor/*109.109*/.getFirstName),format.raw/*109.122*/("""')">Forget Restaurant</button>
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
                  DATE: 2019-12-13T11:27:20.146
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/visitorcard.scala.html
                  HASH: f8fbd6cb72a7c7dede2e6fb56c1285efe150a9c4
                  MATRIX: 651->1|680->25|1024->45|1173->99|1203->104|1239->132|1277->133|1309->139|1340->144|1355->151|1388->164|1469->219|1483->225|1555->277|1639->334|1654->340|1730->395|1935->573|1951->580|1984->592|2092->673|2108->680|2138->689|2246->770|2262->777|2298->792|2409->877|2459->918|2499->920|2536->930|2639->1006|2655->1013|2689->1026|2718->1027|2827->1106|2862->1114|2935->1160|2999->1208|3039->1210|3081->1224|3144->1260|3159->1266|3251->1336|3282->1339|3302->1349|3342->1367|3412->1406|3445->1412|3540->1481|3576->1508|3615->1509|3652->1519|3832->1669|3871->1681|3947->1731|4000->1775|4040->1777|4077->1787|4258->1938|4297->1950|5103->2729|5152->2762|5192->2764|5250->2794|5292->2809|5311->2819|5350->2837|5379->2839|5398->2849|5438->2867|5505->2903|5555->2925|5869->3211|5886->3218|5921->3231|6845->4127|6910->4175|6951->4177|7010->4207|7053->4222|7073->4232|7113->4250|7143->4252|7163->4262|7204->4280|7272->4316|7323->4338|7639->4625|7657->4632|7693->4645
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|49->18|49->18|49->18|53->22|53->22|53->22|57->26|57->26|57->26|62->31|62->31|62->31|63->32|65->34|65->34|65->34|65->34|68->37|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45|79->48|79->48|79->48|80->49|83->52|85->54|86->55|86->55|86->55|87->56|90->59|92->61|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|106->75|107->76|108->77|113->82|113->82|113->82|132->101|132->101|132->101|133->102|133->102|133->102|133->102|133->102|133->102|133->102|134->103|135->104|140->109|140->109|140->109
                  -- GENERATED --
              */
          