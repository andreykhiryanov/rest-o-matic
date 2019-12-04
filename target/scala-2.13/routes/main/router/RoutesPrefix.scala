// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Java/Projects/play-example/conf/routes
// @DATE:Tue Dec 03 21:20:17 GMT+03:00 2019


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
