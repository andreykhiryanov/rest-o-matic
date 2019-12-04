
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurants : Set[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>

        <h1>Welcome to the Rest-o-matic!</h1>

        <h2>All Restaurants</h2>

        """),_display_(/*13.10*/for(restaurant <- restaurants) yield /*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<a href="#">"""),_display_(/*14.26*/restaurant/*14.36*/.getRestaurantName),format.raw/*14.54*/("""</a>
            <p>Legal Name: """),_display_(/*15.29*/restaurant/*15.39*/.getLegalName),format.raw/*15.52*/("""</p>
            <p>INN: """),_display_(/*16.22*/restaurant/*16.32*/.getInn),format.raw/*16.39*/("""</p>
            <p>Address: """),_display_(/*17.26*/restaurant/*17.36*/.getAddress),format.raw/*17.47*/("""</p>
        """)))}),format.raw/*18.10*/("""

    """),format.raw/*20.5*/("""</body>

    <br>

    <input value="Add New Restaurant" type="button" onclick="create()"/>

</html>"""))
      }
    }
  }

  def render(restaurants:Set[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurants)

  def f:((Set[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurants) => apply(restaurants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-04T15:17:52.905
                  SOURCE: D:/Java/Projects/rest-o-matic/app/views/home/index.scala.html
                  HASH: 28007c369205b7aaef29089dbddb71d2b96bee66
                  MATRIX: 962->1|1088->32|1118->36|1319->210|1365->240|1405->242|1447->256|1487->269|1506->279|1545->297|1606->331|1625->341|1659->354|1713->381|1732->391|1760->398|1818->429|1837->439|1869->450|1915->465|1950->473
                  LINES: 28->1|33->1|35->3|45->13|45->13|45->13|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|52->20
                  -- GENERATED --
              */
          