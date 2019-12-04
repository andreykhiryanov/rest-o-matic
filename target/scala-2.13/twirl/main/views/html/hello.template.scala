
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

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/main("Hello")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<section id="content">
        <div class="wrapper doc">
            <article>
                <h2>Hello, """),_display_(/*7.29*/name),format.raw/*7.33*/("""!</h2>
            </article>
            <aside>
            """),_display_(/*10.14*/commonSidebar()),format.raw/*10.29*/("""
            """),format.raw/*11.13*/("""</aside>
        </div>
    </section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-03T21:20:17.328
                  SOURCE: D:/Java/Projects/play-example/app/views/hello.scala.html
                  HASH: 3b507853fd36e4bb13f4a3b7cd55ac8e3a995331
                  MATRIX: 948->1|1057->15|1087->20|1108->33|1147->35|1179->41|1315->151|1339->155|1432->221|1468->236|1510->250
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|39->7|39->7|42->10|42->10|43->11
                  -- GENERATED --
              */
          