package build.bleep.test

object Formatter {
  def greetAll(names: List[String]): String =
    names.map(Greeting.hello).mkString("\n")
}
