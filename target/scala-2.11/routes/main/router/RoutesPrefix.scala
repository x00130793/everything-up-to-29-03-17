
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/Integrated Project/Janis-up-to-29-03-17/conf/routes
// @DATE:Wed Mar 29 18:50:22 IST 2017


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
