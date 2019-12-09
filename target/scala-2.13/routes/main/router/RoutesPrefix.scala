// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/rest-o-matic/conf/routes
// @DATE:Mon Dec 09 18:00:07 GMT+03:00 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
