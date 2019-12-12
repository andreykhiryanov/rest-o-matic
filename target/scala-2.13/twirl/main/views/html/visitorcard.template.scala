
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

                    <select name="visit" class="form-control">
                        """),_display_(/*70.26*/for(restaurant <- newRestaurants) yield /*70.59*/ {_display_(Seq[Any](format.raw/*70.61*/("""
                            """),format.raw/*71.29*/("""<option value="""),_display_(/*71.44*/restaurant/*71.54*/.getRestaurantName),format.raw/*71.72*/(""">"""),_display_(/*71.74*/restaurant/*71.84*/.getRestaurantName),format.raw/*71.102*/("""</option>
                        """)))}),format.raw/*72.26*/("""
                    """),format.raw/*73.21*/("""</select>

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

                    <select name="visit" class="form-control">
                        """),_display_(/*97.26*/for(restaurant <- visitor.getVisitedRestaurants) yield /*97.74*/ {_display_(Seq[Any](format.raw/*97.76*/("""
                            """),format.raw/*98.29*/("""<option value="""),_display_(/*98.44*/restaurant/*98.54*/.getRestaurantName),format.raw/*98.72*/(""">"""),_display_(/*98.74*/restaurant/*98.84*/.getRestaurantName),format.raw/*98.102*/("""</option>
                        """)))}),format.raw/*99.26*/("""
                    """),format.raw/*100.21*/("""</select>

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

  def render(visitor:Visitor,newRestaurants:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(visitor)(newRestaurants)

  def f:((Visitor) => (List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (visitor) => (newRestaurants) => apply(visitor)(newRestaurants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-12T23:00:31.862
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/visitorcard.scala.html
                  HASH: 3a8235bce5288f234b31ac86376c5489a40e091e
                  MATRIX: 651->1|680->25|1024->45|1173->99|1203->104|1239->132|1277->133|1309->139|1340->144|1355->151|1388->164|1469->219|1483->225|1555->277|1639->334|1654->340|1730->395|1935->573|1951->580|1984->592|2092->673|2108->680|2138->689|2246->770|2262->777|2298->792|2409->877|2459->918|2499->920|2536->930|2639->1006|2655->1013|2689->1026|2718->1027|2827->1106|2862->1114|2935->1160|2999->1208|3039->1210|3081->1224|3144->1260|3159->1266|3251->1336|3282->1339|3302->1349|3342->1367|3412->1406|3445->1412|4626->2566|4675->2599|4715->2601|4773->2631|4815->2646|4834->2656|4873->2674|4902->2676|4921->2686|4961->2704|5028->2740|5078->2762|6211->3868|6275->3916|6315->3918|6373->3948|6415->3963|6434->3973|6473->3991|6502->3993|6521->4003|6561->4021|6628->4057|6679->4079
                  LINES: 24->1|25->2|30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|49->18|49->18|49->18|53->22|53->22|53->22|57->26|57->26|57->26|62->31|62->31|62->31|63->32|65->34|65->34|65->34|65->34|68->37|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|102->71|102->71|103->72|104->73|128->97|128->97|128->97|129->98|129->98|129->98|129->98|129->98|129->98|129->98|130->99|131->100
                  -- GENERATED --
              */
          